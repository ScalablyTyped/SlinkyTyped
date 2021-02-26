organization := "org.scalablytyped.slinky"
name := "jimp__plugins"
version := "0.16.1-dec70c"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "jimp__core" % "0.16.1-68a9f6",
  "org.scalablytyped.slinky" %%% "jimp__plugin-blit" % "0.16.1-81cec2",
  "org.scalablytyped.slinky" %%% "jimp__plugin-blur" % "0.16.1-a79e2b",
  "org.scalablytyped.slinky" %%% "jimp__plugin-circle" % "0.16.1-bfddc0",
  "org.scalablytyped.slinky" %%% "jimp__plugin-color" % "0.16.1-cdd807",
  "org.scalablytyped.slinky" %%% "jimp__plugin-contain" % "0.16.1-3a6c2b",
  "org.scalablytyped.slinky" %%% "jimp__plugin-cover" % "0.16.1-cf4041",
  "org.scalablytyped.slinky" %%% "jimp__plugin-crop" % "0.16.1-bf08c2",
  "org.scalablytyped.slinky" %%% "jimp__plugin-displace" % "0.16.1-75a046",
  "org.scalablytyped.slinky" %%% "jimp__plugin-dither" % "0.16.1-71258a",
  "org.scalablytyped.slinky" %%% "jimp__plugin-fisheye" % "0.16.1-0e81df",
  "org.scalablytyped.slinky" %%% "jimp__plugin-flip" % "0.16.1-16c7dd",
  "org.scalablytyped.slinky" %%% "jimp__plugin-gaussian" % "0.16.1-50fa8f",
  "org.scalablytyped.slinky" %%% "jimp__plugin-invert" % "0.16.1-37d201",
  "org.scalablytyped.slinky" %%% "jimp__plugin-mask" % "0.16.1-90e644",
  "org.scalablytyped.slinky" %%% "jimp__plugin-normalize" % "0.16.1-afb7b8",
  "org.scalablytyped.slinky" %%% "jimp__plugin-print" % "0.16.1-ed2816",
  "org.scalablytyped.slinky" %%% "jimp__plugin-resize" % "0.16.1-453fe7",
  "org.scalablytyped.slinky" %%% "jimp__plugin-rotate" % "0.16.1-709e25",
  "org.scalablytyped.slinky" %%% "jimp__plugin-scale" % "0.16.1-186535",
  "org.scalablytyped.slinky" %%% "jimp__plugin-shadow" % "0.16.1-b98772",
  "org.scalablytyped.slinky" %%% "jimp__plugin-threshold" % "0.16.1-5201d0",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
