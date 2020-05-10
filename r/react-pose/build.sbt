organization := "org.scalablytyped.slinky"
name := "react-pose"
version := "4.0.10-d7e421"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-fa3762",
  "org.scalablytyped.slinky" %%% "framesync" % "4.0.4-99528b",
  "org.scalablytyped.slinky" %%% "popmotion" % "8.7.1-eed4a6",
  "org.scalablytyped.slinky" %%% "popmotion-pose" % "3.4.11-482e06",
  "org.scalablytyped.slinky" %%% "popmotion__easing" % "1.0.2-99ba95",
  "org.scalablytyped.slinky" %%% "popmotion__popcorn" % "0.4.4-b79ee3",
  "org.scalablytyped.slinky" %%% "pose-core" % "2.1.1-7efe94",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-24495c",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200409Z-47fb9f",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e",
  "org.scalablytyped.slinky" %%% "style-value-types" % "3.1.7-30eace",
  "org.scalablytyped.slinky" %%% "stylefire" % "7.0.1-dae369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
