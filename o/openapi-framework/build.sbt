organization := "org.scalablytyped.slinky"
name := "openapi-framework"
version := "0.25.0-51fa3c"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "ajv" % "6.10.2-edb28d",
  "org.scalablytyped.slinky" %%% "openapi-default-setter" % "2.1.0-9c0228",
  "org.scalablytyped.slinky" %%% "openapi-request-coercer" % "2.3.0-a6bb20",
  "org.scalablytyped.slinky" %%% "openapi-request-validator" % "4.1.0-4b0f7b",
  "org.scalablytyped.slinky" %%% "openapi-response-validator" % "4.0.0-04d03e",
  "org.scalablytyped.slinky" %%% "openapi-security-handler" % "2.0.4-a73d6f",
  "org.scalablytyped.slinky" %%% "openapi-types" % "1.3.5-a7f3ac",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43",
  "org.scalablytyped.slinky" %%% "ts-log" % "2.1.4-f6969d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        