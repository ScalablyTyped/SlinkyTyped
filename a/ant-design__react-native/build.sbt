organization := "org.scalablytyped.slinky"
name := "ant-design__react-native"
version := "3.2.2-f0ee69"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "bang88__react-native-drawer-layout" % "2.0.3-41bea7",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-89abae",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-6bb503",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200227Z-f18fda",
  "org.scalablytyped.slinky" %%% "react-native" % "0.61-dt-20200225Z-1e97be",
  "org.scalablytyped.slinky" %%% "react-native-collapsible" % "1.5.1-ebdb9a",
  "org.scalablytyped.slinky" %%% "react-native-community__viewpager" % "1.1.7-15de2f",
  "org.scalablytyped.slinky" %%% "react-native-modal-popover" % "0.0.12-0999fb",
  "org.scalablytyped.slinky" %%% "react-native-swipeout" % "2.3.6-6c516d",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
