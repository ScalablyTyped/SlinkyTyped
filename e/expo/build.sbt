organization := "org.scalablytyped.slinky"
name := "expo"
version := "35.0.1-768f79"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-f22bc8",
  "org.scalablytyped.slinky" %%% "expo-asset" % "7.0.0-13b813",
  "org.scalablytyped.slinky" %%% "expo-constants" % "7.0.1-343a6a",
  "org.scalablytyped.slinky" %%% "expo-font" % "7.0.0-dd5944",
  "org.scalablytyped.slinky" %%% "expo-linear-gradient" % "7.0.1-32d9fd",
  "org.scalablytyped.slinky" %%% "expo-sqlite" % "7.0.0-2faac4",
  "org.scalablytyped.slinky" %%% "expo__vector-icons" % "9.0-dt-20190213Z-198d00",
  "org.scalablytyped.slinky" %%% "fbemitter" % "2.0.0-dt-20190503Z-67aaca",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-1d231d",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20191220Z-f02704",
  "org.scalablytyped.slinky" %%% "react-native" % "0.60-dt-20191230Z-df9948",
  "org.scalablytyped.slinky" %%% "react-native-vector-icons" % "6.4-dt-20191220Z-02bb56",
  "org.scalablytyped.slinky" %%% "react-native-view-shot" % "2.6.0-f0468a",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43",
  "org.scalablytyped.slinky" %%% "unimodules__react-native-adapter" % "4.0.0-fdaa76")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        