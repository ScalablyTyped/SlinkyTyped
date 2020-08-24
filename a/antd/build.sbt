organization := "org.scalablytyped.slinky"
name := "antd"
version := "4.5.1-a1c672"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "ant-design__icons" % "4.2.1-ae77f0",
  "org.scalablytyped.slinky" %%% "ant-design__icons-svg" % "4.1.0-ac0445",
  "org.scalablytyped.slinky" %%% "ant-design__react-slick" % "0.27.0-359b0a",
  "org.scalablytyped.slinky" %%% "csstype" % "3.0.2-c880b4",
  "org.scalablytyped.slinky" %%% "dayjs" % "1.8.31-9d5c86",
  "org.scalablytyped.slinky" %%% "moment" % "2.27.0-2827ec",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-9fd6d8",
  "org.scalablytyped.slinky" %%% "rc-field-form" % "1.8.0-5349b0",
  "org.scalablytyped.slinky" %%% "rc-mentions" % "1.4.0-a7f2ec",
  "org.scalablytyped.slinky" %%% "rc-menu" % "8.5.0-53c54f",
  "org.scalablytyped.slinky" %%% "rc-notification" % "4.4.0-b8c88c",
  "org.scalablytyped.slinky" %%% "rc-picker" % "1.15.1-147284",
  "org.scalablytyped.slinky" %%% "rc-select" % "11.1.0-ed33c4",
  "org.scalablytyped.slinky" %%% "rc-table" % "7.8.6-0831c3",
  "org.scalablytyped.slinky" %%% "rc-tabs" % "11.5.6-3e1384",
  "org.scalablytyped.slinky" %%% "rc-textarea" % "0.3.0-bd7f0e",
  "org.scalablytyped.slinky" %%% "rc-tooltip" % "4.2.1-0ba0fc",
  "org.scalablytyped.slinky" %%% "rc-tree" % "3.8.2-830cf0",
  "org.scalablytyped.slinky" %%% "rc-tree-select" % "4.1.0-62c0cf",
  "org.scalablytyped.slinky" %%% "rc-trigger" % "4.3.4-bf7fab",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200711Z-c528cd",
  "org.scalablytyped.slinky" %%% "scroll-into-view-if-needed" % "2.2.25-570f2b",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
