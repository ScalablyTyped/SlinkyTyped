organization := "org.scalablytyped.slinky"
name := "jest-watcher"
version := "24.9.0-42f358"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "callsites" % "3.1.0-4697db",
  "org.scalablytyped.slinky" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-23b4fd",
  "org.scalablytyped.slinky" %%% "jest__console" % "24.9.0-ce15eb",
  "org.scalablytyped.slinky" %%% "jest__source-map" % "24.9.0-f70e60",
  "org.scalablytyped.slinky" %%% "jest__test-result" % "24.9.0-74912b",
  "org.scalablytyped.slinky" %%% "jest__types" % "24.9.0-53e984",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
