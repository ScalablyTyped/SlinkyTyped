organization := "org.scalablytyped.slinky"
name := "google-cloud__storage"
version := "5.5.0-91ffbe"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "gaxios" % "4.0.1-40a6c2",
  "org.scalablytyped.slinky" %%% "google-auth-library" % "6.1.3-2c8806",
  "org.scalablytyped.slinky" %%% "google-cloud__common" % "3.5.0-be6ddb",
  "org.scalablytyped.slinky" %%% "gtoken" % "5.1.0-a68c7c",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533",
  "org.scalablytyped.slinky" %%% "teeny-request" % "7.0.1-bbd8f0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
