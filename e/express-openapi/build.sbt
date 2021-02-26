organization := "org.scalablytyped.slinky"
name := "express-openapi"
version := "7.2.0-64e25e"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "ajv" % "6.12.6-d07378",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-a3cce0",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20201002Z-671a3f",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20201111Z-1b328b",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200921Z-935502",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20200722Z-25c5b2",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "openapi-default-setter" % "7.0.1-17500f",
  "org.scalablytyped.slinky" %%% "openapi-framework" % "7.2.0-acdbce",
  "org.scalablytyped.slinky" %%% "openapi-request-coercer" % "7.1.0-ea4141",
  "org.scalablytyped.slinky" %%% "openapi-request-validator" % "7.2.0-412ffb",
  "org.scalablytyped.slinky" %%% "openapi-response-validator" % "7.0.1-2fbb1c",
  "org.scalablytyped.slinky" %%% "openapi-security-handler" % "7.0.1-3b89ec",
  "org.scalablytyped.slinky" %%% "openapi-types" % "7.0.1-fdb263",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20201002Z-9bc0d9",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20201002Z-d58f66",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20201117Z-7353a1",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "ts-log" % "2.2.3-b2fea4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
