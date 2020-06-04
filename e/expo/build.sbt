organization := "org.scalablytyped.slinky"
name := "expo"
version := "35.0.1-b186c2"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-d1c111",
  "org.scalablytyped.slinky" %%% "expo-asset" % "7.0.0-c82760",
  "org.scalablytyped.slinky" %%% "expo-constants" % "7.0.1-af057c",
  "org.scalablytyped.slinky" %%% "expo-font" % "7.0.0-89f28b",
  "org.scalablytyped.slinky" %%% "expo-linear-gradient" % "7.0.1-d9c287",
  "org.scalablytyped.slinky" %%% "expo-sqlite" % "7.0.0-4ec982",
  "org.scalablytyped.slinky" %%% "expo__vector-icons" % "9.0-dt-20200515Z-40b77d",
  "org.scalablytyped.slinky" %%% "fbemitter" % "2.0.0-dt-20200515Z-ef7cc6",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-7481b3",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200515Z-83112e",
  "org.scalablytyped.slinky" %%% "react-native" % "0.62-dt-20200515Z-5f2ef4",
  "org.scalablytyped.slinky" %%% "react-native-vector-icons" % "6.4-dt-20200515Z-dad87f",
  "org.scalablytyped.slinky" %%% "react-native-view-shot" % "2.6.0-d2bb1e",
  "org.scalablytyped.slinky" %%% "std" % "3.9-ad7699",
  "org.scalablytyped.slinky" %%% "unimodules__react-native-adapter" % "4.0.0-2e5e91")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
