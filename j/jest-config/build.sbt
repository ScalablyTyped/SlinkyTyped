organization := "org.scalablytyped.slinky"
name := "jest-config"
version := "24.9.0-2bfb1d"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-23b4fd",
  "org.scalablytyped.slinky" %%% "jest-validate" % "25.1.0-3742c4",
  "org.scalablytyped.slinky" %%% "jest__types" % "24.9.0-53e984",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "yargs" % "15.0-dt-20200225Z-d2a309",
  "org.scalablytyped.slinky" %%% "yargs-parser" % "15.0-dt-20200113Z-86c59a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
