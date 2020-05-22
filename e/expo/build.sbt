organization := "org.scalablytyped.slinky"
name := "expo"
version := "35.0.1-abbb09"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-6e65be",
  "org.scalablytyped.slinky" %%% "expo-asset" % "7.0.0-462994",
  "org.scalablytyped.slinky" %%% "expo-constants" % "7.0.1-0d1c3c",
  "org.scalablytyped.slinky" %%% "expo-font" % "7.0.0-a766f9",
  "org.scalablytyped.slinky" %%% "expo-linear-gradient" % "7.0.1-20731c",
  "org.scalablytyped.slinky" %%% "expo-sqlite" % "7.0.0-695860",
  "org.scalablytyped.slinky" %%% "expo__vector-icons" % "9.0-dt-20200515Z-dbb61e",
  "org.scalablytyped.slinky" %%% "fbemitter" % "2.0.0-dt-20200515Z-5d45ec",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ecc9ab",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200515Z-b103c7",
  "org.scalablytyped.slinky" %%% "react-native" % "0.62-dt-20200515Z-a82205",
  "org.scalablytyped.slinky" %%% "react-native-vector-icons" % "6.4-dt-20200515Z-0ced9d",
  "org.scalablytyped.slinky" %%% "react-native-view-shot" % "2.6.0-cb6c7f",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0",
  "org.scalablytyped.slinky" %%% "unimodules__react-native-adapter" % "4.0.0-696cc4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
