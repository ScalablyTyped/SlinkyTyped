organization := "org.scalablytyped.slinky"
name := "antd-mobile-rn"
version := "2.3.3-f02fe2"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.14-58bcb0",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-931d77",
  "org.scalablytyped.slinky" %%% "rc-gesture" % "0.0.22-7e81be",
  "org.scalablytyped.slinky" %%% "react" % "17.0-dt-20201121Z-9cde70",
  "org.scalablytyped.slinky" %%% "react-native" % "0.63-dt-20201120Z-a23376",
  "org.scalablytyped.slinky" %%% "react-native-drawer-layout" % "1.3-dt-20200515Z-4e6d70",
  "org.scalablytyped.slinky" %%% "rmc-cascader" % "5.0.3-487b28",
  "org.scalablytyped.slinky" %%% "rmc-input-number" % "1.0.5-87f28f",
  "org.scalablytyped.slinky" %%% "rmc-picker" % "5.0.10-39e40d",
  "org.scalablytyped.slinky" %%% "rmc-tabs" % "1.2.29-ed0439",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
