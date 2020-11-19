organization := "org.scalablytyped.slinky"
name := "ant-design__pro-layout"
version := "6.3.0-3815c5"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "ant-design__icons" % "4.2.1-3c4a4d",
  "org.scalablytyped.slinky" %%% "ant-design__icons-svg" % "4.1.0-f99b0c",
  "org.scalablytyped.slinky" %%% "ant-design__react-slick" % "0.27.0-dab618",
  "org.scalablytyped.slinky" %%% "antd" % "4.5.1-4c9813",
  "org.scalablytyped.slinky" %%% "csstype" % "3.0.2-fce754",
  "org.scalablytyped.slinky" %%% "dayjs" % "1.8.31-2ec44c",
  "org.scalablytyped.slinky" %%% "history" % "4.7.2-dt-20200518Z-8944d8",
  "org.scalablytyped.slinky" %%% "moment" % "2.27.0-7b4dcd",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ce652f",
  "org.scalablytyped.slinky" %%% "rc-field-form" % "1.8.0-13e2b1",
  "org.scalablytyped.slinky" %%% "rc-mentions" % "1.4.0-47ef55",
  "org.scalablytyped.slinky" %%% "rc-menu" % "8.5.0-9146d8",
  "org.scalablytyped.slinky" %%% "rc-notification" % "4.4.0-222096",
  "org.scalablytyped.slinky" %%% "rc-picker" % "1.15.1-e217a4",
  "org.scalablytyped.slinky" %%% "rc-select" % "11.1.0-d5b1e9",
  "org.scalablytyped.slinky" %%% "rc-table" % "7.8.6-a77949",
  "org.scalablytyped.slinky" %%% "rc-tabs" % "11.5.6-ea0ad8",
  "org.scalablytyped.slinky" %%% "rc-textarea" % "0.3.0-c851cb",
  "org.scalablytyped.slinky" %%% "rc-tooltip" % "4.2.1-08da58",
  "org.scalablytyped.slinky" %%% "rc-tree" % "3.8.2-81c437",
  "org.scalablytyped.slinky" %%% "rc-tree-select" % "4.1.0-2b0fd6",
  "org.scalablytyped.slinky" %%% "rc-trigger" % "4.3.4-6e86ec",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200711Z-6a9854",
  "org.scalablytyped.slinky" %%% "react-router" % "5.1-dt-20200629Z-484431",
  "org.scalablytyped.slinky" %%% "scroll-into-view-if-needed" % "2.2.25-c6e0ba",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "umijs__route-utils" % "1.0.30-3beec6",
  "org.scalablytyped.slinky" %%% "unstated-next" % "1.1.0-409e17")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
