organization := "org.scalablytyped.slinky"
name := "d3"
version := "5.7-dt-20190819Z-c5a176"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "d3-array" % "2.0-dt-20190221Z-b8dfbd",
  "org.scalablytyped.slinky" %%% "d3-axis" % "1.0-dt-20190212Z-3d869b",
  "org.scalablytyped.slinky" %%% "d3-brush" % "1.0-dt-20190212Z-42c49f",
  "org.scalablytyped.slinky" %%% "d3-chord" % "1.0-dt-20190212Z-f1d152",
  "org.scalablytyped.slinky" %%% "d3-collection" % "1.0-dt-20190212Z-223185",
  "org.scalablytyped.slinky" %%% "d3-color" % "1.2-dt-20190212Z-44bdd0",
  "org.scalablytyped.slinky" %%% "d3-contour" % "1.3-dt-20190205Z-c6cb80",
  "org.scalablytyped.slinky" %%% "d3-dispatch" % "1.0-dt-20190212Z-6831a3",
  "org.scalablytyped.slinky" %%% "d3-drag" % "1.2-dt-20190212Z-fdf0c3",
  "org.scalablytyped.slinky" %%% "d3-dsv" % "1.0-dt-20190326Z-4f59ee",
  "org.scalablytyped.slinky" %%% "d3-ease" % "1.0-dt-20191014Z-98c70b",
  "org.scalablytyped.slinky" %%% "d3-force" % "1.2-dt-20190212Z-bfbcf5",
  "org.scalablytyped.slinky" %%% "d3-format" % "1.3-dt-20190212Z-a9a6fb",
  "org.scalablytyped.slinky" %%% "d3-geo" % "1.11-dt-20190212Z-6a9fc5",
  "org.scalablytyped.slinky" %%% "d3-hierarchy" % "1.1-dt-20190212Z-d58357",
  "org.scalablytyped.slinky" %%% "d3-interpolate" % "1.3-dt-20190212Z-93d684",
  "org.scalablytyped.slinky" %%% "d3-path" % "1.0-dt-20190212Z-af7521",
  "org.scalablytyped.slinky" %%% "d3-quadtree" % "1.0-dt-20190212Z-e84f69",
  "org.scalablytyped.slinky" %%% "d3-random" % "1.1-dt-20190212Z-b0401d",
  "org.scalablytyped.slinky" %%% "d3-scale" % "2.1-dt-20190212Z-7f96dd",
  "org.scalablytyped.slinky" %%% "d3-selection" % "1.4-dt-20190710Z-eef2cb",
  "org.scalablytyped.slinky" %%% "d3-shape" % "1.3-dt-20191014Z-f03122",
  "org.scalablytyped.slinky" %%% "d3-time" % "1.0-dt-20190212Z-d2c5b2",
  "org.scalablytyped.slinky" %%% "d3-time-format" % "2.1-dt-20190212Z-215496",
  "org.scalablytyped.slinky" %%% "d3-timer" % "1.0-dt-20190212Z-7cdf96",
  "org.scalablytyped.slinky" %%% "d3-transition" % "1.1-dt-20191029Z-120e1f",
  "org.scalablytyped.slinky" %%% "d3-voronoi" % "1.1-dt-20190212Z-fce8ca",
  "org.scalablytyped.slinky" %%% "d3-zoom" % "1.7-dt-20190212Z-d9202a",
  "org.scalablytyped.slinky" %%% "geojson" % "7946.0-dt-20190925Z-301554",
  "org.scalablytyped.slinky" %%% "std" % "3.7-5d968d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        