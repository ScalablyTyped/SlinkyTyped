organization := "org.scalablytyped.slinky"
name := "react-pose"
version := "4.0.10-225e3f"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.14-23cf0c",
  "org.scalablytyped.slinky" %%% "popmotion-pose" % "3.4.11-330a66",
  "org.scalablytyped.slinky" %%% "popmotion__easing" % "1.0.2-847b3e",
  "org.scalablytyped.slinky" %%% "pose-core" % "2.1.1-a3f090",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ed7fbd",
  "org.scalablytyped.slinky" %%% "react" % "17.0-dt-20201121Z-8f0b52",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533",
  "org.scalablytyped.slinky" %%% "style-value-types" % "3.1.9-ec7ce6",
  "org.scalablytyped.slinky" %%% "stylefire" % "7.0.3-01fd76",
  "org.scalablytyped.slinky" %%% "ts-essentials" % "2.0.12-16468e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
