organization := "org.scalablytyped.slinky"
name := "plotly_dot_js"
version := "1.50-dt-20200416Z-3886ed"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "d3-array" % "2.0-dt-20200225Z-fffc7d",
  "org.scalablytyped.slinky" %%% "d3-axis" % "1.0-dt-20200225Z-e9ad4a",
  "org.scalablytyped.slinky" %%% "d3-brush" % "1.1-dt-20200302Z-1febdf",
  "org.scalablytyped.slinky" %%% "d3-chord" % "1.0-dt-20200225Z-0675a4",
  "org.scalablytyped.slinky" %%% "d3-collection" % "1.0-dt-20200225Z-d89df2",
  "org.scalablytyped.slinky" %%% "d3-color" % "1.2-dt-20200225Z-e569e9",
  "org.scalablytyped.slinky" %%% "d3-contour" % "1.3-dt-20200225Z-d0207c",
  "org.scalablytyped.slinky" %%% "d3-dispatch" % "1.0-dt-20200225Z-59cb74",
  "org.scalablytyped.slinky" %%% "d3-drag" % "1.2-dt-20200225Z-04a1df",
  "org.scalablytyped.slinky" %%% "d3-dsv" % "1.0-dt-20200225Z-0701fb",
  "org.scalablytyped.slinky" %%% "d3-ease" % "1.0-dt-20191014Z-1c163b",
  "org.scalablytyped.slinky" %%% "d3-fetch" % "1.1-dt-20200225Z-fee945",
  "org.scalablytyped.slinky" %%% "d3-force" % "1.2-dt-20200225Z-82476d",
  "org.scalablytyped.slinky" %%% "d3-format" % "1.3-dt-20190212Z-1a7ca5",
  "org.scalablytyped.slinky" %%% "d3-geo" % "1.11-dt-20200225Z-026942",
  "org.scalablytyped.slinky" %%% "d3-hierarchy" % "1.1-dt-20200225Z-13167c",
  "org.scalablytyped.slinky" %%% "d3-interpolate" % "1.3-dt-20200225Z-96dfc8",
  "org.scalablytyped.slinky" %%% "d3-path" % "1.0-dt-20190212Z-709f0d",
  "org.scalablytyped.slinky" %%% "d3-quadtree" % "1.0-dt-20200225Z-0ee20d",
  "org.scalablytyped.slinky" %%% "d3-random" % "1.1-dt-20190212Z-576dfe",
  "org.scalablytyped.slinky" %%% "d3-scale" % "2.2-dt-20200305Z-bae733",
  "org.scalablytyped.slinky" %%% "d3-selection" % "1.4-dt-20200320Z-176a7c",
  "org.scalablytyped.slinky" %%% "d3-shape" % "1.3-dt-20200225Z-1b0c16",
  "org.scalablytyped.slinky" %%% "d3-time" % "1.0-dt-20190212Z-dc4671",
  "org.scalablytyped.slinky" %%% "d3-time-format" % "2.1-dt-20190212Z-edad63",
  "org.scalablytyped.slinky" %%% "d3-timer" % "1.0-dt-20190212Z-25ccd9",
  "org.scalablytyped.slinky" %%% "d3-transition" % "1.1-dt-20200225Z-299d57",
  "org.scalablytyped.slinky" %%% "d3-voronoi" % "1.1-dt-20200225Z-1b07c3",
  "org.scalablytyped.slinky" %%% "d3-zoom" % "1.7-dt-20200225Z-9603dc",
  "org.scalablytyped.slinky" %%% "geojson" % "7946.0-dt-20190925Z-114ee8",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
