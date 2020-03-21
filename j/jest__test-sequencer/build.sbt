organization := "org.scalablytyped.slinky"
name := "jest__test-sequencer"
version := "24.9.0-818106"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "anymatch" % "1.3-dt-20190212Z-015d8e",
  "org.scalablytyped.slinky" %%% "callsites" % "3.1.0-1e3a17",
  "org.scalablytyped.slinky" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-b01e78",
  "org.scalablytyped.slinky" %%% "jest-haste-map" % "24.9.0-674c9e",
  "org.scalablytyped.slinky" %%% "jest-message-util" % "24.9.0-11347b",
  "org.scalablytyped.slinky" %%% "jest-mock" % "24.9.0-6d4c9c",
  "org.scalablytyped.slinky" %%% "jest-resolve" % "24.9.0-5bdd44",
  "org.scalablytyped.slinky" %%% "jest-runtime" % "24.9.0-391ae4",
  "org.scalablytyped.slinky" %%% "jest__console" % "24.9.0-552f42",
  "org.scalablytyped.slinky" %%% "jest__environment" % "24.9.0-b161f4",
  "org.scalablytyped.slinky" %%% "jest__fake-timers" % "24.9.0-dd3856",
  "org.scalablytyped.slinky" %%% "jest__source-map" % "24.9.0-b4ecc7",
  "org.scalablytyped.slinky" %%% "jest__test-result" % "24.9.0-3f34b8",
  "org.scalablytyped.slinky" %%% "jest__types" % "24.9.0-b8a60d",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "stack-utils" % "1.0-dt-20200225Z-4b17c3",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "yargs" % "15.0-dt-20200225Z-a8e141",
  "org.scalablytyped.slinky" %%% "yargs-parser" % "15.0-dt-20200113Z-13f7d1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
