organization := "org.scalablytyped.slinky"
name := "react-plotly_dot_js"
version := "2.2-dt-20191126Z-c7e28a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-f22bc8",
  "org.scalablytyped.slinky" %%% "d3-array" % "2.0-dt-20190221Z-9674f4",
  "org.scalablytyped.slinky" %%% "d3-axis" % "1.0-dt-20190212Z-4faa42",
  "org.scalablytyped.slinky" %%% "d3-brush" % "1.0-dt-20190212Z-7ea92b",
  "org.scalablytyped.slinky" %%% "d3-chord" % "1.0-dt-20190212Z-100bd1",
  "org.scalablytyped.slinky" %%% "d3-collection" % "1.0-dt-20190212Z-36e2c3",
  "org.scalablytyped.slinky" %%% "d3-color" % "1.2-dt-20190212Z-fa9d5f",
  "org.scalablytyped.slinky" %%% "d3-contour" % "1.3-dt-20190205Z-65187c",
  "org.scalablytyped.slinky" %%% "d3-dispatch" % "1.0-dt-20190212Z-473d3c",
  "org.scalablytyped.slinky" %%% "d3-drag" % "1.2-dt-20190212Z-cad6f2",
  "org.scalablytyped.slinky" %%% "d3-dsv" % "1.0-dt-20190326Z-885549",
  "org.scalablytyped.slinky" %%% "d3-ease" % "1.0-dt-20191014Z-175a76",
  "org.scalablytyped.slinky" %%% "d3-force" % "1.2-dt-20190212Z-122fa3",
  "org.scalablytyped.slinky" %%% "d3-format" % "1.3-dt-20190212Z-c787cb",
  "org.scalablytyped.slinky" %%% "d3-geo" % "1.11-dt-20190212Z-ebf829",
  "org.scalablytyped.slinky" %%% "d3-hierarchy" % "1.1-dt-20190212Z-615d5c",
  "org.scalablytyped.slinky" %%% "d3-interpolate" % "1.3-dt-20190212Z-01713d",
  "org.scalablytyped.slinky" %%% "d3-path" % "1.0-dt-20190212Z-4a26d0",
  "org.scalablytyped.slinky" %%% "d3-quadtree" % "1.0-dt-20190212Z-9845d0",
  "org.scalablytyped.slinky" %%% "d3-random" % "1.1-dt-20190212Z-3f1e4e",
  "org.scalablytyped.slinky" %%% "d3-scale" % "2.1-dt-20190212Z-690198",
  "org.scalablytyped.slinky" %%% "d3-selection" % "1.4-dt-20190710Z-e8dbdc",
  "org.scalablytyped.slinky" %%% "d3-shape" % "1.3-dt-20191014Z-2eabec",
  "org.scalablytyped.slinky" %%% "d3-time" % "1.0-dt-20190212Z-c0c9de",
  "org.scalablytyped.slinky" %%% "d3-time-format" % "2.1-dt-20190212Z-87f21d",
  "org.scalablytyped.slinky" %%% "d3-timer" % "1.0-dt-20190212Z-38e570",
  "org.scalablytyped.slinky" %%% "d3-transition" % "1.1-dt-20191029Z-98e406",
  "org.scalablytyped.slinky" %%% "d3-voronoi" % "1.1-dt-20190212Z-1e22b0",
  "org.scalablytyped.slinky" %%% "d3-zoom" % "1.7-dt-20190212Z-b9901d",
  "org.scalablytyped.slinky" %%% "geojson" % "7946.0-dt-20190925Z-bf6259",
  "org.scalablytyped.slinky" %%% "plotly_dot_js" % "1.44-dt-20200102Z-6e125b",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-1d231d",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20191220Z-f02704",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        