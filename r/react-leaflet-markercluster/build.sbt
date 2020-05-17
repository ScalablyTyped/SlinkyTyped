organization := "org.scalablytyped.slinky"
name := "react-leaflet-markercluster"
version := "2.0-dt-20181121Z-067d93"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-e9335f",
  "org.scalablytyped.slinky" %%% "geojson" % "7946.0-dt-20190925Z-114ee8",
  "org.scalablytyped.slinky" %%% "leaflet" % "1.5-dt-20200320Z-856823",
  "org.scalablytyped.slinky" %%% "leaflet_dot_markercluster" % "1.4-dt-20191223Z-c43fdc",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-7e1d98",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200409Z-36b705",
  "org.scalablytyped.slinky" %%% "react-leaflet" % "2.5-dt-20200303Z-9bcff5",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
