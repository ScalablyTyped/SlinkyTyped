organization := "org.scalablytyped.slinky"
name := "opentelemetry__tracing"
version := "0.11.0-44da94"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "opentelemetry__api" % "0.11.0-5fca65",
  "org.scalablytyped.slinky" %%% "opentelemetry__context-base" % "0.11.0-e6446a",
  "org.scalablytyped.slinky" %%% "opentelemetry__core" % "0.11.0-a3e668",
  "org.scalablytyped.slinky" %%% "opentelemetry__resources" % "0.11.0-7d22e5",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
