organization := "org.scalablytyped.slinky"
name := "d3"
version := "6.2-dt-20201118Z-462804"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "d3-array" % "2.8-dt-20201116Z-e07531",
  "org.scalablytyped.slinky" %%% "d3-axis" % "2.0-dt-20201104Z-dff3cc",
  "org.scalablytyped.slinky" %%% "d3-brush" % "2.1-dt-20200930Z-ad0e45",
  "org.scalablytyped.slinky" %%% "d3-chord" % "2.0-dt-20200929Z-d6ce83",
  "org.scalablytyped.slinky" %%% "d3-color" % "2.0-dt-20201117Z-ff546b",
  "org.scalablytyped.slinky" %%% "d3-contour" % "2.0-dt-20200930Z-3b5fa1",
  "org.scalablytyped.slinky" %%% "d3-delaunay" % "5.3-dt-20200930Z-bfbe98",
  "org.scalablytyped.slinky" %%% "d3-dispatch" % "2.0-dt-20200930Z-4797ae",
  "org.scalablytyped.slinky" %%% "d3-drag" % "2.0-dt-20201028Z-661934",
  "org.scalablytyped.slinky" %%% "d3-dsv" % "2.0-dt-20201001Z-d9d7fe",
  "org.scalablytyped.slinky" %%% "d3-ease" % "2.0-dt-20200930Z-3ac298",
  "org.scalablytyped.slinky" %%% "d3-fetch" % "2.0-dt-20201001Z-730d6c",
  "org.scalablytyped.slinky" %%% "d3-force" % "2.1-dt-20201002Z-28420e",
  "org.scalablytyped.slinky" %%% "d3-format" % "2.0-dt-20200930Z-300c83",
  "org.scalablytyped.slinky" %%% "d3-geo" % "2.0-dt-20201002Z-7431ce",
  "org.scalablytyped.slinky" %%% "d3-hierarchy" % "2.0-dt-20200929Z-1cbd07",
  "org.scalablytyped.slinky" %%% "d3-interpolate" % "2.0-dt-20201001Z-6a16df",
  "org.scalablytyped.slinky" %%% "d3-path" % "2.0-dt-20201002Z-a7eba9",
  "org.scalablytyped.slinky" %%% "d3-quadtree" % "2.0-dt-20200930Z-1e014a",
  "org.scalablytyped.slinky" %%% "d3-random" % "2.2-dt-20201002Z-be38eb",
  "org.scalablytyped.slinky" %%% "d3-scale" % "3.2-dt-20201104Z-9aba9f",
  "org.scalablytyped.slinky" %%% "d3-selection" % "2.0-dt-20201002Z-67bdbd",
  "org.scalablytyped.slinky" %%% "d3-shape" % "2.0-dt-20201028Z-3ab6d3",
  "org.scalablytyped.slinky" %%% "d3-time" % "2.0-dt-20201002Z-e3a5ec",
  "org.scalablytyped.slinky" %%% "d3-time-format" % "3.0-dt-20201002Z-e721ee",
  "org.scalablytyped.slinky" %%% "d3-timer" % "2.0-dt-20201002Z-ce8821",
  "org.scalablytyped.slinky" %%% "d3-transition" % "2.0-dt-20201002Z-fd0136",
  "org.scalablytyped.slinky" %%% "d3-zoom" % "2.0-dt-20201104Z-a79ce3",
  "org.scalablytyped.slinky" %%% "geojson" % "7946.0-dt-20201002Z-d847cc",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
