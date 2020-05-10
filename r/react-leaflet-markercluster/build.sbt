organization := "org.scalablytyped.slinky"
name := "react-leaflet-markercluster"
version := "2.0-dt-20181121Z-d51190"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-fa3762",
  "org.scalablytyped.slinky" %%% "geojson" % "7946.0-dt-20190925Z-e99f8f",
  "org.scalablytyped.slinky" %%% "leaflet" % "1.5-dt-20200320Z-73706d",
  "org.scalablytyped.slinky" %%% "leaflet_dot_markercluster" % "1.4-dt-20191223Z-5a6186",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-24495c",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200409Z-47fb9f",
  "org.scalablytyped.slinky" %%% "react-leaflet" % "2.5-dt-20200303Z-e08cf8",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
