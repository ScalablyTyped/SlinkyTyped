organization := "org.scalablytyped.slinky"
name := "openapi-framework"
version := "7.2.0-acdbce"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "ajv" % "6.12.6-d07378",
  "org.scalablytyped.slinky" %%% "openapi-default-setter" % "7.0.1-17500f",
  "org.scalablytyped.slinky" %%% "openapi-request-coercer" % "7.1.0-ea4141",
  "org.scalablytyped.slinky" %%% "openapi-request-validator" % "7.2.0-412ffb",
  "org.scalablytyped.slinky" %%% "openapi-response-validator" % "7.0.1-2fbb1c",
  "org.scalablytyped.slinky" %%% "openapi-security-handler" % "7.0.1-3b89ec",
  "org.scalablytyped.slinky" %%% "openapi-types" % "7.0.1-fdb263",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "ts-log" % "2.2.3-b2fea4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
