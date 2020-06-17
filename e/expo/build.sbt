organization := "org.scalablytyped.slinky"
name := "expo"
version := "35.0.1-304b32"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-046861",
  "org.scalablytyped.slinky" %%% "expo-asset" % "7.0.0-37979c",
  "org.scalablytyped.slinky" %%% "expo-constants" % "7.0.1-fede5c",
  "org.scalablytyped.slinky" %%% "expo-font" % "7.0.0-ce5f66",
  "org.scalablytyped.slinky" %%% "expo-linear-gradient" % "7.0.1-228a66",
  "org.scalablytyped.slinky" %%% "expo-sqlite" % "7.0.0-21df0a",
  "org.scalablytyped.slinky" %%% "expo__vector-icons" % "9.0-dt-20200515Z-aba867",
  "org.scalablytyped.slinky" %%% "fbemitter" % "2.0.0-dt-20200515Z-5a5f39",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-75109a",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200515Z-5e5e25",
  "org.scalablytyped.slinky" %%% "react-native" % "0.62-dt-20200515Z-7efc5a",
  "org.scalablytyped.slinky" %%% "react-native-vector-icons" % "6.4-dt-20200515Z-fd8469",
  "org.scalablytyped.slinky" %%% "react-native-view-shot" % "2.6.0-5a9ed9",
  "org.scalablytyped.slinky" %%% "std" % "3.9-a77a62",
  "org.scalablytyped.slinky" %%% "unimodules__react-native-adapter" % "4.0.0-50a41c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
