organization := "org.scalablytyped.slinky"
name := "plotly_dot_js"
version := "1.44-dt-20191126Z-c59bb3"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "d3-array" % "2.0-dt-20190221Z-e9f50a",
  "org.scalablytyped.slinky" %%% "d3-axis" % "1.0-dt-20190212Z-09289e",
  "org.scalablytyped.slinky" %%% "d3-brush" % "1.0-dt-20190212Z-1b5b76",
  "org.scalablytyped.slinky" %%% "d3-chord" % "1.0-dt-20190212Z-41d31e",
  "org.scalablytyped.slinky" %%% "d3-collection" % "1.0-dt-20190212Z-47278e",
  "org.scalablytyped.slinky" %%% "d3-color" % "1.2-dt-20190212Z-befa4f",
  "org.scalablytyped.slinky" %%% "d3-contour" % "1.3-dt-20190205Z-199075",
  "org.scalablytyped.slinky" %%% "d3-dispatch" % "1.0-dt-20190212Z-f1d7d4",
  "org.scalablytyped.slinky" %%% "d3-drag" % "1.2-dt-20190212Z-a467ec",
  "org.scalablytyped.slinky" %%% "d3-dsv" % "1.0-dt-20190326Z-d4eab5",
  "org.scalablytyped.slinky" %%% "d3-ease" % "1.0-dt-20191014Z-b838bc",
  "org.scalablytyped.slinky" %%% "d3-force" % "1.2-dt-20190212Z-20b299",
  "org.scalablytyped.slinky" %%% "d3-format" % "1.3-dt-20190212Z-1b67df",
  "org.scalablytyped.slinky" %%% "d3-geo" % "1.11-dt-20190212Z-4c8026",
  "org.scalablytyped.slinky" %%% "d3-hierarchy" % "1.1-dt-20190212Z-c4a2db",
  "org.scalablytyped.slinky" %%% "d3-interpolate" % "1.3-dt-20190212Z-d6860a",
  "org.scalablytyped.slinky" %%% "d3-path" % "1.0-dt-20190212Z-a293de",
  "org.scalablytyped.slinky" %%% "d3-quadtree" % "1.0-dt-20190212Z-9b982a",
  "org.scalablytyped.slinky" %%% "d3-random" % "1.1-dt-20190212Z-3f1e4e",
  "org.scalablytyped.slinky" %%% "d3-scale" % "2.1-dt-20190212Z-c1de3c",
  "org.scalablytyped.slinky" %%% "d3-selection" % "1.4-dt-20190710Z-7ae6a9",
  "org.scalablytyped.slinky" %%% "d3-shape" % "1.3-dt-20191014Z-1b83e3",
  "org.scalablytyped.slinky" %%% "d3-time" % "1.0-dt-20190212Z-8ceaf1",
  "org.scalablytyped.slinky" %%% "d3-time-format" % "2.1-dt-20190212Z-421bf3",
  "org.scalablytyped.slinky" %%% "d3-timer" % "1.0-dt-20190212Z-dd86a1",
  "org.scalablytyped.slinky" %%% "d3-transition" % "1.1-dt-20191029Z-7c1da9",
  "org.scalablytyped.slinky" %%% "d3-voronoi" % "1.1-dt-20190212Z-b75ecf",
  "org.scalablytyped.slinky" %%% "d3-zoom" % "1.7-dt-20190212Z-54167b",
  "org.scalablytyped.slinky" %%% "geojson" % "7946.0-dt-20190925Z-494d92",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        