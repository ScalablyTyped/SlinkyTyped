organization := "org.scalablytyped.slinky"
name := "d3"
version := "5.7-dt-20200515Z-05264a"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "d3-array" % "2.0-dt-20200515Z-20cc0d",
  "org.scalablytyped.slinky" %%% "d3-axis" % "1.0-dt-20200515Z-e13add",
  "org.scalablytyped.slinky" %%% "d3-brush" % "1.1-dt-20200605Z-875630",
  "org.scalablytyped.slinky" %%% "d3-chord" % "1.0-dt-20200515Z-b81547",
  "org.scalablytyped.slinky" %%% "d3-collection" % "1.0-dt-20200515Z-8ea6e3",
  "org.scalablytyped.slinky" %%% "d3-color" % "1.2-dt-20200515Z-3e2313",
  "org.scalablytyped.slinky" %%% "d3-contour" % "1.3-dt-20200515Z-b2072e",
  "org.scalablytyped.slinky" %%% "d3-dispatch" % "1.0-dt-20200707Z-06bf8d",
  "org.scalablytyped.slinky" %%% "d3-drag" % "1.2-dt-20200515Z-5ba966",
  "org.scalablytyped.slinky" %%% "d3-dsv" % "1.0-dt-20200515Z-fd6868",
  "org.scalablytyped.slinky" %%% "d3-ease" % "1.0-dt-20200515Z-c9b86f",
  "org.scalablytyped.slinky" %%% "d3-fetch" % "1.1-dt-20200515Z-60ce4e",
  "org.scalablytyped.slinky" %%% "d3-force" % "1.2-dt-20200515Z-2ce5e4",
  "org.scalablytyped.slinky" %%% "d3-format" % "1.3-dt-20200515Z-025c36",
  "org.scalablytyped.slinky" %%% "d3-geo" % "1.11-dt-20200515Z-86934d",
  "org.scalablytyped.slinky" %%% "d3-hierarchy" % "1.1-dt-20200515Z-84c994",
  "org.scalablytyped.slinky" %%% "d3-interpolate" % "1.3-dt-20200515Z-46cb06",
  "org.scalablytyped.slinky" %%% "d3-path" % "1.0-dt-20200515Z-26b3ba",
  "org.scalablytyped.slinky" %%% "d3-quadtree" % "1.0-dt-20200515Z-0319ef",
  "org.scalablytyped.slinky" %%% "d3-random" % "1.1-dt-20200515Z-1fcddb",
  "org.scalablytyped.slinky" %%% "d3-scale" % "2.2-dt-20200515Z-5bd758",
  "org.scalablytyped.slinky" %%% "d3-selection" % "1.4-dt-20200707Z-e0c377",
  "org.scalablytyped.slinky" %%% "d3-shape" % "1.3-dt-20200515Z-8729ce",
  "org.scalablytyped.slinky" %%% "d3-time" % "1.0-dt-20200515Z-3f492a",
  "org.scalablytyped.slinky" %%% "d3-time-format" % "2.1-dt-20200515Z-6f7f76",
  "org.scalablytyped.slinky" %%% "d3-timer" % "1.0-dt-20200515Z-4daf31",
  "org.scalablytyped.slinky" %%% "d3-transition" % "1.1-dt-20200515Z-8183b5",
  "org.scalablytyped.slinky" %%% "d3-voronoi" % "1.1-dt-20200515Z-6418e1",
  "org.scalablytyped.slinky" %%% "d3-zoom" % "1.7-dt-20200515Z-8a86d1",
  "org.scalablytyped.slinky" %%% "geojson" % "7946.0-dt-20200515Z-638879",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
