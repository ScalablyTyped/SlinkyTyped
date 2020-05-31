organization := "org.scalablytyped.slinky"
name := "d3"
version := "5.7-dt-20200515Z-c00add"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "d3-array" % "2.0-dt-20200515Z-46e07c",
  "org.scalablytyped.slinky" %%% "d3-axis" % "1.0-dt-20200515Z-ab19eb",
  "org.scalablytyped.slinky" %%% "d3-brush" % "1.1-dt-20200515Z-d7be15",
  "org.scalablytyped.slinky" %%% "d3-chord" % "1.0-dt-20200515Z-142a54",
  "org.scalablytyped.slinky" %%% "d3-collection" % "1.0-dt-20200515Z-050fea",
  "org.scalablytyped.slinky" %%% "d3-color" % "1.2-dt-20200515Z-86e9b4",
  "org.scalablytyped.slinky" %%% "d3-contour" % "1.3-dt-20200515Z-dcdf08",
  "org.scalablytyped.slinky" %%% "d3-dispatch" % "1.0-dt-20200515Z-da9567",
  "org.scalablytyped.slinky" %%% "d3-drag" % "1.2-dt-20200515Z-51e66e",
  "org.scalablytyped.slinky" %%% "d3-dsv" % "1.0-dt-20200515Z-240729",
  "org.scalablytyped.slinky" %%% "d3-ease" % "1.0-dt-20200515Z-9357f3",
  "org.scalablytyped.slinky" %%% "d3-fetch" % "1.1-dt-20200515Z-c00f35",
  "org.scalablytyped.slinky" %%% "d3-force" % "1.2-dt-20200515Z-942b47",
  "org.scalablytyped.slinky" %%% "d3-format" % "1.3-dt-20200515Z-01d392",
  "org.scalablytyped.slinky" %%% "d3-geo" % "1.11-dt-20200515Z-52bff5",
  "org.scalablytyped.slinky" %%% "d3-hierarchy" % "1.1-dt-20200515Z-23649c",
  "org.scalablytyped.slinky" %%% "d3-interpolate" % "1.3-dt-20200515Z-3a4bb1",
  "org.scalablytyped.slinky" %%% "d3-path" % "1.0-dt-20200515Z-6d7225",
  "org.scalablytyped.slinky" %%% "d3-quadtree" % "1.0-dt-20200515Z-20885c",
  "org.scalablytyped.slinky" %%% "d3-random" % "1.1-dt-20200515Z-9243dd",
  "org.scalablytyped.slinky" %%% "d3-scale" % "2.2-dt-20200515Z-cc2c8d",
  "org.scalablytyped.slinky" %%% "d3-selection" % "1.4-dt-20200515Z-33f8c9",
  "org.scalablytyped.slinky" %%% "d3-shape" % "1.3-dt-20200515Z-096146",
  "org.scalablytyped.slinky" %%% "d3-time" % "1.0-dt-20200515Z-2edf0d",
  "org.scalablytyped.slinky" %%% "d3-time-format" % "2.1-dt-20200515Z-ee2ca0",
  "org.scalablytyped.slinky" %%% "d3-timer" % "1.0-dt-20200515Z-4d48ca",
  "org.scalablytyped.slinky" %%% "d3-transition" % "1.1-dt-20200515Z-cbf1ca",
  "org.scalablytyped.slinky" %%% "d3-voronoi" % "1.1-dt-20200515Z-e20509",
  "org.scalablytyped.slinky" %%% "d3-zoom" % "1.7-dt-20200515Z-78212a",
  "org.scalablytyped.slinky" %%% "geojson" % "7946.0-dt-20200515Z-762b9c",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
