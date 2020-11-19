organization := "org.scalablytyped.slinky"
name := "openapi-framework"
version := "7.0.0-35e274"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "ajv" % "6.12.3-ca1ff8",
  "org.scalablytyped.slinky" %%% "openapi-default-setter" % "7.0.0-e96aa1",
  "org.scalablytyped.slinky" %%% "openapi-request-coercer" % "7.0.0-c0ba91",
  "org.scalablytyped.slinky" %%% "openapi-request-validator" % "7.0.0-f843ab",
  "org.scalablytyped.slinky" %%% "openapi-response-validator" % "7.0.0-cbdfc5",
  "org.scalablytyped.slinky" %%% "openapi-security-handler" % "7.0.0-84b56a",
  "org.scalablytyped.slinky" %%% "openapi-types" % "7.0.0-7b6607",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "ts-log" % "2.1.4-17a19a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
