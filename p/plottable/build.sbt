organization := "org.scalablytyped.slinky"
name := "plottable"
version := "3.9.0-60214b"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "d3-path" % "2.0-dt-20201002Z-a7eba9",
  "org.scalablytyped.slinky" %%% "d3-selection" % "2.0-dt-20201002Z-67bdbd",
  "org.scalablytyped.slinky" %%% "d3-shape" % "2.0-dt-20201028Z-3ab6d3",
  "org.scalablytyped.slinky" %%% "d3-time" % "2.0-dt-20201002Z-e3a5ec",
  "org.scalablytyped.slinky" %%% "d3-transition" % "2.0-dt-20201002Z-fd0136",
  "org.scalablytyped.slinky" %%% "lodash" % "4.14-dt-20201105Z-0e39b7",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "typesettable" % "4.1.0-ab34fc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
