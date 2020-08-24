organization := "org.scalablytyped.slinky"
name := "jimp__plugins"
version := "0.14.0-d4fbbf"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "jimp__core" % "0.14.0-ac0df3",
  "org.scalablytyped.slinky" %%% "jimp__plugin-blit" % "0.14.0-0225e2",
  "org.scalablytyped.slinky" %%% "jimp__plugin-blur" % "0.14.0-cfe10e",
  "org.scalablytyped.slinky" %%% "jimp__plugin-circle" % "0.14.0-362eff",
  "org.scalablytyped.slinky" %%% "jimp__plugin-color" % "0.14.0-edc353",
  "org.scalablytyped.slinky" %%% "jimp__plugin-contain" % "0.14.0-3ee559",
  "org.scalablytyped.slinky" %%% "jimp__plugin-cover" % "0.14.0-8136fe",
  "org.scalablytyped.slinky" %%% "jimp__plugin-crop" % "0.14.0-4ad193",
  "org.scalablytyped.slinky" %%% "jimp__plugin-displace" % "0.14.0-9ec5af",
  "org.scalablytyped.slinky" %%% "jimp__plugin-dither" % "0.14.0-87ef87",
  "org.scalablytyped.slinky" %%% "jimp__plugin-fisheye" % "0.14.0-c23c09",
  "org.scalablytyped.slinky" %%% "jimp__plugin-flip" % "0.14.0-89f3a9",
  "org.scalablytyped.slinky" %%% "jimp__plugin-gaussian" % "0.14.0-24a1ad",
  "org.scalablytyped.slinky" %%% "jimp__plugin-invert" % "0.14.0-528bb3",
  "org.scalablytyped.slinky" %%% "jimp__plugin-mask" % "0.14.0-edb10e",
  "org.scalablytyped.slinky" %%% "jimp__plugin-normalize" % "0.14.0-827c8c",
  "org.scalablytyped.slinky" %%% "jimp__plugin-print" % "0.14.0-86599b",
  "org.scalablytyped.slinky" %%% "jimp__plugin-resize" % "0.14.0-fdd176",
  "org.scalablytyped.slinky" %%% "jimp__plugin-rotate" % "0.14.0-159fac",
  "org.scalablytyped.slinky" %%% "jimp__plugin-scale" % "0.14.0-bf41b5",
  "org.scalablytyped.slinky" %%% "jimp__plugin-shadow" % "0.14.0-cc427a",
  "org.scalablytyped.slinky" %%% "jimp__plugin-threshold" % "0.14.0-5d25fd",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-df8c17",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
