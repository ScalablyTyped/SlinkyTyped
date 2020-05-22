organization := "org.scalablytyped.slinky"
name := "antd-mobile"
version := "2.3.3-90dd5e"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-6e65be",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ecc9ab",
  "org.scalablytyped.slinky" %%% "rc-gesture" % "0.0.22-15d8e4",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200515Z-b103c7",
  "org.scalablytyped.slinky" %%% "react-native" % "0.62-dt-20200515Z-a82205",
  "org.scalablytyped.slinky" %%% "rmc-calendar" % "1.1.4-650ca1",
  "org.scalablytyped.slinky" %%% "rmc-cascader" % "5.0.3-8724fe",
  "org.scalablytyped.slinky" %%% "rmc-input-number" % "1.0.5-07064d",
  "org.scalablytyped.slinky" %%% "rmc-picker" % "5.0.10-8bc6e4",
  "org.scalablytyped.slinky" %%% "rmc-pull-to-refresh" % "1.0.12-f56f93",
  "org.scalablytyped.slinky" %%% "rmc-tabs" % "1.2.29-a888b4",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
