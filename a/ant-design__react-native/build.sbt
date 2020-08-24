organization := "org.scalablytyped.slinky"
name := "ant-design__react-native"
version := "4.0.2-512e0a"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "bang88__react-native-drawer-layout" % "2.0.3-fb7362",
  "org.scalablytyped.slinky" %%% "csstype" % "3.0.2-c880b4",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-9fd6d8",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200711Z-c528cd",
  "org.scalablytyped.slinky" %%% "react-native" % "0.63-dt-20200723Z-e061f4",
  "org.scalablytyped.slinky" %%% "react-native-collapsible" % "1.5.3-b22b57",
  "org.scalablytyped.slinky" %%% "react-native-modal-popover" % "0.0.12-51f31b",
  "org.scalablytyped.slinky" %%% "react-native-swipeout" % "2.3.6-64ca36",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
