organization := "org.scalablytyped.slinky"
name := "jest__environment"
version := "24.9.0-092fb2"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "callsites" % "3.1.0-e3e0e3",
  "org.scalablytyped.slinky" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-87edce",
  "org.scalablytyped.slinky" %%% "jest-message-util" % "24.9.0-c80187",
  "org.scalablytyped.slinky" %%% "jest-mock" % "24.9.0-eaba3b",
  "org.scalablytyped.slinky" %%% "jest__console" % "24.9.0-7a9b1d",
  "org.scalablytyped.slinky" %%% "jest__fake-timers" % "24.9.0-b764a0",
  "org.scalablytyped.slinky" %%% "jest__source-map" % "24.9.0-098f8f",
  "org.scalablytyped.slinky" %%% "jest__test-result" % "24.9.0-52a141",
  "org.scalablytyped.slinky" %%% "jest__types" % "24.9.0-6cab66",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "stack-utils" % "1.0-dt-20180214Z-e1721e",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43",
  "org.scalablytyped.slinky" %%% "yargs" % "13.0-dt-20191223Z-026ba5",
  "org.scalablytyped.slinky" %%% "yargs-parser" % "13.1-dt-20190905Z-51ca0c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        