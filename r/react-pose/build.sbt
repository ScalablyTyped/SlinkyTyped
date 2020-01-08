organization := "org.scalablytyped.slinky"
name := "react-pose"
version := "4.0.10-56cb0c"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-f22bc8",
  "org.scalablytyped.slinky" %%% "framesync" % "4.0.4-8a3564",
  "org.scalablytyped.slinky" %%% "popmotion" % "8.7.1-24487c",
  "org.scalablytyped.slinky" %%% "popmotion-pose" % "3.4.11-e92dd1",
  "org.scalablytyped.slinky" %%% "popmotion__easing" % "1.0.2-3bdef0",
  "org.scalablytyped.slinky" %%% "popmotion__popcorn" % "0.4.4-34a040",
  "org.scalablytyped.slinky" %%% "pose-core" % "2.1.1-8aa088",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-1d231d",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20191220Z-f02704",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43",
  "org.scalablytyped.slinky" %%% "style-value-types" % "3.1.7-03f4ef",
  "org.scalablytyped.slinky" %%% "stylefire" % "7.0.1-4ed741",
  "org.scalablytyped.slinky" %%% "ts-essentials" % "1.0.4-32d32f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        