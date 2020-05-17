organization := "org.scalablytyped.slinky"
name := "ant-design__react-native"
version := "3.3.0-e34ecf"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "bang88__react-native-drawer-layout" % "2.0.3-548856",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-e9335f",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-7e1d98",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200409Z-36b705",
  "org.scalablytyped.slinky" %%% "react-native" % "0.62-dt-20200423Z-550f26",
  "org.scalablytyped.slinky" %%% "react-native-collapsible" % "1.5.1-defc93",
  "org.scalablytyped.slinky" %%% "react-native-community__viewpager" % "1.1.7-4a2939",
  "org.scalablytyped.slinky" %%% "react-native-modal-popover" % "0.0.12-12cc0a",
  "org.scalablytyped.slinky" %%% "react-native-swipeout" % "2.3.6-2fb928",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
