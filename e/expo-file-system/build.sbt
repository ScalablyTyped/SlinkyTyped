organization := "org.scalablytyped.slinky"
name := "expo-file-system"
version := "7.0.0-51fbea"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-046861",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-75109a",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200617Z-c51c3f",
  "org.scalablytyped.slinky" %%% "react-native" % "0.62-dt-20200604Z-b82b12",
  "org.scalablytyped.slinky" %%% "std" % "3.9-a77a62",
  "org.scalablytyped.slinky" %%% "unimodules__core" % "4.0.0-d859be",
  "org.scalablytyped.slinky" %%% "unimodules__react-native-adapter" % "4.0.0-3455f3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
