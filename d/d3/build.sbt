organization := "org.scalablytyped.slinky"
name := "d3"
version := "6.2-dt-20201118Z-15d8b0"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "d3-array" % "2.8-dt-20201116Z-b083c7",
  "org.scalablytyped.slinky" %%% "d3-axis" % "2.0-dt-20201104Z-cbe5a9",
  "org.scalablytyped.slinky" %%% "d3-brush" % "2.1-dt-20200930Z-2b761b",
  "org.scalablytyped.slinky" %%% "d3-chord" % "2.0-dt-20200929Z-8907af",
  "org.scalablytyped.slinky" %%% "d3-color" % "2.0-dt-20201117Z-7e48e1",
  "org.scalablytyped.slinky" %%% "d3-contour" % "2.0-dt-20200930Z-d26e9f",
  "org.scalablytyped.slinky" %%% "d3-delaunay" % "5.3-dt-20200930Z-42bbec",
  "org.scalablytyped.slinky" %%% "d3-dispatch" % "2.0-dt-20200930Z-3561fd",
  "org.scalablytyped.slinky" %%% "d3-drag" % "2.0-dt-20201028Z-cd5b87",
  "org.scalablytyped.slinky" %%% "d3-dsv" % "2.0-dt-20201001Z-1f9332",
  "org.scalablytyped.slinky" %%% "d3-ease" % "2.0-dt-20200930Z-c9b86f",
  "org.scalablytyped.slinky" %%% "d3-fetch" % "2.0-dt-20201001Z-59c915",
  "org.scalablytyped.slinky" %%% "d3-force" % "2.1-dt-20201002Z-e3a7a4",
  "org.scalablytyped.slinky" %%% "d3-format" % "2.0-dt-20200930Z-473978",
  "org.scalablytyped.slinky" %%% "d3-geo" % "2.0-dt-20201002Z-6361cc",
  "org.scalablytyped.slinky" %%% "d3-hierarchy" % "2.0-dt-20200929Z-3ae383",
  "org.scalablytyped.slinky" %%% "d3-interpolate" % "2.0-dt-20201001Z-8dee6d",
  "org.scalablytyped.slinky" %%% "d3-path" % "2.0-dt-20201002Z-26b3ba",
  "org.scalablytyped.slinky" %%% "d3-quadtree" % "2.0-dt-20200930Z-91fb1b",
  "org.scalablytyped.slinky" %%% "d3-random" % "2.2-dt-20201002Z-1c7a41",
  "org.scalablytyped.slinky" %%% "d3-scale" % "3.2-dt-20201104Z-a97d08",
  "org.scalablytyped.slinky" %%% "d3-selection" % "2.0-dt-20201002Z-a092b8",
  "org.scalablytyped.slinky" %%% "d3-shape" % "2.0-dt-20201028Z-6fdc08",
  "org.scalablytyped.slinky" %%% "d3-time" % "2.0-dt-20201002Z-57bc02",
  "org.scalablytyped.slinky" %%% "d3-time-format" % "3.0-dt-20201002Z-fe61b0",
  "org.scalablytyped.slinky" %%% "d3-timer" % "2.0-dt-20201002Z-4daf31",
  "org.scalablytyped.slinky" %%% "d3-transition" % "2.0-dt-20201002Z-97fdba",
  "org.scalablytyped.slinky" %%% "d3-zoom" % "2.0-dt-20201104Z-bc1863",
  "org.scalablytyped.slinky" %%% "geojson" % "7946.0-dt-20201002Z-de1c1d",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
