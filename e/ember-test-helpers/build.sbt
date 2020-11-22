organization := "org.scalablytyped.slinky"
name := "ember-test-helpers"
version := "1.0-dt-20201028Z-cc05f8"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "ember" % "3.16-dt-20201028Z-e6b436",
  "org.scalablytyped.slinky" %%% "ember__application" % "3.16-dt-20201028Z-f19d9b",
  "org.scalablytyped.slinky" %%% "ember__array" % "3.16-dt-20201028Z-3913ec",
  "org.scalablytyped.slinky" %%% "ember__component" % "3.16-dt-20201103Z-33fb4e",
  "org.scalablytyped.slinky" %%% "ember__controller" % "3.16-dt-20201118Z-240fe3",
  "org.scalablytyped.slinky" %%% "ember__debug" % "3.16-dt-20201028Z-8dabc6",
  "org.scalablytyped.slinky" %%% "ember__engine" % "3.16-dt-20201028Z-992cf8",
  "org.scalablytyped.slinky" %%% "ember__error" % "3.16-dt-20201028Z-099516",
  "org.scalablytyped.slinky" %%% "ember__object" % "3.12-dt-20201028Z-b758bf",
  "org.scalablytyped.slinky" %%% "ember__polyfills" % "3.12-dt-20201028Z-641cb9",
  "org.scalablytyped.slinky" %%% "ember__routing" % "3.16-dt-20201106Z-ea44a7",
  "org.scalablytyped.slinky" %%% "ember__runloop" % "3.16-dt-20201028Z-37f8fc",
  "org.scalablytyped.slinky" %%% "ember__service" % "3.16-dt-20201028Z-936925",
  "org.scalablytyped.slinky" %%% "ember__template" % "3.16-dt-20201028Z-0477f3",
  "org.scalablytyped.slinky" %%% "ember__test" % "3.16-dt-20201028Z-5a9b26",
  "org.scalablytyped.slinky" %%% "ember__utils" % "3.16-dt-20201028Z-b057f2",
  "org.scalablytyped.slinky" %%% "jquery" % "3.5-dt-20201028Z-467d08",
  "org.scalablytyped.slinky" %%% "rsvp" % "4.0-dt-20201028Z-bac857",
  "org.scalablytyped.slinky" %%% "sizzle" % "2.3-dt-20201002Z-017d7b",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
