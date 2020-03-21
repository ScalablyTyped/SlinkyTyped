organization := "org.scalablytyped.slinky"
name := "expo"
version := "35.0.1-68a5d2"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-89abae",
  "org.scalablytyped.slinky" %%% "expo-asset" % "7.0.0-b69702",
  "org.scalablytyped.slinky" %%% "expo-constants" % "7.0.1-6b9147",
  "org.scalablytyped.slinky" %%% "expo-font" % "7.0.0-296d09",
  "org.scalablytyped.slinky" %%% "expo-linear-gradient" % "7.0.1-6b2d12",
  "org.scalablytyped.slinky" %%% "expo-sqlite" % "7.0.0-28db18",
  "org.scalablytyped.slinky" %%% "expo__vector-icons" % "9.0-dt-20190213Z-88ac68",
  "org.scalablytyped.slinky" %%% "fbemitter" % "2.0.0-dt-20200226Z-d0925d",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-6bb503",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200227Z-f18fda",
  "org.scalablytyped.slinky" %%% "react-native" % "0.61-dt-20200225Z-1e97be",
  "org.scalablytyped.slinky" %%% "react-native-vector-icons" % "6.4-dt-20191220Z-214362",
  "org.scalablytyped.slinky" %%% "react-native-view-shot" % "2.6.0-3a3ef3",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "unimodules__react-native-adapter" % "4.0.0-da3db2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
