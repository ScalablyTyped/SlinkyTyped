organization := "org.scalablytyped.slinky"
name := "jest-environment-puppeteer"
version := "4.3-dt-20200624Z-7a324b"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "callsites" % "3.1.0-3e2070",
  "org.scalablytyped.slinky" %%% "istanbul-lib-coverage" % "2.0-dt-20200609Z-5d64c8",
  "org.scalablytyped.slinky" %%% "jest-message-util" % "24.9.0-f35b40",
  "org.scalablytyped.slinky" %%% "jest-mock" % "24.9.0-ca12fd",
  "org.scalablytyped.slinky" %%% "jest__console" % "24.9.0-1f0e7f",
  "org.scalablytyped.slinky" %%% "jest__environment" % "26.2.0-ae3bd5",
  "org.scalablytyped.slinky" %%% "jest__fake-timers" % "24.9.0-cf11cd",
  "org.scalablytyped.slinky" %%% "jest__source-map" % "24.9.0-dfe19e",
  "org.scalablytyped.slinky" %%% "jest__test-result" % "24.9.0-f4aea1",
  "org.scalablytyped.slinky" %%% "jest__types" % "24.9.0-9ce9dc",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "puppeteer" % "3.0-dt-20200627Z-5f87ad",
  "org.scalablytyped.slinky" %%% "stack-utils" % "1.0-dt-20200515Z-a6c005",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
