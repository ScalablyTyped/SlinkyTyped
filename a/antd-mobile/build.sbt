organization := "org.scalablytyped.slinky"
name := "antd-mobile"
version := "2.3.1-7f5627"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-f22bc8",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-1d231d",
  "org.scalablytyped.slinky" %%% "rc-gesture" % "0.0.22-292048",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20191220Z-f02704",
  "org.scalablytyped.slinky" %%% "react-native" % "0.60-dt-20191230Z-df9948",
  "org.scalablytyped.slinky" %%% "rmc-calendar" % "1.1.4-01a210",
  "org.scalablytyped.slinky" %%% "rmc-cascader" % "5.0.3-acba03",
  "org.scalablytyped.slinky" %%% "rmc-input-number" % "1.0.5-74df58",
  "org.scalablytyped.slinky" %%% "rmc-picker" % "5.0.10-a86f5f",
  "org.scalablytyped.slinky" %%% "rmc-pull-to-refresh" % "1.0.11-f26530",
  "org.scalablytyped.slinky" %%% "rmc-tabs" % "1.2.29-ae0d8b",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        