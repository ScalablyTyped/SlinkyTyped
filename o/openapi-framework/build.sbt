organization := "org.scalablytyped.slinky"
name := "openapi-framework"
version := "0.25.0-368896"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "ajv" % "6.12.0-bd7a73",
  "org.scalablytyped.slinky" %%% "openapi-default-setter" % "2.1.0-97a939",
  "org.scalablytyped.slinky" %%% "openapi-request-coercer" % "2.3.0-54b8fe",
  "org.scalablytyped.slinky" %%% "openapi-request-validator" % "4.1.0-f02543",
  "org.scalablytyped.slinky" %%% "openapi-response-validator" % "4.0.0-f9ab10",
  "org.scalablytyped.slinky" %%% "openapi-security-handler" % "2.0.4-d8f0a1",
  "org.scalablytyped.slinky" %%% "openapi-types" % "1.3.5-4f0882",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e",
  "org.scalablytyped.slinky" %%% "ts-log" % "2.1.4-ea2f80")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
