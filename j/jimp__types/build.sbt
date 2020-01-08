organization := "org.scalablytyped.slinky"
name := "jimp__types"
version := "0.8.5-65db6a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "jimp__bmp" % "0.8.5-20d793",
  "org.scalablytyped.slinky" %%% "jimp__core" % "0.8.5-4ca07f",
  "org.scalablytyped.slinky" %%% "jimp__gif" % "0.8.5-091467",
  "org.scalablytyped.slinky" %%% "jimp__jpeg" % "0.8.5-fb966b",
  "org.scalablytyped.slinky" %%% "jimp__png" % "0.8.5-e6dd2c",
  "org.scalablytyped.slinky" %%% "jimp__tiff" % "0.8.5-55d7bc",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        