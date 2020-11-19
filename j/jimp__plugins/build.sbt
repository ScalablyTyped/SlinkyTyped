organization := "org.scalablytyped.slinky"
name := "jimp__plugins"
version := "0.14.0-d5d69a"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "jimp__core" % "0.14.0-3e9ab4",
  "org.scalablytyped.slinky" %%% "jimp__plugin-blit" % "0.14.0-ec847d",
  "org.scalablytyped.slinky" %%% "jimp__plugin-blur" % "0.14.0-7260ba",
  "org.scalablytyped.slinky" %%% "jimp__plugin-circle" % "0.14.0-df6c42",
  "org.scalablytyped.slinky" %%% "jimp__plugin-color" % "0.14.0-b7cb2f",
  "org.scalablytyped.slinky" %%% "jimp__plugin-contain" % "0.14.0-dac649",
  "org.scalablytyped.slinky" %%% "jimp__plugin-cover" % "0.14.0-453292",
  "org.scalablytyped.slinky" %%% "jimp__plugin-crop" % "0.14.0-7cb90c",
  "org.scalablytyped.slinky" %%% "jimp__plugin-displace" % "0.14.0-02f93c",
  "org.scalablytyped.slinky" %%% "jimp__plugin-dither" % "0.14.0-0f2a4d",
  "org.scalablytyped.slinky" %%% "jimp__plugin-fisheye" % "0.14.0-f83ebc",
  "org.scalablytyped.slinky" %%% "jimp__plugin-flip" % "0.14.0-859968",
  "org.scalablytyped.slinky" %%% "jimp__plugin-gaussian" % "0.14.0-ed0fb4",
  "org.scalablytyped.slinky" %%% "jimp__plugin-invert" % "0.14.0-b58e13",
  "org.scalablytyped.slinky" %%% "jimp__plugin-mask" % "0.14.0-6fb203",
  "org.scalablytyped.slinky" %%% "jimp__plugin-normalize" % "0.14.0-8736d4",
  "org.scalablytyped.slinky" %%% "jimp__plugin-print" % "0.14.0-af7a7b",
  "org.scalablytyped.slinky" %%% "jimp__plugin-resize" % "0.14.0-8d99de",
  "org.scalablytyped.slinky" %%% "jimp__plugin-rotate" % "0.14.0-a26753",
  "org.scalablytyped.slinky" %%% "jimp__plugin-scale" % "0.14.0-707308",
  "org.scalablytyped.slinky" %%% "jimp__plugin-shadow" % "0.14.0-480d51",
  "org.scalablytyped.slinky" %%% "jimp__plugin-threshold" % "0.14.0-ff905f",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
