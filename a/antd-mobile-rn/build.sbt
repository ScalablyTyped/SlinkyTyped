organization := "org.scalablytyped.slinky"
name := "antd-mobile-rn"
version := "2.3.3-0d5ba1"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-e9335f",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-7e1d98",
  "org.scalablytyped.slinky" %%% "rc-gesture" % "0.0.22-a8a56e",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200409Z-36b705",
  "org.scalablytyped.slinky" %%% "react-native" % "0.62-dt-20200423Z-550f26",
  "org.scalablytyped.slinky" %%% "react-native-drawer-layout" % "1.3-dt-20181017Z-8a6809",
  "org.scalablytyped.slinky" %%% "rmc-cascader" % "5.0.3-f49f9e",
  "org.scalablytyped.slinky" %%% "rmc-input-number" % "1.0.5-4418c5",
  "org.scalablytyped.slinky" %%% "rmc-picker" % "5.0.10-60dc52",
  "org.scalablytyped.slinky" %%% "rmc-tabs" % "1.2.29-820d84",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
