organization := "org.scalablytyped.slinky"
name := "d3"
version := "5.7-dt-20200515Z-df4e8d"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "d3-array" % "2.0-dt-20200515Z-0b6167",
  "org.scalablytyped.slinky" %%% "d3-axis" % "1.0-dt-20200515Z-ec538b",
  "org.scalablytyped.slinky" %%% "d3-brush" % "1.1-dt-20200605Z-120ef9",
  "org.scalablytyped.slinky" %%% "d3-chord" % "1.0-dt-20200515Z-5c2874",
  "org.scalablytyped.slinky" %%% "d3-collection" % "1.0-dt-20200515Z-645d2f",
  "org.scalablytyped.slinky" %%% "d3-color" % "1.2-dt-20200515Z-5adde9",
  "org.scalablytyped.slinky" %%% "d3-contour" % "1.3-dt-20200515Z-f53076",
  "org.scalablytyped.slinky" %%% "d3-dispatch" % "1.0-dt-20200515Z-f6785c",
  "org.scalablytyped.slinky" %%% "d3-drag" % "1.2-dt-20200515Z-043507",
  "org.scalablytyped.slinky" %%% "d3-dsv" % "1.0-dt-20200515Z-0bc302",
  "org.scalablytyped.slinky" %%% "d3-ease" % "1.0-dt-20200515Z-9357f3",
  "org.scalablytyped.slinky" %%% "d3-fetch" % "1.1-dt-20200515Z-389db8",
  "org.scalablytyped.slinky" %%% "d3-force" % "1.2-dt-20200515Z-0469d7",
  "org.scalablytyped.slinky" %%% "d3-format" % "1.3-dt-20200515Z-37dd43",
  "org.scalablytyped.slinky" %%% "d3-geo" % "1.11-dt-20200515Z-8c871b",
  "org.scalablytyped.slinky" %%% "d3-hierarchy" % "1.1-dt-20200515Z-ad5929",
  "org.scalablytyped.slinky" %%% "d3-interpolate" % "1.3-dt-20200515Z-47e2c1",
  "org.scalablytyped.slinky" %%% "d3-path" % "1.0-dt-20200515Z-6d7225",
  "org.scalablytyped.slinky" %%% "d3-quadtree" % "1.0-dt-20200515Z-46bb99",
  "org.scalablytyped.slinky" %%% "d3-random" % "1.1-dt-20200515Z-bddd85",
  "org.scalablytyped.slinky" %%% "d3-scale" % "2.2-dt-20200515Z-683702",
  "org.scalablytyped.slinky" %%% "d3-selection" % "1.4-dt-20200515Z-03f2fe",
  "org.scalablytyped.slinky" %%% "d3-shape" % "1.3-dt-20200515Z-7a966e",
  "org.scalablytyped.slinky" %%% "d3-time" % "1.0-dt-20200515Z-29c96a",
  "org.scalablytyped.slinky" %%% "d3-time-format" % "2.1-dt-20200515Z-66db30",
  "org.scalablytyped.slinky" %%% "d3-timer" % "1.0-dt-20200515Z-8fb6cf",
  "org.scalablytyped.slinky" %%% "d3-transition" % "1.1-dt-20200515Z-f112e5",
  "org.scalablytyped.slinky" %%% "d3-voronoi" % "1.1-dt-20200515Z-366fa1",
  "org.scalablytyped.slinky" %%% "d3-zoom" % "1.7-dt-20200515Z-57133f",
  "org.scalablytyped.slinky" %%% "geojson" % "7946.0-dt-20200515Z-c745d6",
  "org.scalablytyped.slinky" %%% "std" % "3.9-18eec6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
