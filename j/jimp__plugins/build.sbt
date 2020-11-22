organization := "org.scalablytyped.slinky"
name := "jimp__plugins"
version := "0.16.1-ee48b4"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "jimp__core" % "0.16.1-890415",
  "org.scalablytyped.slinky" %%% "jimp__plugin-blit" % "0.16.1-f7f01a",
  "org.scalablytyped.slinky" %%% "jimp__plugin-blur" % "0.16.1-0d025b",
  "org.scalablytyped.slinky" %%% "jimp__plugin-circle" % "0.16.1-d94cb3",
  "org.scalablytyped.slinky" %%% "jimp__plugin-color" % "0.16.1-0464e0",
  "org.scalablytyped.slinky" %%% "jimp__plugin-contain" % "0.16.1-1b98a7",
  "org.scalablytyped.slinky" %%% "jimp__plugin-cover" % "0.16.1-c4d5dd",
  "org.scalablytyped.slinky" %%% "jimp__plugin-crop" % "0.16.1-cfff7e",
  "org.scalablytyped.slinky" %%% "jimp__plugin-displace" % "0.16.1-89f363",
  "org.scalablytyped.slinky" %%% "jimp__plugin-dither" % "0.16.1-93e0ae",
  "org.scalablytyped.slinky" %%% "jimp__plugin-fisheye" % "0.16.1-7fb2ad",
  "org.scalablytyped.slinky" %%% "jimp__plugin-flip" % "0.16.1-002c59",
  "org.scalablytyped.slinky" %%% "jimp__plugin-gaussian" % "0.16.1-2d15f5",
  "org.scalablytyped.slinky" %%% "jimp__plugin-invert" % "0.16.1-0f85c9",
  "org.scalablytyped.slinky" %%% "jimp__plugin-mask" % "0.16.1-03c26c",
  "org.scalablytyped.slinky" %%% "jimp__plugin-normalize" % "0.16.1-b390f8",
  "org.scalablytyped.slinky" %%% "jimp__plugin-print" % "0.16.1-586815",
  "org.scalablytyped.slinky" %%% "jimp__plugin-resize" % "0.16.1-9ec87a",
  "org.scalablytyped.slinky" %%% "jimp__plugin-rotate" % "0.16.1-a48801",
  "org.scalablytyped.slinky" %%% "jimp__plugin-scale" % "0.16.1-6114ce",
  "org.scalablytyped.slinky" %%% "jimp__plugin-shadow" % "0.16.1-d2c8c4",
  "org.scalablytyped.slinky" %%% "jimp__plugin-threshold" % "0.16.1-3b2862",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
