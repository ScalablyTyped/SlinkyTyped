organization := "org.scalablytyped.slinky"
name := "react-native-svg-charts"
version := "5.0-dt-20201104Z-cf295f"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.14-23cf0c",
  "org.scalablytyped.slinky" %%% "d3-path" % "2.0-dt-20201002Z-26b3ba",
  "org.scalablytyped.slinky" %%% "d3-scale" % "3.2-dt-20201104Z-a97d08",
  "org.scalablytyped.slinky" %%% "d3-shape" % "2.0-dt-20201028Z-6fdc08",
  "org.scalablytyped.slinky" %%% "d3-time" % "2.0-dt-20201002Z-57bc02",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ed7fbd",
  "org.scalablytyped.slinky" %%% "react" % "17.0-dt-20201121Z-8f0b52",
  "org.scalablytyped.slinky" %%% "react-native" % "0.63-dt-20201120Z-c651fe",
  "org.scalablytyped.slinky" %%% "react-native-svg" % "12.1.0-413c3d",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
