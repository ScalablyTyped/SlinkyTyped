organization := "org.scalablytyped.slinky"
name := "react-plotly_dot_js"
version := "2.2-dt-20191126Z-e734a3"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-fa3762",
  "org.scalablytyped.slinky" %%% "d3-array" % "2.0-dt-20200225Z-597d6e",
  "org.scalablytyped.slinky" %%% "d3-axis" % "1.0-dt-20200225Z-74f703",
  "org.scalablytyped.slinky" %%% "d3-brush" % "1.1-dt-20200302Z-436489",
  "org.scalablytyped.slinky" %%% "d3-chord" % "1.0-dt-20200225Z-3bbd79",
  "org.scalablytyped.slinky" %%% "d3-collection" % "1.0-dt-20200225Z-896f87",
  "org.scalablytyped.slinky" %%% "d3-color" % "1.2-dt-20200225Z-51b5d1",
  "org.scalablytyped.slinky" %%% "d3-contour" % "1.3-dt-20200225Z-2fce24",
  "org.scalablytyped.slinky" %%% "d3-dispatch" % "1.0-dt-20200225Z-fbcdca",
  "org.scalablytyped.slinky" %%% "d3-drag" % "1.2-dt-20200225Z-bc37ab",
  "org.scalablytyped.slinky" %%% "d3-dsv" % "1.0-dt-20200225Z-e4862e",
  "org.scalablytyped.slinky" %%% "d3-ease" % "1.0-dt-20191014Z-38cca6",
  "org.scalablytyped.slinky" %%% "d3-fetch" % "1.1-dt-20200225Z-69944a",
  "org.scalablytyped.slinky" %%% "d3-force" % "1.2-dt-20200225Z-d0434a",
  "org.scalablytyped.slinky" %%% "d3-format" % "1.3-dt-20190212Z-38e74d",
  "org.scalablytyped.slinky" %%% "d3-geo" % "1.11-dt-20200225Z-24dd54",
  "org.scalablytyped.slinky" %%% "d3-hierarchy" % "1.1-dt-20200225Z-839eda",
  "org.scalablytyped.slinky" %%% "d3-interpolate" % "1.3-dt-20200225Z-8c41c6",
  "org.scalablytyped.slinky" %%% "d3-path" % "1.0-dt-20190212Z-ba2ed4",
  "org.scalablytyped.slinky" %%% "d3-quadtree" % "1.0-dt-20200225Z-321c31",
  "org.scalablytyped.slinky" %%% "d3-random" % "1.1-dt-20190212Z-74ec1c",
  "org.scalablytyped.slinky" %%% "d3-scale" % "2.2-dt-20200305Z-261b7a",
  "org.scalablytyped.slinky" %%% "d3-selection" % "1.4-dt-20200320Z-19e9d5",
  "org.scalablytyped.slinky" %%% "d3-shape" % "1.3-dt-20200225Z-061c72",
  "org.scalablytyped.slinky" %%% "d3-time" % "1.0-dt-20190212Z-ed2685",
  "org.scalablytyped.slinky" %%% "d3-time-format" % "2.1-dt-20190212Z-ca5cd7",
  "org.scalablytyped.slinky" %%% "d3-timer" % "1.0-dt-20190212Z-c14316",
  "org.scalablytyped.slinky" %%% "d3-transition" % "1.1-dt-20200225Z-2d1346",
  "org.scalablytyped.slinky" %%% "d3-voronoi" % "1.1-dt-20200225Z-57a1ba",
  "org.scalablytyped.slinky" %%% "d3-zoom" % "1.7-dt-20200225Z-ccf288",
  "org.scalablytyped.slinky" %%% "geojson" % "7946.0-dt-20190925Z-e99f8f",
  "org.scalablytyped.slinky" %%% "plotly_dot_js" % "1.50-dt-20200416Z-7ba12a",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-24495c",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200409Z-47fb9f",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
