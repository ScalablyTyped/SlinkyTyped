organization := "org.scalablytyped.slinky"
name := "react-pose"
version := "4.0.10-86a46c"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-e9335f",
  "org.scalablytyped.slinky" %%% "framesync" % "4.0.4-fcc7c9",
  "org.scalablytyped.slinky" %%% "popmotion" % "8.7.1-91511a",
  "org.scalablytyped.slinky" %%% "popmotion-pose" % "3.4.11-c45bc1",
  "org.scalablytyped.slinky" %%% "popmotion__easing" % "1.0.2-ec728b",
  "org.scalablytyped.slinky" %%% "popmotion__popcorn" % "0.4.4-a1835c",
  "org.scalablytyped.slinky" %%% "pose-core" % "2.1.1-694629",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-7e1d98",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200409Z-36b705",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "style-value-types" % "3.1.7-d24a4b",
  "org.scalablytyped.slinky" %%% "stylefire" % "7.0.1-b7eb40")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
