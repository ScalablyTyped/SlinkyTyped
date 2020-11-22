organization := "org.scalablytyped.slinky"
name := "jest-snapshot"
version := "26.6.2-62b58d"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "anymatch" % "1.3-dt-20200515Z-0cdd8a",
  "org.scalablytyped.slinky" %%% "babel__traverse" % "7.0-dt-20200925Z-ce0cf3",
  "org.scalablytyped.slinky" %%% "babel__types" % "7.12.7-cdf83e",
  "org.scalablytyped.slinky" %%% "callsites" % "3.1.0-4ab0b3",
  "org.scalablytyped.slinky" %%% "chalk" % "4.1.0-9090fb",
  "org.scalablytyped.slinky" %%% "expect" % "26.6.2-4204c8",
  "org.scalablytyped.slinky" %%% "istanbul-lib-coverage" % "2.0-dt-20200609Z-910fb5",
  "org.scalablytyped.slinky" %%% "istanbul-lib-report" % "3.0-dt-20200515Z-3a73b1",
  "org.scalablytyped.slinky" %%% "istanbul-reports" % "3.0-dt-20200720Z-e60b33",
  "org.scalablytyped.slinky" %%% "jest-diff" % "26.6.2-47ace6",
  "org.scalablytyped.slinky" %%% "jest-haste-map" % "24.9.0-8de571",
  "org.scalablytyped.slinky" %%% "jest-matcher-utils" % "26.6.2-26e185",
  "org.scalablytyped.slinky" %%% "jest-message-util" % "24.9.0-0d3c83",
  "org.scalablytyped.slinky" %%% "jest__console" % "24.9.0-2d4202",
  "org.scalablytyped.slinky" %%% "jest__source-map" % "24.9.0-4e9417",
  "org.scalablytyped.slinky" %%% "jest__test-result" % "24.9.0-1da0a7",
  "org.scalablytyped.slinky" %%% "jest__types" % "26.6.2-bf45bc",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "prettier" % "2.1-dt-20201016Z-2d086b",
  "org.scalablytyped.slinky" %%% "pretty-format" % "26.6.2-4c5d9b",
  "org.scalablytyped.slinky" %%% "stack-utils" % "2.0-dt-20200921Z-1d2615",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
