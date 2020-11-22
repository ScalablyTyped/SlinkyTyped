organization := "org.scalablytyped.slinky"
name := "jimp__types"
version := "0.16.1-fc187b"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "jimp__bmp" % "0.16.1-7bbddc",
  "org.scalablytyped.slinky" %%% "jimp__core" % "0.16.1-890415",
  "org.scalablytyped.slinky" %%% "jimp__gif" % "0.16.1-ee8b9c",
  "org.scalablytyped.slinky" %%% "jimp__jpeg" % "0.16.1-36259d",
  "org.scalablytyped.slinky" %%% "jimp__png" % "0.16.1-2058aa",
  "org.scalablytyped.slinky" %%% "jimp__tiff" % "0.16.1-f4c58b",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
