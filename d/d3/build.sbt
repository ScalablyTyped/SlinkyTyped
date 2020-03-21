organization := "org.scalablytyped.slinky"
name := "d3"
version := "5.7-dt-20200225Z-4b4ee8"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "d3-array" % "2.0-dt-20200225Z-79e91a",
  "org.scalablytyped.slinky" %%% "d3-axis" % "1.0-dt-20200225Z-5119cc",
  "org.scalablytyped.slinky" %%% "d3-brush" % "1.1-dt-20200302Z-e95249",
  "org.scalablytyped.slinky" %%% "d3-chord" % "1.0-dt-20200225Z-a95a3d",
  "org.scalablytyped.slinky" %%% "d3-collection" % "1.0-dt-20200225Z-6911bb",
  "org.scalablytyped.slinky" %%% "d3-color" % "1.2-dt-20200225Z-8511a4",
  "org.scalablytyped.slinky" %%% "d3-contour" % "1.3-dt-20200225Z-6aeff0",
  "org.scalablytyped.slinky" %%% "d3-dispatch" % "1.0-dt-20200225Z-52c9b4",
  "org.scalablytyped.slinky" %%% "d3-drag" % "1.2-dt-20200225Z-bfd8eb",
  "org.scalablytyped.slinky" %%% "d3-dsv" % "1.0-dt-20200225Z-6b221d",
  "org.scalablytyped.slinky" %%% "d3-ease" % "1.0-dt-20191014Z-69e533",
  "org.scalablytyped.slinky" %%% "d3-fetch" % "1.1-dt-20200225Z-3af109",
  "org.scalablytyped.slinky" %%% "d3-force" % "1.2-dt-20200225Z-077b59",
  "org.scalablytyped.slinky" %%% "d3-format" % "1.3-dt-20190212Z-8ab71d",
  "org.scalablytyped.slinky" %%% "d3-geo" % "1.11-dt-20200225Z-ab2aeb",
  "org.scalablytyped.slinky" %%% "d3-hierarchy" % "1.1-dt-20200225Z-056370",
  "org.scalablytyped.slinky" %%% "d3-interpolate" % "1.3-dt-20200225Z-5d6aee",
  "org.scalablytyped.slinky" %%% "d3-path" % "1.0-dt-20190212Z-d2685e",
  "org.scalablytyped.slinky" %%% "d3-quadtree" % "1.0-dt-20200225Z-1fee73",
  "org.scalablytyped.slinky" %%% "d3-random" % "1.1-dt-20190212Z-cb3a3c",
  "org.scalablytyped.slinky" %%% "d3-scale" % "2.1-dt-20200225Z-f1e06a",
  "org.scalablytyped.slinky" %%% "d3-selection" % "1.4-dt-20200225Z-ac6795",
  "org.scalablytyped.slinky" %%% "d3-shape" % "1.3-dt-20200225Z-89737c",
  "org.scalablytyped.slinky" %%% "d3-time" % "1.0-dt-20190212Z-09a575",
  "org.scalablytyped.slinky" %%% "d3-time-format" % "2.1-dt-20190212Z-dbe711",
  "org.scalablytyped.slinky" %%% "d3-timer" % "1.0-dt-20190212Z-4214fa",
  "org.scalablytyped.slinky" %%% "d3-transition" % "1.1-dt-20200225Z-30d6dd",
  "org.scalablytyped.slinky" %%% "d3-voronoi" % "1.1-dt-20200225Z-6d0c7e",
  "org.scalablytyped.slinky" %%% "d3-zoom" % "1.7-dt-20200225Z-54de45",
  "org.scalablytyped.slinky" %%% "geojson" % "7946.0-dt-20190925Z-b49dde",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
