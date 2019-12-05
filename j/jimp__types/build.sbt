organization := "org.scalablytyped.slinky"
name := "jimp__types"
version := "0.8.5-406f80"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "jimp__bmp" % "0.8.5-85194e",
  "org.scalablytyped.slinky" %%% "jimp__core" % "0.8.5-77e60e",
  "org.scalablytyped.slinky" %%% "jimp__gif" % "0.8.5-912e85",
  "org.scalablytyped.slinky" %%% "jimp__jpeg" % "0.8.5-ba6366",
  "org.scalablytyped.slinky" %%% "jimp__png" % "0.8.5-2a15e5",
  "org.scalablytyped.slinky" %%% "jimp__tiff" % "0.8.5-9d7657",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        