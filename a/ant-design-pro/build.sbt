organization := "org.scalablytyped.slinky"
name := "ant-design-pro"
version := "2.3.2-d7268c"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "ant-design__create-react-context" % "0.2.5-e1c9d3",
  "org.scalablytyped.slinky" %%% "antd" % "3.26.5-e3dc89",
  "org.scalablytyped.slinky" %%% "antv__g2" % "3.5.9-bb1a35",
  "org.scalablytyped.slinky" %%% "bizcharts" % "3.5.6-4ac051",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-f22bc8",
  "org.scalablytyped.slinky" %%% "history" % "4.7.2-dt-20191126Z-50a366",
  "org.scalablytyped.slinky" %%% "moment" % "2.24.0-9323e2",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-1d231d",
  "org.scalablytyped.slinky" %%% "rc-mentions" % "0.4.2-667fa7",
  "org.scalablytyped.slinky" %%% "rc-menu" % "7.5.3-587b45",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20191220Z-f02704",
  "org.scalablytyped.slinky" %%% "react-router" % "5.1-dt-20191126Z-6ac541",
  "org.scalablytyped.slinky" %%% "react-slick" % "0.23-dt-20190503Z-286e52",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        