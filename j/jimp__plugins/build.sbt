organization := "org.scalablytyped.slinky"
name := "jimp__plugins"
version := "0.8.5-2c76ad"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "jimp__core" % "0.8.5-141141",
  "org.scalablytyped.slinky" %%% "jimp__plugin-blit" % "0.8.5-9663ca",
  "org.scalablytyped.slinky" %%% "jimp__plugin-blur" % "0.8.5-703825",
  "org.scalablytyped.slinky" %%% "jimp__plugin-color" % "0.8.5-3ef8a6",
  "org.scalablytyped.slinky" %%% "jimp__plugin-contain" % "0.8.5-714104",
  "org.scalablytyped.slinky" %%% "jimp__plugin-cover" % "0.8.5-ca2741",
  "org.scalablytyped.slinky" %%% "jimp__plugin-crop" % "0.8.5-b63cf7",
  "org.scalablytyped.slinky" %%% "jimp__plugin-displace" % "0.8.5-a0063c",
  "org.scalablytyped.slinky" %%% "jimp__plugin-dither" % "0.8.5-5dfa94",
  "org.scalablytyped.slinky" %%% "jimp__plugin-flip" % "0.8.5-691730",
  "org.scalablytyped.slinky" %%% "jimp__plugin-gaussian" % "0.8.5-d7c791",
  "org.scalablytyped.slinky" %%% "jimp__plugin-invert" % "0.8.5-a568f5",
  "org.scalablytyped.slinky" %%% "jimp__plugin-mask" % "0.8.5-37cad7",
  "org.scalablytyped.slinky" %%% "jimp__plugin-normalize" % "0.8.5-b546b8",
  "org.scalablytyped.slinky" %%% "jimp__plugin-print" % "0.8.5-2b86ae",
  "org.scalablytyped.slinky" %%% "jimp__plugin-resize" % "0.8.5-12217b",
  "org.scalablytyped.slinky" %%% "jimp__plugin-rotate" % "0.8.5-831bba",
  "org.scalablytyped.slinky" %%% "jimp__plugin-scale" % "0.8.5-d90564",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
