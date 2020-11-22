organization := "org.scalablytyped.slinky"
name := "rebass__forms"
version := "4.0-dt-20200925Z-6a1a6d"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.14-23cf0c",
  "org.scalablytyped.slinky" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-750dce",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ed7fbd",
  "org.scalablytyped.slinky" %%% "react" % "17.0-dt-20201121Z-8f0b52",
  "org.scalablytyped.slinky" %%% "react-native" % "0.63-dt-20201120Z-c651fe",
  "org.scalablytyped.slinky" %%% "rebass" % "4.0-dt-20200925Z-0bf995",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533",
  "org.scalablytyped.slinky" %%% "styled-components" % "5.1-dt-20201010Z-2baed4",
  "org.scalablytyped.slinky" %%% "styled-system" % "5.1-dt-20201028Z-4fdbd6",
  "org.scalablytyped.slinky" %%% "styled-system__css" % "5.0-dt-20200925Z-75840e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
