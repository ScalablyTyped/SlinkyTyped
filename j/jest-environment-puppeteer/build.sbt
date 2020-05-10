organization := "org.scalablytyped.slinky"
name := "jest-environment-puppeteer"
version := "4.3-dt-20190819Z-f60709"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "callsites" % "3.1.0-19f69f",
  "org.scalablytyped.slinky" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-b3ab00",
  "org.scalablytyped.slinky" %%% "jest-message-util" % "24.9.0-50d6da",
  "org.scalablytyped.slinky" %%% "jest-mock" % "24.9.0-827cf0",
  "org.scalablytyped.slinky" %%% "jest__console" % "24.9.0-06dd5e",
  "org.scalablytyped.slinky" %%% "jest__environment" % "24.9.0-5e8093",
  "org.scalablytyped.slinky" %%% "jest__fake-timers" % "24.9.0-e45ee9",
  "org.scalablytyped.slinky" %%% "jest__source-map" % "24.9.0-3a9d98",
  "org.scalablytyped.slinky" %%% "jest__test-result" % "24.9.0-5b66d4",
  "org.scalablytyped.slinky" %%% "jest__types" % "24.9.0-9f91d2",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "puppeteer" % "2.0-dt-20200225Z-1338f7",
  "org.scalablytyped.slinky" %%% "stack-utils" % "1.0-dt-20200225Z-5e24a1",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
