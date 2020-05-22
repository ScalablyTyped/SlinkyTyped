organization := "org.scalablytyped.slinky"
name := "express-openapi"
version := "5.0.0-2ac8f5"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "ajv" % "6.12.2-fc1794",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-3172ef",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200515Z-49be3e",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20200515Z-35525e",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200515Z-f4fc10",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20200515Z-2900a9",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "openapi-default-setter" % "2.1.0-85ff63",
  "org.scalablytyped.slinky" %%% "openapi-framework" % "0.25.0-888da5",
  "org.scalablytyped.slinky" %%% "openapi-request-coercer" % "2.3.0-b36bdc",
  "org.scalablytyped.slinky" %%% "openapi-request-validator" % "4.1.0-e1ba94",
  "org.scalablytyped.slinky" %%% "openapi-response-validator" % "4.0.0-b2f9da",
  "org.scalablytyped.slinky" %%% "openapi-security-handler" % "2.0.4-3bd001",
  "org.scalablytyped.slinky" %%% "openapi-types" % "1.3.5-7e00ad",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20200519Z-8e6135",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-0a4f98",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20200519Z-85de9b",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0",
  "org.scalablytyped.slinky" %%% "ts-log" % "2.1.4-ae2766")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
