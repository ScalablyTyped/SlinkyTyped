organization := "org.scalablytyped.slinky"
name := "react-native-svg-charts"
version := "5.0-dt-20201104Z-97e227"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.14-58bcb0",
  "org.scalablytyped.slinky" %%% "d3-path" % "2.0-dt-20201002Z-a7eba9",
  "org.scalablytyped.slinky" %%% "d3-scale" % "3.2-dt-20201104Z-9aba9f",
  "org.scalablytyped.slinky" %%% "d3-shape" % "2.0-dt-20201028Z-3ab6d3",
  "org.scalablytyped.slinky" %%% "d3-time" % "2.0-dt-20201002Z-e3a5ec",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-931d77",
  "org.scalablytyped.slinky" %%% "react" % "17.0-dt-20201121Z-9cde70",
  "org.scalablytyped.slinky" %%% "react-native" % "0.63-dt-20201120Z-a23376",
  "org.scalablytyped.slinky" %%% "react-native-svg" % "12.1.0-0699da",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
