organization := "org.scalablytyped.slinky"
name := "d3"
version := "5.7-dt-20190819Z-a17f89"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "d3-array" % "2.0-dt-20190221Z-f94943",
  "org.scalablytyped.slinky" %%% "d3-axis" % "1.0-dt-20190212Z-828f67",
  "org.scalablytyped.slinky" %%% "d3-brush" % "1.0-dt-20190212Z-b9b039",
  "org.scalablytyped.slinky" %%% "d3-chord" % "1.0-dt-20190212Z-d6432e",
  "org.scalablytyped.slinky" %%% "d3-collection" % "1.0-dt-20190212Z-c42bec",
  "org.scalablytyped.slinky" %%% "d3-color" % "1.2-dt-20190212Z-22dafa",
  "org.scalablytyped.slinky" %%% "d3-contour" % "1.3-dt-20190205Z-c56bb3",
  "org.scalablytyped.slinky" %%% "d3-dispatch" % "1.0-dt-20190212Z-b24acc",
  "org.scalablytyped.slinky" %%% "d3-drag" % "1.2-dt-20190212Z-b886d5",
  "org.scalablytyped.slinky" %%% "d3-dsv" % "1.0-dt-20190326Z-ee1235",
  "org.scalablytyped.slinky" %%% "d3-ease" % "1.0-dt-20191014Z-98c70b",
  "org.scalablytyped.slinky" %%% "d3-force" % "1.2-dt-20190212Z-143fff",
  "org.scalablytyped.slinky" %%% "d3-format" % "1.3-dt-20190212Z-b12db0",
  "org.scalablytyped.slinky" %%% "d3-geo" % "1.11-dt-20190212Z-34e9a7",
  "org.scalablytyped.slinky" %%% "d3-hierarchy" % "1.1-dt-20190212Z-a8db83",
  "org.scalablytyped.slinky" %%% "d3-interpolate" % "1.3-dt-20190212Z-928584",
  "org.scalablytyped.slinky" %%% "d3-path" % "1.0-dt-20190212Z-af7521",
  "org.scalablytyped.slinky" %%% "d3-quadtree" % "1.0-dt-20190212Z-bef603",
  "org.scalablytyped.slinky" %%% "d3-random" % "1.1-dt-20190212Z-b0401d",
  "org.scalablytyped.slinky" %%% "d3-scale" % "2.1-dt-20190212Z-09b888",
  "org.scalablytyped.slinky" %%% "d3-selection" % "1.4-dt-20190710Z-29656a",
  "org.scalablytyped.slinky" %%% "d3-shape" % "1.3-dt-20191014Z-f72490",
  "org.scalablytyped.slinky" %%% "d3-time" % "1.0-dt-20190212Z-abf6bf",
  "org.scalablytyped.slinky" %%% "d3-time-format" % "2.1-dt-20190212Z-4bde8f",
  "org.scalablytyped.slinky" %%% "d3-timer" % "1.0-dt-20190212Z-7cdf96",
  "org.scalablytyped.slinky" %%% "d3-transition" % "1.1-dt-20191029Z-16a69d",
  "org.scalablytyped.slinky" %%% "d3-voronoi" % "1.1-dt-20190212Z-f650bd",
  "org.scalablytyped.slinky" %%% "d3-zoom" % "1.7-dt-20190212Z-6cbca2",
  "org.scalablytyped.slinky" %%% "geojson" % "7946.0-dt-20190925Z-e248ee",
  "org.scalablytyped.slinky" %%% "std" % "3.7-41c436")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        