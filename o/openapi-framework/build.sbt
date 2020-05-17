organization := "org.scalablytyped.slinky"
name := "openapi-framework"
version := "0.25.0-5c74cd"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "ajv" % "6.12.0-441510",
  "org.scalablytyped.slinky" %%% "openapi-default-setter" % "2.1.0-da8e06",
  "org.scalablytyped.slinky" %%% "openapi-request-coercer" % "2.3.0-99e622",
  "org.scalablytyped.slinky" %%% "openapi-request-validator" % "4.1.0-1f3c6b",
  "org.scalablytyped.slinky" %%% "openapi-response-validator" % "4.0.0-2404db",
  "org.scalablytyped.slinky" %%% "openapi-security-handler" % "2.0.4-207fa2",
  "org.scalablytyped.slinky" %%% "openapi-types" % "1.3.5-be3a68",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "ts-log" % "2.1.4-b56ee3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
