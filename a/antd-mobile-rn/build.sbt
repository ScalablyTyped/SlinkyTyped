organization := "org.scalablytyped.slinky"
name := "antd-mobile-rn"
version := "2.3.3-7a9c5d"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.14-23cf0c",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ed7fbd",
  "org.scalablytyped.slinky" %%% "rc-gesture" % "0.0.22-efac7d",
  "org.scalablytyped.slinky" %%% "react" % "17.0-dt-20201121Z-8f0b52",
  "org.scalablytyped.slinky" %%% "react-native" % "0.63-dt-20201120Z-c651fe",
  "org.scalablytyped.slinky" %%% "react-native-drawer-layout" % "1.3-dt-20200515Z-657d44",
  "org.scalablytyped.slinky" %%% "rmc-cascader" % "5.0.3-9d9cea",
  "org.scalablytyped.slinky" %%% "rmc-input-number" % "1.0.5-cc1b27",
  "org.scalablytyped.slinky" %%% "rmc-picker" % "5.0.10-273e9a",
  "org.scalablytyped.slinky" %%% "rmc-tabs" % "1.2.29-e01be4",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
