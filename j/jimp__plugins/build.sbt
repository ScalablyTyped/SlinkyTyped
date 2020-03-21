organization := "org.scalablytyped.slinky"
name := "jimp__plugins"
version := "0.8.5-28b409"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "jimp__core" % "0.8.5-21f495",
  "org.scalablytyped.slinky" %%% "jimp__plugin-blit" % "0.8.5-7ca16c",
  "org.scalablytyped.slinky" %%% "jimp__plugin-blur" % "0.8.5-d59985",
  "org.scalablytyped.slinky" %%% "jimp__plugin-color" % "0.8.5-2647bc",
  "org.scalablytyped.slinky" %%% "jimp__plugin-contain" % "0.8.5-b6626b",
  "org.scalablytyped.slinky" %%% "jimp__plugin-cover" % "0.8.5-ec498c",
  "org.scalablytyped.slinky" %%% "jimp__plugin-crop" % "0.8.5-0816bc",
  "org.scalablytyped.slinky" %%% "jimp__plugin-displace" % "0.8.5-35230a",
  "org.scalablytyped.slinky" %%% "jimp__plugin-dither" % "0.8.5-6c0063",
  "org.scalablytyped.slinky" %%% "jimp__plugin-flip" % "0.8.5-51b043",
  "org.scalablytyped.slinky" %%% "jimp__plugin-gaussian" % "0.8.5-d59dbf",
  "org.scalablytyped.slinky" %%% "jimp__plugin-invert" % "0.8.5-9dc999",
  "org.scalablytyped.slinky" %%% "jimp__plugin-mask" % "0.8.5-25751f",
  "org.scalablytyped.slinky" %%% "jimp__plugin-normalize" % "0.8.5-0d7a3c",
  "org.scalablytyped.slinky" %%% "jimp__plugin-print" % "0.8.5-21f80c",
  "org.scalablytyped.slinky" %%% "jimp__plugin-resize" % "0.8.5-6bad95",
  "org.scalablytyped.slinky" %%% "jimp__plugin-rotate" % "0.8.5-79afc6",
  "org.scalablytyped.slinky" %%% "jimp__plugin-scale" % "0.8.5-bfc6f3",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
