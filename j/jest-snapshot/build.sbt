organization := "org.scalablytyped.slinky"
name := "jest-snapshot"
version := "24.9.0-baab00"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "anymatch" % "1.3-dt-20200515Z-4c21fd",
  "org.scalablytyped.slinky" %%% "callsites" % "3.1.0-aecf54",
  "org.scalablytyped.slinky" %%% "chalk" % "4.1.0-1d4be7",
  "org.scalablytyped.slinky" %%% "expect" % "26.2.0-10188b",
  "org.scalablytyped.slinky" %%% "istanbul-lib-coverage" % "2.0-dt-20200609Z-479a1b",
  "org.scalablytyped.slinky" %%% "jest-diff" % "26.2.0-87c465",
  "org.scalablytyped.slinky" %%% "jest-haste-map" % "24.9.0-c4df0b",
  "org.scalablytyped.slinky" %%% "jest-matcher-utils" % "26.2.0-54c0ee",
  "org.scalablytyped.slinky" %%% "jest-message-util" % "24.9.0-8a74af",
  "org.scalablytyped.slinky" %%% "jest__console" % "24.9.0-81b850",
  "org.scalablytyped.slinky" %%% "jest__source-map" % "24.9.0-a0a83e",
  "org.scalablytyped.slinky" %%% "jest__test-result" % "24.9.0-d525be",
  "org.scalablytyped.slinky" %%% "jest__types" % "24.9.0-4f6068",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-df8c17",
  "org.scalablytyped.slinky" %%% "pretty-format" % "26.2.0-89f324",
  "org.scalablytyped.slinky" %%% "stack-utils" % "1.0-dt-20200515Z-8fdd0d",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
