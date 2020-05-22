organization := "org.scalablytyped.slinky"
name := "jest-runner"
version := "24.9.0-1003f2"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "anymatch" % "1.3-dt-20200515Z-2c3c09",
  "org.scalablytyped.slinky" %%% "callsites" % "3.1.0-e5b38e",
  "org.scalablytyped.slinky" %%% "istanbul-lib-coverage" % "2.0-dt-20200515Z-86c123",
  "org.scalablytyped.slinky" %%% "jest-haste-map" % "24.9.0-45b83a",
  "org.scalablytyped.slinky" %%% "jest-message-util" % "24.9.0-6ff42e",
  "org.scalablytyped.slinky" %%% "jest-mock" % "24.9.0-a613bc",
  "org.scalablytyped.slinky" %%% "jest-resolve" % "24.9.0-4b0b91",
  "org.scalablytyped.slinky" %%% "jest-runtime" % "24.9.0-e746ac",
  "org.scalablytyped.slinky" %%% "jest__console" % "24.9.0-7a2f7c",
  "org.scalablytyped.slinky" %%% "jest__environment" % "24.9.0-a382f4",
  "org.scalablytyped.slinky" %%% "jest__fake-timers" % "24.9.0-f45948",
  "org.scalablytyped.slinky" %%% "jest__source-map" % "24.9.0-eee959",
  "org.scalablytyped.slinky" %%% "jest__test-result" % "24.9.0-fc976c",
  "org.scalablytyped.slinky" %%% "jest__types" % "24.9.0-311fa2",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "stack-utils" % "1.0-dt-20200515Z-efcb0b",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0",
  "org.scalablytyped.slinky" %%% "yargs" % "15.0-dt-20200515Z-8e390c",
  "org.scalablytyped.slinky" %%% "yargs-parser" % "15.0-dt-20200113Z-932c84")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
