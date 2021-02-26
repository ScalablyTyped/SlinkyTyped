organization := "org.scalablytyped.slinky"
name := "jimp__types"
version := "0.16.1-58ea52"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "jimp__bmp" % "0.16.1-e06c0a",
  "org.scalablytyped.slinky" %%% "jimp__core" % "0.16.1-68a9f6",
  "org.scalablytyped.slinky" %%% "jimp__gif" % "0.16.1-042f00",
  "org.scalablytyped.slinky" %%% "jimp__jpeg" % "0.16.1-92dcef",
  "org.scalablytyped.slinky" %%% "jimp__png" % "0.16.1-84167f",
  "org.scalablytyped.slinky" %%% "jimp__tiff" % "0.16.1-ce4072",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
