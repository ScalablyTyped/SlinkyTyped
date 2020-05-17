organization := "org.scalablytyped.slinky"
name := "ant-design-pro"
version := "2.3.2-b6dea1"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "ant-design__react-slick" % "0.25.5-dfa8c5",
  "org.scalablytyped.slinky" %%% "antd" % "4.0.4-618256",
  "org.scalablytyped.slinky" %%% "antv__g2" % "3.5.9-df8bab",
  "org.scalablytyped.slinky" %%% "bizcharts" % "3.5.6-b9ba93",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-e9335f",
  "org.scalablytyped.slinky" %%% "dayjs" % "1.8.23-43f8ec",
  "org.scalablytyped.slinky" %%% "history" % "4.7.2-dt-20200226Z-fad309",
  "org.scalablytyped.slinky" %%% "moment" % "2.24.0-e19481",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-7e1d98",
  "org.scalablytyped.slinky" %%% "rc-field-form" % "1.0.1-7b5d5b",
  "org.scalablytyped.slinky" %%% "rc-mentions" % "1.0.1-d95ce2",
  "org.scalablytyped.slinky" %%% "rc-menu" % "8.0.2-d4a8eb",
  "org.scalablytyped.slinky" %%% "rc-notification" % "4.0.0-bba339",
  "org.scalablytyped.slinky" %%% "rc-picker" % "1.1.5-faea7e",
  "org.scalablytyped.slinky" %%% "rc-select" % "v5.9.0-dt-20200226Z-b85e88",
  "org.scalablytyped.slinky" %%% "rc-table" % "7.3.10-23c8e7",
  "org.scalablytyped.slinky" %%% "rc-tree" % "1.11-dt-20190212Z-992118",
  "org.scalablytyped.slinky" %%% "rc-tree-select" % "3.0.5-d87c06",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200409Z-36b705",
  "org.scalablytyped.slinky" %%% "react-router" % "5.1-dt-20200426Z-7aa264",
  "org.scalablytyped.slinky" %%% "scroll-into-view-if-needed" % "2.2.22-e00aec",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
