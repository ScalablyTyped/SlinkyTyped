organization := "org.scalablytyped.slinky"
name := "jest__core"
version := "24.9.0-56edfa"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "anymatch" % "1.3-dt-20190212Z-69059c",
  "org.scalablytyped.slinky" %%% "callsites" % "3.1.0-4697db",
  "org.scalablytyped.slinky" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-23b4fd",
  "org.scalablytyped.slinky" %%% "jest-changed-files" % "24.9.0-dd57d7",
  "org.scalablytyped.slinky" %%% "jest-haste-map" % "24.9.0-ea7e57",
  "org.scalablytyped.slinky" %%% "jest-message-util" % "24.9.0-d29485",
  "org.scalablytyped.slinky" %%% "jest-mock" % "24.9.0-4e1248",
  "org.scalablytyped.slinky" %%% "jest-resolve" % "24.9.0-d71e78",
  "org.scalablytyped.slinky" %%% "jest-runner" % "24.9.0-dd66bf",
  "org.scalablytyped.slinky" %%% "jest-runtime" % "24.9.0-72a926",
  "org.scalablytyped.slinky" %%% "jest__console" % "24.9.0-ce15eb",
  "org.scalablytyped.slinky" %%% "jest__environment" % "24.9.0-380bec",
  "org.scalablytyped.slinky" %%% "jest__fake-timers" % "24.9.0-2a4448",
  "org.scalablytyped.slinky" %%% "jest__reporters" % "24.9.0-997e63",
  "org.scalablytyped.slinky" %%% "jest__source-map" % "24.9.0-f70e60",
  "org.scalablytyped.slinky" %%% "jest__test-result" % "24.9.0-74912b",
  "org.scalablytyped.slinky" %%% "jest__types" % "24.9.0-53e984",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "stack-utils" % "1.0-dt-20200225Z-c67683",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "yargs" % "15.0-dt-20200225Z-d2a309",
  "org.scalablytyped.slinky" %%% "yargs-parser" % "15.0-dt-20200113Z-86c59a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
