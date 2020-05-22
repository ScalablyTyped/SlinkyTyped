organization := "org.scalablytyped.slinky"
name := "ant-design__react-native"
version := "3.3.0-e49145"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "bang88__react-native-drawer-layout" % "2.0.3-86bbff",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-6e65be",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ecc9ab",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200515Z-b103c7",
  "org.scalablytyped.slinky" %%% "react-native" % "0.62-dt-20200515Z-a82205",
  "org.scalablytyped.slinky" %%% "react-native-collapsible" % "1.5.2-96ba49",
  "org.scalablytyped.slinky" %%% "react-native-community__viewpager" % "1.1.7-df5e39",
  "org.scalablytyped.slinky" %%% "react-native-modal-popover" % "0.0.12-56fed0",
  "org.scalablytyped.slinky" %%% "react-native-swipeout" % "2.3.6-c99e90",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
