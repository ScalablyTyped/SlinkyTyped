organization := "org.scalablytyped.slinky"
name := "plotly_dot_js"
version := "1.50-dt-20200720Z-a0ee12"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "d3-array" % "2.0-dt-20200515Z-df3a84",
  "org.scalablytyped.slinky" %%% "d3-axis" % "1.0-dt-20200515Z-e16812",
  "org.scalablytyped.slinky" %%% "d3-brush" % "1.1-dt-20200605Z-5c3c88",
  "org.scalablytyped.slinky" %%% "d3-chord" % "1.0-dt-20200515Z-756af8",
  "org.scalablytyped.slinky" %%% "d3-collection" % "1.0-dt-20200515Z-8ae7c4",
  "org.scalablytyped.slinky" %%% "d3-color" % "1.2-dt-20200515Z-d28d77",
  "org.scalablytyped.slinky" %%% "d3-contour" % "1.3-dt-20200515Z-6a8a6e",
  "org.scalablytyped.slinky" %%% "d3-dispatch" % "1.0-dt-20200707Z-0e074a",
  "org.scalablytyped.slinky" %%% "d3-drag" % "1.2-dt-20200515Z-32be82",
  "org.scalablytyped.slinky" %%% "d3-dsv" % "1.0-dt-20200515Z-bf241a",
  "org.scalablytyped.slinky" %%% "d3-ease" % "1.0-dt-20200515Z-cb70c1",
  "org.scalablytyped.slinky" %%% "d3-fetch" % "1.1-dt-20200515Z-f394bd",
  "org.scalablytyped.slinky" %%% "d3-force" % "1.2-dt-20200515Z-6a257c",
  "org.scalablytyped.slinky" %%% "d3-format" % "1.3-dt-20200515Z-0bf6a1",
  "org.scalablytyped.slinky" %%% "d3-geo" % "1.11-dt-20200515Z-5c3a85",
  "org.scalablytyped.slinky" %%% "d3-hierarchy" % "1.1-dt-20200515Z-31ec32",
  "org.scalablytyped.slinky" %%% "d3-interpolate" % "1.3-dt-20200515Z-f38770",
  "org.scalablytyped.slinky" %%% "d3-path" % "1.0-dt-20200515Z-938e93",
  "org.scalablytyped.slinky" %%% "d3-quadtree" % "1.0-dt-20200515Z-4edf5b",
  "org.scalablytyped.slinky" %%% "d3-random" % "1.1-dt-20200515Z-808304",
  "org.scalablytyped.slinky" %%% "d3-scale" % "2.2-dt-20200515Z-cac23b",
  "org.scalablytyped.slinky" %%% "d3-selection" % "1.4-dt-20200707Z-7e5f10",
  "org.scalablytyped.slinky" %%% "d3-shape" % "1.3-dt-20200515Z-29cbdb",
  "org.scalablytyped.slinky" %%% "d3-time" % "1.0-dt-20200515Z-b1a86c",
  "org.scalablytyped.slinky" %%% "d3-time-format" % "2.1-dt-20200515Z-a36230",
  "org.scalablytyped.slinky" %%% "d3-timer" % "1.0-dt-20200515Z-cde312",
  "org.scalablytyped.slinky" %%% "d3-transition" % "1.1-dt-20200515Z-b7e3bd",
  "org.scalablytyped.slinky" %%% "d3-voronoi" % "1.1-dt-20200515Z-c0bb17",
  "org.scalablytyped.slinky" %%% "d3-zoom" % "1.7-dt-20200515Z-8a2abc",
  "org.scalablytyped.slinky" %%% "geojson" % "7946.0-dt-20200515Z-68144b",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
