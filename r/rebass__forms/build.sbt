organization := "org.scalablytyped.slinky"
name := "rebass__forms"
version := "4.0-dt-20200427Z-efee6c"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "csstype" % "3.0.2-fce754",
  "org.scalablytyped.slinky" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-d5bf4c",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ce652f",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200711Z-6a9854",
  "org.scalablytyped.slinky" %%% "react-native" % "0.63-dt-20200723Z-d4ffae",
  "org.scalablytyped.slinky" %%% "rebass" % "4.0-dt-20200514Z-ebe5b4",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "styled-components" % "5.1-dt-20200706Z-54ff39",
  "org.scalablytyped.slinky" %%% "styled-system" % "5.1-dt-20200309Z-1d8df2",
  "org.scalablytyped.slinky" %%% "styled-system__css" % "5.0-dt-20200713Z-cbc485")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
