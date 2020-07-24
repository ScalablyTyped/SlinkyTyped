organization := "org.scalablytyped.slinky"
name := "d3"
version := "5.7-dt-20200515Z-27391a"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "d3-array" % "2.0-dt-20200515Z-427ce5",
  "org.scalablytyped.slinky" %%% "d3-axis" % "1.0-dt-20200515Z-10e77a",
  "org.scalablytyped.slinky" %%% "d3-brush" % "1.1-dt-20200605Z-669155",
  "org.scalablytyped.slinky" %%% "d3-chord" % "1.0-dt-20200515Z-8b4a7f",
  "org.scalablytyped.slinky" %%% "d3-collection" % "1.0-dt-20200515Z-bc947c",
  "org.scalablytyped.slinky" %%% "d3-color" % "1.2-dt-20200515Z-a16626",
  "org.scalablytyped.slinky" %%% "d3-contour" % "1.3-dt-20200515Z-14a96a",
  "org.scalablytyped.slinky" %%% "d3-dispatch" % "1.0-dt-20200707Z-5a0013",
  "org.scalablytyped.slinky" %%% "d3-drag" % "1.2-dt-20200515Z-b10c88",
  "org.scalablytyped.slinky" %%% "d3-dsv" % "1.0-dt-20200515Z-935b68",
  "org.scalablytyped.slinky" %%% "d3-ease" % "1.0-dt-20200515Z-9357f3",
  "org.scalablytyped.slinky" %%% "d3-fetch" % "1.1-dt-20200515Z-e32ed5",
  "org.scalablytyped.slinky" %%% "d3-force" % "1.2-dt-20200515Z-30a03b",
  "org.scalablytyped.slinky" %%% "d3-format" % "1.3-dt-20200515Z-d1b3a5",
  "org.scalablytyped.slinky" %%% "d3-geo" % "1.11-dt-20200515Z-dc62cc",
  "org.scalablytyped.slinky" %%% "d3-hierarchy" % "1.1-dt-20200515Z-e9cbe3",
  "org.scalablytyped.slinky" %%% "d3-interpolate" % "1.3-dt-20200515Z-a5593f",
  "org.scalablytyped.slinky" %%% "d3-path" % "1.0-dt-20200515Z-6d7225",
  "org.scalablytyped.slinky" %%% "d3-quadtree" % "1.0-dt-20200515Z-2e796f",
  "org.scalablytyped.slinky" %%% "d3-random" % "1.1-dt-20200515Z-bddd85",
  "org.scalablytyped.slinky" %%% "d3-scale" % "2.2-dt-20200515Z-8c28f1",
  "org.scalablytyped.slinky" %%% "d3-selection" % "1.4-dt-20200707Z-40d2e1",
  "org.scalablytyped.slinky" %%% "d3-shape" % "1.3-dt-20200515Z-a45d69",
  "org.scalablytyped.slinky" %%% "d3-time" % "1.0-dt-20200515Z-62ba9b",
  "org.scalablytyped.slinky" %%% "d3-time-format" % "2.1-dt-20200515Z-41e3e4",
  "org.scalablytyped.slinky" %%% "d3-timer" % "1.0-dt-20200515Z-8fb6cf",
  "org.scalablytyped.slinky" %%% "d3-transition" % "1.1-dt-20200515Z-690ef6",
  "org.scalablytyped.slinky" %%% "d3-voronoi" % "1.1-dt-20200515Z-5ef091",
  "org.scalablytyped.slinky" %%% "d3-zoom" % "1.7-dt-20200515Z-3531b2",
  "org.scalablytyped.slinky" %%% "geojson" % "7946.0-dt-20200515Z-350b71",
  "org.scalablytyped.slinky" %%% "std" % "3.9-25efe0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
