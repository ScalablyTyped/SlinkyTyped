organization := "org.scalablytyped.slinky"
name := "d3"
version := "5.7-dt-20200515Z-729903"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "d3-array" % "2.0-dt-20200515Z-52d9bd",
  "org.scalablytyped.slinky" %%% "d3-axis" % "1.0-dt-20200515Z-770062",
  "org.scalablytyped.slinky" %%% "d3-brush" % "1.1-dt-20200605Z-b8c42b",
  "org.scalablytyped.slinky" %%% "d3-chord" % "1.0-dt-20200515Z-c4b49e",
  "org.scalablytyped.slinky" %%% "d3-collection" % "1.0-dt-20200515Z-9c05e8",
  "org.scalablytyped.slinky" %%% "d3-color" % "1.2-dt-20200515Z-e40bb4",
  "org.scalablytyped.slinky" %%% "d3-contour" % "1.3-dt-20200515Z-841280",
  "org.scalablytyped.slinky" %%% "d3-dispatch" % "1.0-dt-20200515Z-bb8121",
  "org.scalablytyped.slinky" %%% "d3-drag" % "1.2-dt-20200515Z-436463",
  "org.scalablytyped.slinky" %%% "d3-dsv" % "1.0-dt-20200515Z-f619db",
  "org.scalablytyped.slinky" %%% "d3-ease" % "1.0-dt-20200515Z-9357f3",
  "org.scalablytyped.slinky" %%% "d3-fetch" % "1.1-dt-20200515Z-1fde38",
  "org.scalablytyped.slinky" %%% "d3-force" % "1.2-dt-20200515Z-8ee0f9",
  "org.scalablytyped.slinky" %%% "d3-format" % "1.3-dt-20200515Z-463c85",
  "org.scalablytyped.slinky" %%% "d3-geo" % "1.11-dt-20200515Z-130b20",
  "org.scalablytyped.slinky" %%% "d3-hierarchy" % "1.1-dt-20200515Z-fd54be",
  "org.scalablytyped.slinky" %%% "d3-interpolate" % "1.3-dt-20200515Z-92ee3b",
  "org.scalablytyped.slinky" %%% "d3-path" % "1.0-dt-20200515Z-6d7225",
  "org.scalablytyped.slinky" %%% "d3-quadtree" % "1.0-dt-20200515Z-bd16cc",
  "org.scalablytyped.slinky" %%% "d3-random" % "1.1-dt-20200515Z-bddd85",
  "org.scalablytyped.slinky" %%% "d3-scale" % "2.2-dt-20200515Z-61581f",
  "org.scalablytyped.slinky" %%% "d3-selection" % "1.4-dt-20200515Z-d60d5b",
  "org.scalablytyped.slinky" %%% "d3-shape" % "1.3-dt-20200515Z-733413",
  "org.scalablytyped.slinky" %%% "d3-time" % "1.0-dt-20200515Z-5a06ec",
  "org.scalablytyped.slinky" %%% "d3-time-format" % "2.1-dt-20200515Z-ab9d76",
  "org.scalablytyped.slinky" %%% "d3-timer" % "1.0-dt-20200515Z-8fb6cf",
  "org.scalablytyped.slinky" %%% "d3-transition" % "1.1-dt-20200515Z-9fa94b",
  "org.scalablytyped.slinky" %%% "d3-voronoi" % "1.1-dt-20200515Z-787c92",
  "org.scalablytyped.slinky" %%% "d3-zoom" % "1.7-dt-20200515Z-b4afd3",
  "org.scalablytyped.slinky" %%% "geojson" % "7946.0-dt-20200515Z-a4c2d2",
  "org.scalablytyped.slinky" %%% "std" % "3.9-dec240")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
