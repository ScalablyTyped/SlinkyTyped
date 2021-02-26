organization := "org.scalablytyped.slinky"
name := "google-cloud__pubsub"
version := "2.6.0-8b7731"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "gaxios" % "4.0.1-b7ad40",
  "org.scalablytyped.slinky" %%% "google-auth-library" % "6.1.3-d0c57d",
  "org.scalablytyped.slinky" %%% "google-cloud__precise-date" % "2.0.3-ddcf3f",
  "org.scalablytyped.slinky" %%% "google-gax" % "2.9.2-4523c6",
  "org.scalablytyped.slinky" %%% "grpc__grpc-js" % "1.1.8-a6f17a",
  "org.scalablytyped.slinky" %%% "grpc__proto-loader" % "0.5.5-6fa706",
  "org.scalablytyped.slinky" %%% "gtoken" % "5.1.0-039104",
  "org.scalablytyped.slinky" %%% "long" % "4.0.0-dt-20201002Z-1816bf",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "opentelemetry__api" % "0.11.0-5fca65",
  "org.scalablytyped.slinky" %%% "opentelemetry__context-base" % "0.11.0-e6446a",
  "org.scalablytyped.slinky" %%% "p-defer" % "3.0.0-f60a8c",
  "org.scalablytyped.slinky" %%% "protobufjs" % "6.10.2-96263b",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
