organization := "org.scalablytyped.slinky"
name := "ember-qunit"
version := "3.4-dt-20200328Z-47b5d2"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "ember" % "3.1-dt-20200426Z-acef89",
  "org.scalablytyped.slinky" %%% "ember-test-helpers" % "1.0-dt-20200328Z-c4c6a9",
  "org.scalablytyped.slinky" %%% "ember__application" % "3.0-dt-20200328Z-5fb3ad",
  "org.scalablytyped.slinky" %%% "ember__array" % "3.0-dt-20200328Z-d07976",
  "org.scalablytyped.slinky" %%% "ember__component" % "3.0-dt-20200328Z-4f9361",
  "org.scalablytyped.slinky" %%% "ember__controller" % "3.0-dt-20200328Z-3ad3e2",
  "org.scalablytyped.slinky" %%% "ember__debug" % "3.0-dt-20200328Z-0c2e0a",
  "org.scalablytyped.slinky" %%% "ember__engine" % "3.0-dt-20200328Z-6b6630",
  "org.scalablytyped.slinky" %%% "ember__error" % "3.0-dt-20200328Z-35551f",
  "org.scalablytyped.slinky" %%% "ember__object" % "3.1-dt-20200426Z-dbad14",
  "org.scalablytyped.slinky" %%% "ember__polyfills" % "3.0-dt-20200328Z-089e64",
  "org.scalablytyped.slinky" %%% "ember__routing" % "3.0-dt-20200225Z-88f329",
  "org.scalablytyped.slinky" %%% "ember__runloop" % "3.0-dt-20200328Z-c57c7c",
  "org.scalablytyped.slinky" %%% "ember__service" % "3.0-dt-20200328Z-2ed1c6",
  "org.scalablytyped.slinky" %%% "ember__template" % "3.0-dt-20200328Z-e352e6",
  "org.scalablytyped.slinky" %%% "ember__test" % "3.0-dt-20200328Z-ed9b2b",
  "org.scalablytyped.slinky" %%% "ember__utils" % "3.0-dt-20200328Z-7f4a15",
  "org.scalablytyped.slinky" %%% "jquery" % "3.3-dt-20200427Z-6ecf75",
  "org.scalablytyped.slinky" %%% "qunit" % "v2.9.2-dt-20200401Z-623ee0",
  "org.scalablytyped.slinky" %%% "rsvp" % "4.0-dt-20200225Z-9a27ef",
  "org.scalablytyped.slinky" %%% "sizzle" % "2.3-dt-20181006Z-61c165",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
