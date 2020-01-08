organization := "org.scalablytyped.slinky"
name := "jimp__plugins"
version := "0.8.5-c178f9"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "jimp__core" % "0.8.5-4ca07f",
  "org.scalablytyped.slinky" %%% "jimp__plugin-blit" % "0.8.5-39209a",
  "org.scalablytyped.slinky" %%% "jimp__plugin-blur" % "0.8.5-3cef5c",
  "org.scalablytyped.slinky" %%% "jimp__plugin-color" % "0.8.5-5bff5a",
  "org.scalablytyped.slinky" %%% "jimp__plugin-contain" % "0.8.5-565a7b",
  "org.scalablytyped.slinky" %%% "jimp__plugin-cover" % "0.8.5-9838f0",
  "org.scalablytyped.slinky" %%% "jimp__plugin-crop" % "0.8.5-d336a9",
  "org.scalablytyped.slinky" %%% "jimp__plugin-displace" % "0.8.5-0f5c32",
  "org.scalablytyped.slinky" %%% "jimp__plugin-dither" % "0.8.5-12f50a",
  "org.scalablytyped.slinky" %%% "jimp__plugin-flip" % "0.8.5-566d78",
  "org.scalablytyped.slinky" %%% "jimp__plugin-gaussian" % "0.8.5-d2ca83",
  "org.scalablytyped.slinky" %%% "jimp__plugin-invert" % "0.8.5-8c8f9a",
  "org.scalablytyped.slinky" %%% "jimp__plugin-mask" % "0.8.5-078aae",
  "org.scalablytyped.slinky" %%% "jimp__plugin-normalize" % "0.8.5-09c6c8",
  "org.scalablytyped.slinky" %%% "jimp__plugin-print" % "0.8.5-08cd3d",
  "org.scalablytyped.slinky" %%% "jimp__plugin-resize" % "0.8.5-337b2f",
  "org.scalablytyped.slinky" %%% "jimp__plugin-rotate" % "0.8.5-90928f",
  "org.scalablytyped.slinky" %%% "jimp__plugin-scale" % "0.8.5-9e245b",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        