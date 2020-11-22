organization := "org.scalablytyped.slinky"
name := "opentelemetry__tracing"
version := "0.11.0-81861e"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "opentelemetry__api" % "0.11.0-51a393",
  "org.scalablytyped.slinky" %%% "opentelemetry__context-base" % "0.11.0-3804c5",
  "org.scalablytyped.slinky" %%% "opentelemetry__core" % "0.11.0-8a6de9",
  "org.scalablytyped.slinky" %%% "opentelemetry__resources" % "0.11.0-0922a5",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
