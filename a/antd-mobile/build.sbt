organization := "org.scalablytyped.slinky"
name := "antd-mobile"
version := "2.3.1-e3c54c"
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
  "org.scalablytyped.slinky" %%% "rmc-calendar" % "1.1.4-e78d92",
  "org.scalablytyped.slinky" %%% "rmc-cascader" % "5.0.3-318838",
  "org.scalablytyped.slinky" %%% "rmc-input-number" % "1.0.5-b25375",
  "org.scalablytyped.slinky" %%% "rmc-picker" % "5.0.10-bd9bdd",
  "org.scalablytyped.slinky" %%% "rmc-pull-to-refresh" % "1.0.11-65f4b0",
  "org.scalablytyped.slinky" %%% "rmc-tabs" % "1.2.29-9d474b",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        