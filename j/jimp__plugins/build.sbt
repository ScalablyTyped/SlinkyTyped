organization := "org.scalablytyped.slinky"
name := "jimp__plugins"
version := "0.8.5-161939"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "jimp__core" % "0.8.5-e1e44a",
  "org.scalablytyped.slinky" %%% "jimp__plugin-blit" % "0.8.5-1e4656",
  "org.scalablytyped.slinky" %%% "jimp__plugin-blur" % "0.8.5-caeae4",
  "org.scalablytyped.slinky" %%% "jimp__plugin-color" % "0.8.5-842e91",
  "org.scalablytyped.slinky" %%% "jimp__plugin-contain" % "0.8.5-57d6de",
  "org.scalablytyped.slinky" %%% "jimp__plugin-cover" % "0.8.5-d0e6f8",
  "org.scalablytyped.slinky" %%% "jimp__plugin-crop" % "0.8.5-830f5c",
  "org.scalablytyped.slinky" %%% "jimp__plugin-displace" % "0.8.5-8a11ce",
  "org.scalablytyped.slinky" %%% "jimp__plugin-dither" % "0.8.5-b685fc",
  "org.scalablytyped.slinky" %%% "jimp__plugin-flip" % "0.8.5-ef7097",
  "org.scalablytyped.slinky" %%% "jimp__plugin-gaussian" % "0.8.5-b82b7d",
  "org.scalablytyped.slinky" %%% "jimp__plugin-invert" % "0.8.5-dc4051",
  "org.scalablytyped.slinky" %%% "jimp__plugin-mask" % "0.8.5-6f9d5e",
  "org.scalablytyped.slinky" %%% "jimp__plugin-normalize" % "0.8.5-75f1d9",
  "org.scalablytyped.slinky" %%% "jimp__plugin-print" % "0.8.5-9f993f",
  "org.scalablytyped.slinky" %%% "jimp__plugin-resize" % "0.8.5-71b9aa",
  "org.scalablytyped.slinky" %%% "jimp__plugin-rotate" % "0.8.5-510843",
  "org.scalablytyped.slinky" %%% "jimp__plugin-scale" % "0.8.5-3c0cbc",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
