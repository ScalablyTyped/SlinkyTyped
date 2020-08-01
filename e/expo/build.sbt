organization := "org.scalablytyped.slinky"
name := "expo"
version := "35.0.1-f39ace"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-9fcfdc",
  "org.scalablytyped.slinky" %%% "expo-asset" % "7.0.0-e63d03",
  "org.scalablytyped.slinky" %%% "expo-constants" % "7.0.1-13a953",
  "org.scalablytyped.slinky" %%% "expo-font" % "7.0.0-df8053",
  "org.scalablytyped.slinky" %%% "expo-linear-gradient" % "7.0.1-66596f",
  "org.scalablytyped.slinky" %%% "expo-sqlite" % "7.0.0-dcc83d",
  "org.scalablytyped.slinky" %%% "expo__vector-icons" % "9.0-dt-20200515Z-bc7393",
  "org.scalablytyped.slinky" %%% "fbemitter" % "2.0.0-dt-20200515Z-d093d1",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-77dff4",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200711Z-014bc6",
  "org.scalablytyped.slinky" %%% "react-native" % "0.63-dt-20200723Z-0db809",
  "org.scalablytyped.slinky" %%% "react-native-vector-icons" % "6.4-dt-20200515Z-ac1977",
  "org.scalablytyped.slinky" %%% "react-native-view-shot" % "2.6.0-d3d318",
  "org.scalablytyped.slinky" %%% "std" % "3.9-25efe0",
  "org.scalablytyped.slinky" %%% "unimodules__react-native-adapter" % "4.0.0-c70a01")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
