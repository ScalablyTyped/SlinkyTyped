organization := "org.scalablytyped.slinky"
name := "jimp__types"
version := "0.8.5-2338e0"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "jimp__bmp" % "0.8.5-43443f",
  "org.scalablytyped.slinky" %%% "jimp__core" % "0.8.5-141141",
  "org.scalablytyped.slinky" %%% "jimp__gif" % "0.8.5-503508",
  "org.scalablytyped.slinky" %%% "jimp__jpeg" % "0.8.5-7acdea",
  "org.scalablytyped.slinky" %%% "jimp__png" % "0.8.5-6f5401",
  "org.scalablytyped.slinky" %%% "jimp__tiff" % "0.8.5-084e8a",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
