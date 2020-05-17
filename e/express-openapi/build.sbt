organization := "org.scalablytyped.slinky"
name := "express-openapi"
version := "5.0.0-19ac84"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "ajv" % "6.12.0-441510",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-ef676c",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200226Z-fe7436",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20200409Z-223215",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200415Z-cfdf0c",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20191126Z-d94a1a",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "openapi-default-setter" % "2.1.0-da8e06",
  "org.scalablytyped.slinky" %%% "openapi-framework" % "0.25.0-5c74cd",
  "org.scalablytyped.slinky" %%% "openapi-request-coercer" % "2.3.0-99e622",
  "org.scalablytyped.slinky" %%% "openapi-request-validator" % "4.1.0-1f3c6b",
  "org.scalablytyped.slinky" %%% "openapi-response-validator" % "4.0.0-2404db",
  "org.scalablytyped.slinky" %%% "openapi-security-handler" % "2.0.4-207fa2",
  "org.scalablytyped.slinky" %%% "openapi-types" % "1.3.5-be3a68",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20200225Z-413bcb",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-34f923",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20200227Z-51c95d",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "ts-log" % "2.1.4-b56ee3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
