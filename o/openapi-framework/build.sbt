organization := "org.scalablytyped.slinky"
name := "openapi-framework"
version := "7.0.0-8f6500"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "ajv" % "6.12.3-e011b3",
  "org.scalablytyped.slinky" %%% "openapi-default-setter" % "7.0.0-9d6bcb",
  "org.scalablytyped.slinky" %%% "openapi-request-coercer" % "7.0.0-a41885",
  "org.scalablytyped.slinky" %%% "openapi-request-validator" % "7.0.0-85e426",
  "org.scalablytyped.slinky" %%% "openapi-response-validator" % "7.0.0-62d20f",
  "org.scalablytyped.slinky" %%% "openapi-security-handler" % "7.0.0-ba21d9",
  "org.scalablytyped.slinky" %%% "openapi-types" % "7.0.0-085530",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8",
  "org.scalablytyped.slinky" %%% "ts-log" % "2.1.4-59b31a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
