organization := "org.scalablytyped.slinky"
name := "plottable"
version := "3.9.0-c1f081"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "d3-path" % "2.0-dt-20201002Z-26b3ba",
  "org.scalablytyped.slinky" %%% "d3-selection" % "2.0-dt-20201002Z-a092b8",
  "org.scalablytyped.slinky" %%% "d3-shape" % "2.0-dt-20201028Z-6fdc08",
  "org.scalablytyped.slinky" %%% "d3-time" % "2.0-dt-20201002Z-57bc02",
  "org.scalablytyped.slinky" %%% "d3-transition" % "2.0-dt-20201002Z-97fdba",
  "org.scalablytyped.slinky" %%% "lodash" % "4.14-dt-20201105Z-cc83da",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533",
  "org.scalablytyped.slinky" %%% "typesettable" % "4.1.0-72610d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
