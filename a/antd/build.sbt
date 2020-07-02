organization := "org.scalablytyped.slinky"
name := "antd"
version := "4.3.4-206c14"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "ant-design__react-slick" % "0.26.2-17da26",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-046861",
  "org.scalablytyped.slinky" %%% "dayjs" % "1.8.28-c7101d",
  "org.scalablytyped.slinky" %%% "moment" % "2.26.0-860438",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-75109a",
  "org.scalablytyped.slinky" %%% "rc-field-form" % "1.4.4-5e9c93",
  "org.scalablytyped.slinky" %%% "rc-mentions" % "1.2.0-90d6f3",
  "org.scalablytyped.slinky" %%% "rc-menu" % "8.3.1-eebc00",
  "org.scalablytyped.slinky" %%% "rc-notification" % "4.4.0-24dae5",
  "org.scalablytyped.slinky" %%% "rc-picker" % "1.6.4-0f09ff",
  "org.scalablytyped.slinky" %%% "rc-select" % "v5.9.0-dt-20200515Z-bb06d5",
  "org.scalablytyped.slinky" %%% "rc-table" % "7.8.0-afe3e4",
  "org.scalablytyped.slinky" %%% "rc-tree" % "1.11-dt-20200515Z-4d2913",
  "org.scalablytyped.slinky" %%% "rc-tree-select" % "4.0.1-2a72b9",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200617Z-c51c3f",
  "org.scalablytyped.slinky" %%% "scroll-into-view-if-needed" % "2.2.22-ed6c71",
  "org.scalablytyped.slinky" %%% "std" % "3.9-a77a62")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
