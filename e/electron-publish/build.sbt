organization := "org.scalablytyped.slinky"
name := "electron-publish"
version := "21.2.0-186ab0"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "builder-util" % "21.2.0-53b920",
  "org.scalablytyped.slinky" %%% "builder-util-runtime" % "8.3.0-743feb",
  "org.scalablytyped.slinky" %%% "debug" % "4.1-dt-20200226Z-645012",
  "org.scalablytyped.slinky" %%% "fs-extra" % "8.1-dt-20200218Z-7890c8",
  "org.scalablytyped.slinky" %%% "lazy-val" % "1.0.4-5fba3a",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e",
  "org.scalablytyped.slinky" %%% "temp-file" % "3.3.4-558d18")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
