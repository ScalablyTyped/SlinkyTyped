organization := "org.scalablytyped.slinky"
name := "expo"
version := "35.0.1-f90810"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-2278c5",
  "org.scalablytyped.slinky" %%% "expo-asset" % "7.0.0-ee4635",
  "org.scalablytyped.slinky" %%% "expo-constants" % "7.0.1-c3fb99",
  "org.scalablytyped.slinky" %%% "expo-font" % "7.0.0-d72095",
  "org.scalablytyped.slinky" %%% "expo-linear-gradient" % "7.0.1-b7926c",
  "org.scalablytyped.slinky" %%% "expo-sqlite" % "7.0.0-87db22",
  "org.scalablytyped.slinky" %%% "expo__vector-icons" % "9.0-dt-20200515Z-bffe99",
  "org.scalablytyped.slinky" %%% "fbemitter" % "2.0.0-dt-20200515Z-80b2cb",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-360342",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200617Z-036789",
  "org.scalablytyped.slinky" %%% "react-native" % "0.62-dt-20200604Z-46692e",
  "org.scalablytyped.slinky" %%% "react-native-vector-icons" % "6.4-dt-20200515Z-07aa7a",
  "org.scalablytyped.slinky" %%% "react-native-view-shot" % "2.6.0-19ad73",
  "org.scalablytyped.slinky" %%% "std" % "3.9-dec240",
  "org.scalablytyped.slinky" %%% "unimodules__react-native-adapter" % "4.0.0-e7947c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
