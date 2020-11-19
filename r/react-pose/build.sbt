organization := "org.scalablytyped.slinky"
name := "react-pose"
version := "4.0.10-c8a562"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "csstype" % "3.0.2-fce754",
  "org.scalablytyped.slinky" %%% "framesync" % "4.0.4-feb271",
  "org.scalablytyped.slinky" %%% "popmotion" % "8.7.3-944f80",
  "org.scalablytyped.slinky" %%% "popmotion-pose" % "3.4.11-04adb5",
  "org.scalablytyped.slinky" %%% "popmotion__easing" % "1.0.2-847b3e",
  "org.scalablytyped.slinky" %%% "popmotion__popcorn" % "0.4.4-cdbc9c",
  "org.scalablytyped.slinky" %%% "pose-core" % "2.1.1-8525be",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ce652f",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200711Z-6a9854",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "style-value-types" % "3.1.9-10ce1c",
  "org.scalablytyped.slinky" %%% "stylefire" % "7.0.3-0ba80c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
