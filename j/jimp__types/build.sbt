organization := "org.scalablytyped.slinky"
name := "jimp__types"
version := "0.8.5-383b4a"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "jimp__bmp" % "0.8.5-e77138",
  "org.scalablytyped.slinky" %%% "jimp__core" % "0.8.5-22afb4",
  "org.scalablytyped.slinky" %%% "jimp__gif" % "0.8.5-e45856",
  "org.scalablytyped.slinky" %%% "jimp__jpeg" % "0.8.5-d71849",
  "org.scalablytyped.slinky" %%% "jimp__png" % "0.8.5-7a1453",
  "org.scalablytyped.slinky" %%% "jimp__tiff" % "0.8.5-1b0c80",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
