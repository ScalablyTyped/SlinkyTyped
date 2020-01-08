organization := "org.scalablytyped.slinky"
name := "react-native-svg-charts"
version := "5.0-dt-20191111Z-16b57d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-f22bc8",
  "org.scalablytyped.slinky" %%% "d3-path" % "1.0-dt-20190212Z-4a26d0",
  "org.scalablytyped.slinky" %%% "d3-scale" % "2.1-dt-20190212Z-690198",
  "org.scalablytyped.slinky" %%% "d3-shape" % "1.3-dt-20191014Z-2eabec",
  "org.scalablytyped.slinky" %%% "d3-time" % "1.0-dt-20190212Z-c0c9de",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-1d231d",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20191220Z-f02704",
  "org.scalablytyped.slinky" %%% "react-native" % "0.60-dt-20191230Z-df9948",
  "org.scalablytyped.slinky" %%% "react-native-svg" % "9.13.6-4ed8f0",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        