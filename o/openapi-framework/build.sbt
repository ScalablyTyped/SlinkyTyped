organization := "org.scalablytyped.slinky"
name := "openapi-framework"
version := "0.25.0-888da5"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "ajv" % "6.12.2-fc1794",
  "org.scalablytyped.slinky" %%% "openapi-default-setter" % "2.1.0-85ff63",
  "org.scalablytyped.slinky" %%% "openapi-request-coercer" % "2.3.0-b36bdc",
  "org.scalablytyped.slinky" %%% "openapi-request-validator" % "4.1.0-e1ba94",
  "org.scalablytyped.slinky" %%% "openapi-response-validator" % "4.0.0-b2f9da",
  "org.scalablytyped.slinky" %%% "openapi-security-handler" % "2.0.4-3bd001",
  "org.scalablytyped.slinky" %%% "openapi-types" % "1.3.5-7e00ad",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0",
  "org.scalablytyped.slinky" %%% "ts-log" % "2.1.4-ae2766")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
