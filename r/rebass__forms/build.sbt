organization := "org.scalablytyped.slinky"
name := "rebass__forms"
version := "4.0-dt-20200427Z-eea9f9"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-6e65be",
  "org.scalablytyped.slinky" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-272fb7",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ecc9ab",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200515Z-b103c7",
  "org.scalablytyped.slinky" %%% "react-native" % "0.62-dt-20200515Z-a82205",
  "org.scalablytyped.slinky" %%% "rebass" % "4.0-dt-20200514Z-32c3ad",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0",
  "org.scalablytyped.slinky" %%% "styled-components" % "5.1-dt-20200515Z-dc3cb1",
  "org.scalablytyped.slinky" %%% "styled-system" % "5.1-dt-20200309Z-b5e89a",
  "org.scalablytyped.slinky" %%% "styled-system__css" % "5.0-dt-20200515Z-2d60c0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
