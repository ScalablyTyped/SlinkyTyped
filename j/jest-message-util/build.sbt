organization := "org.scalablytyped.slinky"
name := "jest-message-util"
version := "24.9.0-6ff42e"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "callsites" % "3.1.0-e5b38e",
  "org.scalablytyped.slinky" %%% "istanbul-lib-coverage" % "2.0-dt-20200515Z-86c123",
  "org.scalablytyped.slinky" %%% "jest__console" % "24.9.0-7a2f7c",
  "org.scalablytyped.slinky" %%% "jest__source-map" % "24.9.0-eee959",
  "org.scalablytyped.slinky" %%% "jest__test-result" % "24.9.0-fc976c",
  "org.scalablytyped.slinky" %%% "jest__types" % "24.9.0-311fa2",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "stack-utils" % "1.0-dt-20200515Z-efcb0b",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
