organization := "org.scalablytyped.slinky"
name := "ant-design__react-native"
version := "4.0.6-5d33cd"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "bang88__react-native-drawer-layout" % "2.0.3-72e39d",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.14-23cf0c",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ed7fbd",
  "org.scalablytyped.slinky" %%% "react" % "17.0-dt-20201121Z-8f0b52",
  "org.scalablytyped.slinky" %%% "react-native" % "0.63-dt-20201120Z-c651fe",
  "org.scalablytyped.slinky" %%% "react-native-collapsible" % "1.5.3-777ec0",
  "org.scalablytyped.slinky" %%% "react-native-community__picker" % "1.8.1-506a0b",
  "org.scalablytyped.slinky" %%% "react-native-community__viewpager" % "4.2.0-9b4282",
  "org.scalablytyped.slinky" %%% "react-native-modal-popover" % "0.0.12-b8b20f",
  "org.scalablytyped.slinky" %%% "react-native-swipeout" % "2.3.6-089502",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
