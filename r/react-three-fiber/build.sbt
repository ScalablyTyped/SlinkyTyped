organization := "org.scalablytyped.slinky"
name := "react-three-fiber"
version := "5.3.1-8598b3"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.14-58bcb0",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-931d77",
  "org.scalablytyped.slinky" %%% "react" % "17.0-dt-20201121Z-9cde70",
  "org.scalablytyped.slinky" %%% "react-native" % "0.63-dt-20201120Z-a23376",
  "org.scalablytyped.slinky" %%% "react-reconciler" % "0.18-dt-20190109Z-1a7a51",
  "org.scalablytyped.slinky" %%% "react-use-measure" % "2.0.3-8e1f6a",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "three" % "0.122.0-d21a3b",
  "org.scalablytyped.slinky" %%% "tiny-emitter" % "2.1.0-bf7ecf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
