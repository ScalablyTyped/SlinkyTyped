organization := "org.scalablytyped.slinky"
name := "express-openapi"
version := "5.0.0-63e97b"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "ajv" % "6.11.0-7a0f9a",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-ed4596",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200226Z-b2d5a0",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20200227Z-17932f",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200225Z-62466e",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20191126Z-e728ff",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "openapi-default-setter" % "2.1.0-2d53e0",
  "org.scalablytyped.slinky" %%% "openapi-framework" % "0.25.0-6d5a81",
  "org.scalablytyped.slinky" %%% "openapi-request-coercer" % "2.3.0-ecf620",
  "org.scalablytyped.slinky" %%% "openapi-request-validator" % "4.1.0-b1a418",
  "org.scalablytyped.slinky" %%% "openapi-response-validator" % "4.0.0-4e01c3",
  "org.scalablytyped.slinky" %%% "openapi-security-handler" % "2.0.4-70d928",
  "org.scalablytyped.slinky" %%% "openapi-types" % "1.3.5-bdbbb7",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-6f090d",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20200227Z-3c94e9",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "ts-log" % "2.1.4-ac50ac")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
