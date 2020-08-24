organization := "org.scalablytyped.slinky"
name := "antd-mobile"
version := "2.3.3-7e6081"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "3.0.2-c880b4",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-9fd6d8",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200711Z-c528cd",
  "org.scalablytyped.slinky" %%% "react-native" % "0.63-dt-20200723Z-e061f4",
  "org.scalablytyped.slinky" %%% "rmc-calendar" % "1.1.4-109fc1",
  "org.scalablytyped.slinky" %%% "rmc-cascader" % "5.0.3-f86a44",
  "org.scalablytyped.slinky" %%% "rmc-input-number" % "1.0.5-44b887",
  "org.scalablytyped.slinky" %%% "rmc-picker" % "5.0.10-6d190e",
  "org.scalablytyped.slinky" %%% "rmc-pull-to-refresh" % "1.0.13-b56451",
  "org.scalablytyped.slinky" %%% "rmc-tabs" % "1.2.29-a79417",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
