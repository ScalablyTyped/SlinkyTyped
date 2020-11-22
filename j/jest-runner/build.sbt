organization := "org.scalablytyped.slinky"
name := "jest-runner"
version := "26.6.3-2f96bd"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "anymatch" % "1.3-dt-20200515Z-0cdd8a",
  "org.scalablytyped.slinky" %%% "callsites" % "3.1.0-4ab0b3",
  "org.scalablytyped.slinky" %%% "chalk" % "4.1.0-9090fb",
  "org.scalablytyped.slinky" %%% "emittery" % "0.7.2-65dd93",
  "org.scalablytyped.slinky" %%% "expect" % "26.6.2-4204c8",
  "org.scalablytyped.slinky" %%% "istanbul-lib-coverage" % "2.0-dt-20200609Z-910fb5",
  "org.scalablytyped.slinky" %%% "istanbul-lib-report" % "3.0-dt-20200515Z-3a73b1",
  "org.scalablytyped.slinky" %%% "istanbul-reports" % "3.0-dt-20200720Z-e60b33",
  "org.scalablytyped.slinky" %%% "jest-diff" % "26.6.2-47ace6",
  "org.scalablytyped.slinky" %%% "jest-haste-map" % "24.9.0-8de571",
  "org.scalablytyped.slinky" %%% "jest-matcher-utils" % "26.6.2-26e185",
  "org.scalablytyped.slinky" %%% "jest-mock" % "24.9.0-ca6cd1",
  "org.scalablytyped.slinky" %%% "jest-resolve" % "26.6.2-f6ac9c",
  "org.scalablytyped.slinky" %%% "jest-runtime" % "26.6.3-c5274b",
  "org.scalablytyped.slinky" %%% "jest__console" % "24.9.0-2d4202",
  "org.scalablytyped.slinky" %%% "jest__environment" % "26.6.2-c33e9f",
  "org.scalablytyped.slinky" %%% "jest__source-map" % "24.9.0-4e9417",
  "org.scalablytyped.slinky" %%% "jest__test-result" % "24.9.0-1da0a7",
  "org.scalablytyped.slinky" %%% "jest__transform" % "26.6.2-6295b5",
  "org.scalablytyped.slinky" %%% "jest__types" % "26.6.2-bf45bc",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
