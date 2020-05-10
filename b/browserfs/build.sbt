organization := "org.scalablytyped.slinky"
name := "browserfs"
version := "1.4.3-3b2c2b"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "dropboxjs" % "0.0-unknown-dt-20200226Z-3d1a63",
  "org.scalablytyped.slinky" %%% "filesystem" % "0.0-unknown-dt-20200225Z-1135be",
  "org.scalablytyped.slinky" %%% "filewriter" % "0.0-unknown-dt-20200226Z-d5082d",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
