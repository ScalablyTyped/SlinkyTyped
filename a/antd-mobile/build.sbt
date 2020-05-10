organization := "org.scalablytyped.slinky"
name := "antd-mobile"
version := "2.3.1-70667b"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-fa3762",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-24495c",
  "org.scalablytyped.slinky" %%% "rc-gesture" % "0.0.22-729591",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200409Z-47fb9f",
  "org.scalablytyped.slinky" %%% "react-native" % "0.62-dt-20200423Z-43c31c",
  "org.scalablytyped.slinky" %%% "rmc-calendar" % "1.1.4-914f59",
  "org.scalablytyped.slinky" %%% "rmc-cascader" % "5.0.3-dc4b78",
  "org.scalablytyped.slinky" %%% "rmc-input-number" % "1.0.5-8952a1",
  "org.scalablytyped.slinky" %%% "rmc-picker" % "5.0.10-c7ddf3",
  "org.scalablytyped.slinky" %%% "rmc-pull-to-refresh" % "1.0.11-489118",
  "org.scalablytyped.slinky" %%% "rmc-tabs" % "1.2.29-9db818",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
