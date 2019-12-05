organization := "org.scalablytyped.slinky"
name := "ant-design__react-native"
version := "3.2.0-be0f38"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "bang88__react-native-drawer-layout" % "2.0.3-c13d57",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-34c756",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-243f84",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20191126Z-6c3558",
  "org.scalablytyped.slinky" %%% "react-native" % "0.60-dt-20191121Z-1e5ca0",
  "org.scalablytyped.slinky" %%% "react-native-collapsible" % "1.5.1-6f0c86",
  "org.scalablytyped.slinky" %%% "react-native-community__viewpager" % "1.1.7-3a8603",
  "org.scalablytyped.slinky" %%% "react-native-modal-popover" % "0.0.12-ee0a0a",
  "org.scalablytyped.slinky" %%% "react-native-swipeout" % "2.3.6-0722d1",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        