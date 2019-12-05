organization := "org.scalablytyped.slinky"
name := "antd-mobile-rn"
version := "2.3.3-f1acb6"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-34c756",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-243f84",
  "org.scalablytyped.slinky" %%% "rc-gesture" % "0.0.22-8e80be",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20191126Z-6c3558",
  "org.scalablytyped.slinky" %%% "react-native" % "0.60-dt-20191121Z-1e5ca0",
  "org.scalablytyped.slinky" %%% "react-native-drawer-layout" % "1.3-dt-20181017Z-5b8118",
  "org.scalablytyped.slinky" %%% "rmc-cascader" % "5.0.3-318838",
  "org.scalablytyped.slinky" %%% "rmc-input-number" % "1.0.5-b25375",
  "org.scalablytyped.slinky" %%% "rmc-picker" % "5.0.10-bd9bdd",
  "org.scalablytyped.slinky" %%% "rmc-tabs" % "1.2.29-9d474b",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821",
  "org.scalablytyped.slinky" %%% "utility-types" % "2.1.0-a7c666")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        