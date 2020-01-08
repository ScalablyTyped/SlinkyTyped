organization := "org.scalablytyped.slinky"
name := "express-openapi"
version := "5.0.0-05d3c3"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "ajv" % "6.10.2-edb28d",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.17-dt-20190819Z-ee62c5",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20191217Z-4825ba",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20191101Z-1aa7b6",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20191220Z-040290",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20191126Z-0f6108",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "openapi-default-setter" % "2.1.0-9c0228",
  "org.scalablytyped.slinky" %%% "openapi-framework" % "0.25.0-51fa3c",
  "org.scalablytyped.slinky" %%% "openapi-request-coercer" % "2.3.0-a6bb20",
  "org.scalablytyped.slinky" %%% "openapi-request-validator" % "4.1.0-4b0f7b",
  "org.scalablytyped.slinky" %%% "openapi-response-validator" % "4.0.0-04d03e",
  "org.scalablytyped.slinky" %%% "openapi-security-handler" % "2.0.4-a73d6f",
  "org.scalablytyped.slinky" %%% "openapi-types" % "1.3.5-a7f3ac",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-e91b01",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20190819Z-2c1738",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43",
  "org.scalablytyped.slinky" %%% "ts-log" % "2.1.4-f6969d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        