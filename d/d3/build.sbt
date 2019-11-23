organization := "org.scalablytyped.slinky"
name := "d3"
version := "5.7-dt-20190819Z-aa2bc5"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "d3-array" % "2.0-dt-20190221Z-0ae6e5",
  "org.scalablytyped.slinky" %%% "d3-axis" % "1.0-dt-20190212Z-189499",
  "org.scalablytyped.slinky" %%% "d3-brush" % "1.0-dt-20190212Z-d016b5",
  "org.scalablytyped.slinky" %%% "d3-chord" % "1.0-dt-20190212Z-d0787f",
  "org.scalablytyped.slinky" %%% "d3-collection" % "1.0-dt-20190212Z-ae861f",
  "org.scalablytyped.slinky" %%% "d3-color" % "1.2-dt-20190212Z-eeb7f1",
  "org.scalablytyped.slinky" %%% "d3-contour" % "1.3-dt-20190205Z-6fc297",
  "org.scalablytyped.slinky" %%% "d3-dispatch" % "1.0-dt-20190212Z-702ccf",
  "org.scalablytyped.slinky" %%% "d3-drag" % "1.2-dt-20190212Z-9d5830",
  "org.scalablytyped.slinky" %%% "d3-dsv" % "1.0-dt-20190326Z-a18b23",
  "org.scalablytyped.slinky" %%% "d3-ease" % "1.0-dt-20191014Z-b838bc",
  "org.scalablytyped.slinky" %%% "d3-force" % "1.2-dt-20190212Z-560674",
  "org.scalablytyped.slinky" %%% "d3-format" % "1.3-dt-20190212Z-f02acd",
  "org.scalablytyped.slinky" %%% "d3-geo" % "1.11-dt-20190212Z-24d6c8",
  "org.scalablytyped.slinky" %%% "d3-hierarchy" % "1.1-dt-20190212Z-2f784e",
  "org.scalablytyped.slinky" %%% "d3-interpolate" % "1.3-dt-20190212Z-8df393",
  "org.scalablytyped.slinky" %%% "d3-path" % "1.0-dt-20190212Z-a293de",
  "org.scalablytyped.slinky" %%% "d3-quadtree" % "1.0-dt-20190212Z-4f6040",
  "org.scalablytyped.slinky" %%% "d3-random" % "1.1-dt-20190212Z-3f1e4e",
  "org.scalablytyped.slinky" %%% "d3-scale" % "2.1-dt-20190212Z-0bf332",
  "org.scalablytyped.slinky" %%% "d3-selection" % "1.4-dt-20190710Z-33ce0d",
  "org.scalablytyped.slinky" %%% "d3-shape" % "1.3-dt-20191014Z-431b77",
  "org.scalablytyped.slinky" %%% "d3-time" % "1.0-dt-20190212Z-3ac37b",
  "org.scalablytyped.slinky" %%% "d3-time-format" % "2.1-dt-20190212Z-35b41b",
  "org.scalablytyped.slinky" %%% "d3-timer" % "1.0-dt-20190212Z-dd86a1",
  "org.scalablytyped.slinky" %%% "d3-transition" % "1.1-dt-20191029Z-309be3",
  "org.scalablytyped.slinky" %%% "d3-voronoi" % "1.1-dt-20190212Z-4cb02b",
  "org.scalablytyped.slinky" %%% "d3-zoom" % "1.7-dt-20190212Z-33324b",
  "org.scalablytyped.slinky" %%% "geojson" % "7946.0-dt-20190925Z-4f6c5e",
  "org.scalablytyped.slinky" %%% "std" % "3.7-317bd7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        