organization := "org.scalablytyped.slinky"
name := "openapi-framework"
version := "0.25.0-6d5a81"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "ajv" % "6.11.0-7a0f9a",
  "org.scalablytyped.slinky" %%% "openapi-default-setter" % "2.1.0-2d53e0",
  "org.scalablytyped.slinky" %%% "openapi-request-coercer" % "2.3.0-ecf620",
  "org.scalablytyped.slinky" %%% "openapi-request-validator" % "4.1.0-b1a418",
  "org.scalablytyped.slinky" %%% "openapi-response-validator" % "4.0.0-4e01c3",
  "org.scalablytyped.slinky" %%% "openapi-security-handler" % "2.0.4-70d928",
  "org.scalablytyped.slinky" %%% "openapi-types" % "1.3.5-bdbbb7",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "ts-log" % "2.1.4-ac50ac")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
