organization := "org.scalablytyped.slinky"
name := "jest__reporters"
version := "24.9.0-b11105"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "anymatch" % "1.3-dt-20190212Z-0c158e",
  "org.scalablytyped.slinky" %%% "callsites" % "3.1.0-19f69f",
  "org.scalablytyped.slinky" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-b3ab00",
  "org.scalablytyped.slinky" %%% "jest-haste-map" % "24.9.0-28ed21",
  "org.scalablytyped.slinky" %%% "jest-message-util" % "24.9.0-50d6da",
  "org.scalablytyped.slinky" %%% "jest-mock" % "24.9.0-827cf0",
  "org.scalablytyped.slinky" %%% "jest-resolve" % "24.9.0-809923",
  "org.scalablytyped.slinky" %%% "jest-runtime" % "24.9.0-a2b47c",
  "org.scalablytyped.slinky" %%% "jest__console" % "24.9.0-06dd5e",
  "org.scalablytyped.slinky" %%% "jest__environment" % "24.9.0-5e8093",
  "org.scalablytyped.slinky" %%% "jest__fake-timers" % "24.9.0-e45ee9",
  "org.scalablytyped.slinky" %%% "jest__source-map" % "24.9.0-3a9d98",
  "org.scalablytyped.slinky" %%% "jest__test-result" % "24.9.0-5b66d4",
  "org.scalablytyped.slinky" %%% "jest__types" % "24.9.0-9f91d2",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "stack-utils" % "1.0-dt-20200225Z-5e24a1",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e",
  "org.scalablytyped.slinky" %%% "yargs" % "15.0-dt-20200225Z-1b5416",
  "org.scalablytyped.slinky" %%% "yargs-parser" % "15.0-dt-20200113Z-dd0df0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
