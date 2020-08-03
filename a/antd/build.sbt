organization := "org.scalablytyped.slinky"
name := "antd"
version := "4.5.1-4c87af"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "ant-design__icons" % "4.2.1-71fe4b",
  "org.scalablytyped.slinky" %%% "ant-design__icons-svg" % "4.1.0-ac6146",
  "org.scalablytyped.slinky" %%% "ant-design__react-slick" % "0.27.0-de9b26",
  "org.scalablytyped.slinky" %%% "csstype" % "3.0.2-b1f63d",
  "org.scalablytyped.slinky" %%% "dayjs" % "1.8.31-795ab2",
  "org.scalablytyped.slinky" %%% "moment" % "2.27.0-53fa1b",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-77dff4",
  "org.scalablytyped.slinky" %%% "rc-field-form" % "1.8.0-17ff8f",
  "org.scalablytyped.slinky" %%% "rc-mentions" % "1.4.0-a03ee6",
  "org.scalablytyped.slinky" %%% "rc-menu" % "8.5.0-e4d07e",
  "org.scalablytyped.slinky" %%% "rc-notification" % "4.4.0-0c247e",
  "org.scalablytyped.slinky" %%% "rc-picker" % "1.15.1-4d0e26",
  "org.scalablytyped.slinky" %%% "rc-select" % "11.1.0-cc833b",
  "org.scalablytyped.slinky" %%% "rc-table" % "7.8.6-234f9b",
  "org.scalablytyped.slinky" %%% "rc-tabs" % "11.5.6-2b61ab",
  "org.scalablytyped.slinky" %%% "rc-textarea" % "0.3.0-9727d3",
  "org.scalablytyped.slinky" %%% "rc-tooltip" % "4.2.1-adfdd8",
  "org.scalablytyped.slinky" %%% "rc-tree" % "3.8.2-27ff76",
  "org.scalablytyped.slinky" %%% "rc-tree-select" % "4.1.0-c275ac",
  "org.scalablytyped.slinky" %%% "rc-trigger" % "4.3.4-b693aa",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200711Z-6a2e4b",
  "org.scalablytyped.slinky" %%% "scroll-into-view-if-needed" % "2.2.25-07e10f",
  "org.scalablytyped.slinky" %%% "std" % "3.9-25efe0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
