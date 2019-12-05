organization := "org.scalablytyped.slinky"
name := "express-openapi"
version := "5.0.0-9fdf5c"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "ajv" % "6.10.2-9c0f79",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.17-dt-20190819Z-0fbf69",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20190322Z-7f9ff6",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20191101Z-99b8ef",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20191115Z-6e0a7c",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20191126Z-568141",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "openapi-default-setter" % "2.1.0-f7deab",
  "org.scalablytyped.slinky" %%% "openapi-framework" % "0.25.0-0c54bb",
  "org.scalablytyped.slinky" %%% "openapi-request-coercer" % "2.3.0-ad3fb8",
  "org.scalablytyped.slinky" %%% "openapi-request-validator" % "4.1.0-818ce3",
  "org.scalablytyped.slinky" %%% "openapi-response-validator" % "4.0.0-28c5c8",
  "org.scalablytyped.slinky" %%% "openapi-security-handler" % "2.0.4-481927",
  "org.scalablytyped.slinky" %%% "openapi-types" % "1.3.5-4f86e7",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-aa5088",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20190819Z-98e334",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821",
  "org.scalablytyped.slinky" %%% "ts-log" % "2.1.4-2e4625")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        