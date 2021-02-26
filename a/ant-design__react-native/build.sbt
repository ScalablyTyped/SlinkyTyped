organization := "org.scalablytyped.slinky"
name := "ant-design__react-native"
version := "4.0.6-28e5ab"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "bang88__react-native-drawer-layout" % "2.0.3-3ea585",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.14-58bcb0",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-931d77",
  "org.scalablytyped.slinky" %%% "react" % "17.0-dt-20201121Z-9cde70",
  "org.scalablytyped.slinky" %%% "react-native" % "0.63-dt-20201120Z-a23376",
  "org.scalablytyped.slinky" %%% "react-native-collapsible" % "1.5.3-5d83b8",
  "org.scalablytyped.slinky" %%% "react-native-community__picker" % "1.8.1-3de1cd",
  "org.scalablytyped.slinky" %%% "react-native-community__viewpager" % "4.2.0-22b205",
  "org.scalablytyped.slinky" %%% "react-native-modal-popover" % "0.0.12-db8893",
  "org.scalablytyped.slinky" %%% "react-native-swipeout" % "2.3.6-3ce092",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
