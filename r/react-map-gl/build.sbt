organization := "org.scalablytyped.slinky"
name := "react-map-gl"
version := "5.2-dt-20200426Z-a76d76"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-fa3762",
  "org.scalablytyped.slinky" %%% "geojson" % "7946.0-dt-20190925Z-e99f8f",
  "org.scalablytyped.slinky" %%% "gl-matrix" % "2.4-dt-20200225Z-8a6cfd",
  "org.scalablytyped.slinky" %%% "mapbox-gl" % "1.9-dt-20200423Z-25e5ea",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-24495c",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200409Z-47fb9f",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e",
  "org.scalablytyped.slinky" %%% "viewport-mercator-project" % "6.1-dt-20190313Z-4a3835")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
