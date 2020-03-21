organization := "org.scalablytyped.slinky"
name := "jimp__types"
version := "0.8.5-2bf1b0"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "jimp__bmp" % "0.8.5-1401c9",
  "org.scalablytyped.slinky" %%% "jimp__core" % "0.8.5-21f495",
  "org.scalablytyped.slinky" %%% "jimp__gif" % "0.8.5-0754bb",
  "org.scalablytyped.slinky" %%% "jimp__jpeg" % "0.8.5-6b4700",
  "org.scalablytyped.slinky" %%% "jimp__png" % "0.8.5-d05eb0",
  "org.scalablytyped.slinky" %%% "jimp__tiff" % "0.8.5-8aff91",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
