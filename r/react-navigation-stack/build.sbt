organization := "org.scalablytyped.slinky"
name := "react-navigation-stack"
version := "2.10.2-2787f7"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.14-58bcb0",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-931d77",
  "org.scalablytyped.slinky" %%% "react" % "17.0-dt-20201121Z-9cde70",
  "org.scalablytyped.slinky" %%% "react-native" % "0.63-dt-20201120Z-a23376",
  "org.scalablytyped.slinky" %%% "react-native-community__masked-view" % "0.1.10-48fc8d",
  "org.scalablytyped.slinky" %%% "react-native-gesture-handler" % "1.8.0-c0304b",
  "org.scalablytyped.slinky" %%% "react-native-safe-area-context" % "3.1.4-d2c998",
  "org.scalablytyped.slinky" %%% "react-navigation" % "4.4.3-ee3f0d",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
