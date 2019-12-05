organization := "org.scalablytyped.slinky"
name := "jimp__plugins"
version := "0.8.5-567967"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "jimp__core" % "0.8.5-77e60e",
  "org.scalablytyped.slinky" %%% "jimp__plugin-blit" % "0.8.5-bf3489",
  "org.scalablytyped.slinky" %%% "jimp__plugin-blur" % "0.8.5-ffa633",
  "org.scalablytyped.slinky" %%% "jimp__plugin-color" % "0.8.5-9daa26",
  "org.scalablytyped.slinky" %%% "jimp__plugin-contain" % "0.8.5-15af92",
  "org.scalablytyped.slinky" %%% "jimp__plugin-cover" % "0.8.5-5a1735",
  "org.scalablytyped.slinky" %%% "jimp__plugin-crop" % "0.8.5-e78d59",
  "org.scalablytyped.slinky" %%% "jimp__plugin-displace" % "0.8.5-67338b",
  "org.scalablytyped.slinky" %%% "jimp__plugin-dither" % "0.8.5-593fe6",
  "org.scalablytyped.slinky" %%% "jimp__plugin-flip" % "0.8.5-e49783",
  "org.scalablytyped.slinky" %%% "jimp__plugin-gaussian" % "0.8.5-a565fa",
  "org.scalablytyped.slinky" %%% "jimp__plugin-invert" % "0.8.5-2c2573",
  "org.scalablytyped.slinky" %%% "jimp__plugin-mask" % "0.8.5-4635ff",
  "org.scalablytyped.slinky" %%% "jimp__plugin-normalize" % "0.8.5-7e4b76",
  "org.scalablytyped.slinky" %%% "jimp__plugin-print" % "0.8.5-6164bb",
  "org.scalablytyped.slinky" %%% "jimp__plugin-resize" % "0.8.5-66cecc",
  "org.scalablytyped.slinky" %%% "jimp__plugin-rotate" % "0.8.5-a1870e",
  "org.scalablytyped.slinky" %%% "jimp__plugin-scale" % "0.8.5-b7c8a0",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        