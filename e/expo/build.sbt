organization := "org.scalablytyped.slinky"
name := "expo"
version := "35.0.1-9470df"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-e36b6f",
  "org.scalablytyped.slinky" %%% "expo-asset" % "7.0.0-c7bd23",
  "org.scalablytyped.slinky" %%% "expo-constants" % "7.0.1-5bd1cb",
  "org.scalablytyped.slinky" %%% "fbemitter" % "2.0.0-dt-20190503Z-e0f3cd",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-4b2a81",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20191122Z-3deda2",
  "org.scalablytyped.slinky" %%% "react-native" % "0.60-dt-20191121Z-9f71a3",
  "org.scalablytyped.slinky" %%% "std" % "3.7-317bd7",
  "org.scalablytyped.slinky" %%% "unimodules__react-native-adapter" % "4.0.0-4a0586")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        