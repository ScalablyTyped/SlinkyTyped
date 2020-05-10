organization := "org.scalablytyped.slinky"
name := "ember-data__store"
version := "3.15-dt-20200328Z-9d1317"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "ember" % "3.1-dt-20200426Z-610c5f",
  "org.scalablytyped.slinky" %%% "ember-data" % "3.1-dt-20200328Z-55926d",
  "org.scalablytyped.slinky" %%% "ember__application" % "3.0-dt-20200328Z-a28468",
  "org.scalablytyped.slinky" %%% "ember__array" % "3.0-dt-20200328Z-6be596",
  "org.scalablytyped.slinky" %%% "ember__component" % "3.0-dt-20200328Z-aa6e6c",
  "org.scalablytyped.slinky" %%% "ember__controller" % "3.0-dt-20200328Z-abb6fd",
  "org.scalablytyped.slinky" %%% "ember__debug" % "3.0-dt-20200328Z-2447bc",
  "org.scalablytyped.slinky" %%% "ember__engine" % "3.0-dt-20200328Z-289f99",
  "org.scalablytyped.slinky" %%% "ember__error" % "3.0-dt-20200328Z-b1551b",
  "org.scalablytyped.slinky" %%% "ember__object" % "3.1-dt-20200426Z-0ea7b9",
  "org.scalablytyped.slinky" %%% "ember__polyfills" % "3.0-dt-20200328Z-b0f054",
  "org.scalablytyped.slinky" %%% "ember__routing" % "3.0-dt-20200225Z-28b7a8",
  "org.scalablytyped.slinky" %%% "ember__runloop" % "3.0-dt-20200328Z-3666ea",
  "org.scalablytyped.slinky" %%% "ember__service" % "3.0-dt-20200328Z-398d1f",
  "org.scalablytyped.slinky" %%% "ember__template" % "3.0-dt-20200328Z-ff5e3d",
  "org.scalablytyped.slinky" %%% "ember__test" % "3.0-dt-20200328Z-3c5e57",
  "org.scalablytyped.slinky" %%% "ember__utils" % "3.0-dt-20200328Z-c70d09",
  "org.scalablytyped.slinky" %%% "jquery" % "3.3-dt-20200427Z-d88135",
  "org.scalablytyped.slinky" %%% "rsvp" % "4.0-dt-20200225Z-f030d7",
  "org.scalablytyped.slinky" %%% "sizzle" % "2.3-dt-20181006Z-1b2bf8",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
