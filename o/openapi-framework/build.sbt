organization := "org.scalablytyped.slinky"
name := "openapi-framework"
version := "0.25.0-0c54bb"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "ajv" % "6.10.2-9c0f79",
  "org.scalablytyped.slinky" %%% "openapi-default-setter" % "2.1.0-f7deab",
  "org.scalablytyped.slinky" %%% "openapi-request-coercer" % "2.3.0-ad3fb8",
  "org.scalablytyped.slinky" %%% "openapi-request-validator" % "4.1.0-818ce3",
  "org.scalablytyped.slinky" %%% "openapi-response-validator" % "4.0.0-28c5c8",
  "org.scalablytyped.slinky" %%% "openapi-security-handler" % "2.0.4-481927",
  "org.scalablytyped.slinky" %%% "openapi-types" % "1.3.5-4f86e7",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821",
  "org.scalablytyped.slinky" %%% "ts-log" % "2.1.4-2e4625")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        