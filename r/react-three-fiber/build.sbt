organization := "org.scalablytyped.slinky"
name := "react-three-fiber"
version := "5.3.1-d18aca"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.14-23cf0c",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ed7fbd",
  "org.scalablytyped.slinky" %%% "react" % "17.0-dt-20201121Z-8f0b52",
  "org.scalablytyped.slinky" %%% "react-native" % "0.63-dt-20201120Z-c651fe",
  "org.scalablytyped.slinky" %%% "react-reconciler" % "0.18-dt-20190109Z-c40ed5",
  "org.scalablytyped.slinky" %%% "react-use-measure" % "2.0.3-582424",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533",
  "org.scalablytyped.slinky" %%% "three" % "0.122.0-2e135e",
  "org.scalablytyped.slinky" %%% "tiny-emitter" % "2.1.0-37f615")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
