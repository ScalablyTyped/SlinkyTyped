organization := "org.scalablytyped.slinky"
name := "d3"
version := "5.7-dt-20200515Z-e039d5"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "d3-array" % "2.0-dt-20200515Z-5df2a0",
  "org.scalablytyped.slinky" %%% "d3-axis" % "1.0-dt-20200515Z-183176",
  "org.scalablytyped.slinky" %%% "d3-brush" % "1.1-dt-20200515Z-839013",
  "org.scalablytyped.slinky" %%% "d3-chord" % "1.0-dt-20200515Z-13d4ca",
  "org.scalablytyped.slinky" %%% "d3-collection" % "1.0-dt-20200515Z-4c4cb3",
  "org.scalablytyped.slinky" %%% "d3-color" % "1.2-dt-20200515Z-3f1e5c",
  "org.scalablytyped.slinky" %%% "d3-contour" % "1.3-dt-20200515Z-9bef86",
  "org.scalablytyped.slinky" %%% "d3-dispatch" % "1.0-dt-20200515Z-e08e75",
  "org.scalablytyped.slinky" %%% "d3-drag" % "1.2-dt-20200515Z-e5c39c",
  "org.scalablytyped.slinky" %%% "d3-dsv" % "1.0-dt-20200515Z-515a56",
  "org.scalablytyped.slinky" %%% "d3-ease" % "1.0-dt-20200515Z-9357f3",
  "org.scalablytyped.slinky" %%% "d3-fetch" % "1.1-dt-20200515Z-00defa",
  "org.scalablytyped.slinky" %%% "d3-force" % "1.2-dt-20200515Z-fbb7a9",
  "org.scalablytyped.slinky" %%% "d3-format" % "1.3-dt-20200515Z-1a1478",
  "org.scalablytyped.slinky" %%% "d3-geo" % "1.11-dt-20200515Z-8b9888",
  "org.scalablytyped.slinky" %%% "d3-hierarchy" % "1.1-dt-20200515Z-f79810",
  "org.scalablytyped.slinky" %%% "d3-interpolate" % "1.3-dt-20200515Z-f424bc",
  "org.scalablytyped.slinky" %%% "d3-path" % "1.0-dt-20200515Z-6d7225",
  "org.scalablytyped.slinky" %%% "d3-quadtree" % "1.0-dt-20200515Z-fb6a41",
  "org.scalablytyped.slinky" %%% "d3-random" % "1.1-dt-20200515Z-d7d98d",
  "org.scalablytyped.slinky" %%% "d3-scale" % "2.2-dt-20200515Z-cda31e",
  "org.scalablytyped.slinky" %%% "d3-selection" % "1.4-dt-20200515Z-1795e9",
  "org.scalablytyped.slinky" %%% "d3-shape" % "1.3-dt-20200515Z-21b5fc",
  "org.scalablytyped.slinky" %%% "d3-time" % "1.0-dt-20200515Z-4084dd",
  "org.scalablytyped.slinky" %%% "d3-time-format" % "2.1-dt-20200515Z-c4de6b",
  "org.scalablytyped.slinky" %%% "d3-timer" % "1.0-dt-20200515Z-4d48ca",
  "org.scalablytyped.slinky" %%% "d3-transition" % "1.1-dt-20200515Z-52888f",
  "org.scalablytyped.slinky" %%% "d3-voronoi" % "1.1-dt-20200515Z-72d2f2",
  "org.scalablytyped.slinky" %%% "d3-zoom" % "1.7-dt-20200515Z-296504",
  "org.scalablytyped.slinky" %%% "geojson" % "7946.0-dt-20200515Z-a1852e",
  "org.scalablytyped.slinky" %%% "std" % "3.9-a77a62")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
