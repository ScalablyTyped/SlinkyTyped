organization := "org.scalablytyped.slinky"
name := "expo"
version := "35.0.1-766954"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-57a4b7",
  "org.scalablytyped.slinky" %%% "expo-asset" % "7.0.0-2846c3",
  "org.scalablytyped.slinky" %%% "expo-constants" % "7.0.1-0a949d",
  "org.scalablytyped.slinky" %%% "expo-font" % "7.0.0-47eeea",
  "org.scalablytyped.slinky" %%% "expo-linear-gradient" % "7.0.1-1f7b26",
  "org.scalablytyped.slinky" %%% "expo-sqlite" % "7.0.0-184f61",
  "org.scalablytyped.slinky" %%% "expo__vector-icons" % "9.0-dt-20200515Z-097ca1",
  "org.scalablytyped.slinky" %%% "fbemitter" % "2.0.0-dt-20200515Z-0ece1a",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-151476",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200617Z-5b2e1b",
  "org.scalablytyped.slinky" %%% "react-native" % "0.62-dt-20200604Z-88f9e5",
  "org.scalablytyped.slinky" %%% "react-native-vector-icons" % "6.4-dt-20200515Z-883fc5",
  "org.scalablytyped.slinky" %%% "react-native-view-shot" % "2.6.0-a281e3",
  "org.scalablytyped.slinky" %%% "std" % "3.9-18eec6",
  "org.scalablytyped.slinky" %%% "unimodules__react-native-adapter" % "4.0.0-1cfe6a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
