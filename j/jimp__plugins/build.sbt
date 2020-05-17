organization := "org.scalablytyped.slinky"
name := "jimp__plugins"
version := "0.8.5-c0018a"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "jimp__core" % "0.8.5-22afb4",
  "org.scalablytyped.slinky" %%% "jimp__plugin-blit" % "0.8.5-c70f92",
  "org.scalablytyped.slinky" %%% "jimp__plugin-blur" % "0.8.5-11c4b5",
  "org.scalablytyped.slinky" %%% "jimp__plugin-color" % "0.8.5-2b6f19",
  "org.scalablytyped.slinky" %%% "jimp__plugin-contain" % "0.8.5-e1d768",
  "org.scalablytyped.slinky" %%% "jimp__plugin-cover" % "0.8.5-b00893",
  "org.scalablytyped.slinky" %%% "jimp__plugin-crop" % "0.8.5-ad7895",
  "org.scalablytyped.slinky" %%% "jimp__plugin-displace" % "0.8.5-39e599",
  "org.scalablytyped.slinky" %%% "jimp__plugin-dither" % "0.8.5-e0e367",
  "org.scalablytyped.slinky" %%% "jimp__plugin-flip" % "0.8.5-98fb57",
  "org.scalablytyped.slinky" %%% "jimp__plugin-gaussian" % "0.8.5-d94522",
  "org.scalablytyped.slinky" %%% "jimp__plugin-invert" % "0.8.5-8c635c",
  "org.scalablytyped.slinky" %%% "jimp__plugin-mask" % "0.8.5-d7233c",
  "org.scalablytyped.slinky" %%% "jimp__plugin-normalize" % "0.8.5-f11820",
  "org.scalablytyped.slinky" %%% "jimp__plugin-print" % "0.8.5-f52973",
  "org.scalablytyped.slinky" %%% "jimp__plugin-resize" % "0.8.5-a9ddd4",
  "org.scalablytyped.slinky" %%% "jimp__plugin-rotate" % "0.8.5-12c3b7",
  "org.scalablytyped.slinky" %%% "jimp__plugin-scale" % "0.8.5-237d86",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
