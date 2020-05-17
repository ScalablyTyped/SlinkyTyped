organization := "org.scalablytyped.slinky"
name := "expo"
version := "35.0.1-8521c8"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-e9335f",
  "org.scalablytyped.slinky" %%% "expo-asset" % "7.0.0-993097",
  "org.scalablytyped.slinky" %%% "expo-constants" % "7.0.1-06cb3f",
  "org.scalablytyped.slinky" %%% "expo-font" % "7.0.0-2167ac",
  "org.scalablytyped.slinky" %%% "expo-linear-gradient" % "7.0.1-1e4636",
  "org.scalablytyped.slinky" %%% "expo-sqlite" % "7.0.0-3dd9a1",
  "org.scalablytyped.slinky" %%% "expo__vector-icons" % "9.0-dt-20190213Z-ea9b7b",
  "org.scalablytyped.slinky" %%% "fbemitter" % "2.0.0-dt-20200226Z-5fa843",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-7e1d98",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200409Z-36b705",
  "org.scalablytyped.slinky" %%% "react-native" % "0.62-dt-20200423Z-550f26",
  "org.scalablytyped.slinky" %%% "react-native-vector-icons" % "6.4-dt-20191220Z-c824aa",
  "org.scalablytyped.slinky" %%% "react-native-view-shot" % "2.6.0-48f4c4",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "unimodules__react-native-adapter" % "4.0.0-15d06b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
