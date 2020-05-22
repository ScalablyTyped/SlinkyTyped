organization := "org.scalablytyped.slinky"
name := "react-map-gl"
version := "5.2-dt-20200515Z-3ca248"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-6e65be",
  "org.scalablytyped.slinky" %%% "geojson" % "7946.0-dt-20200515Z-762b9c",
  "org.scalablytyped.slinky" %%% "gl-matrix" % "2.4-dt-20200515Z-24ef2f",
  "org.scalablytyped.slinky" %%% "mapbox-gl" % "1.10-dt-20200520Z-0aec9d",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ecc9ab",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200515Z-b103c7",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0",
  "org.scalablytyped.slinky" %%% "viewport-mercator-project" % "6.1-dt-20190313Z-59ba21")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
