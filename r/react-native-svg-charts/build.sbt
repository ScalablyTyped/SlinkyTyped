organization := "org.scalablytyped.slinky"
name := "react-native-svg-charts"
version := "5.0-dt-20200515Z-373c10"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "3.0.2-c880b4",
  "org.scalablytyped.slinky" %%% "d3-path" % "1.0-dt-20200515Z-938e93",
  "org.scalablytyped.slinky" %%% "d3-scale" % "2.2-dt-20200515Z-cac23b",
  "org.scalablytyped.slinky" %%% "d3-shape" % "1.3-dt-20200515Z-29cbdb",
  "org.scalablytyped.slinky" %%% "d3-time" % "1.0-dt-20200515Z-b1a86c",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-9fd6d8",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200711Z-c528cd",
  "org.scalablytyped.slinky" %%% "react-native" % "0.63-dt-20200723Z-e061f4",
  "org.scalablytyped.slinky" %%% "react-native-svg" % "12.1.0-71145a",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
