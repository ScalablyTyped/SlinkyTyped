organization := "org.scalablytyped.slinky"
name := "electron-builder"
version := "21.2.0-55119b"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "app-builder-lib" % "21.2.0-91f07d",
  "org.scalablytyped.slinky" %%% "builder-util" % "21.2.0-1c9655",
  "org.scalablytyped.slinky" %%% "builder-util-runtime" % "8.3.0-58d3f3",
  "org.scalablytyped.slinky" %%% "debug" % "4.1-dt-20200226Z-c08a13",
  "org.scalablytyped.slinky" %%% "electron-publish" % "21.2.0-2f873e",
  "org.scalablytyped.slinky" %%% "fs-extra" % "8.1-dt-20200218Z-994c6e",
  "org.scalablytyped.slinky" %%% "lazy-val" % "1.0.4-474ed7",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "temp-file" % "3.3.4-124c5c",
  "org.scalablytyped.slinky" %%% "yargs" % "15.0-dt-20200225Z-d2a309",
  "org.scalablytyped.slinky" %%% "yargs-parser" % "15.0-dt-20200113Z-86c59a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
