organization := "org.scalablytyped.slinky"
name := "react-pose"
version := "4.0.10-ed1ef0"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-34c756",
  "org.scalablytyped.slinky" %%% "framesync" % "4.0.4-a2485c",
  "org.scalablytyped.slinky" %%% "popmotion" % "8.7.1-973fb0",
  "org.scalablytyped.slinky" %%% "popmotion-pose" % "3.4.11-def4fe",
  "org.scalablytyped.slinky" %%% "popmotion__easing" % "1.0.2-2eb98e",
  "org.scalablytyped.slinky" %%% "popmotion__popcorn" % "0.4.4-7c180b",
  "org.scalablytyped.slinky" %%% "pose-core" % "2.1.1-360fc7",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-243f84",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20191126Z-6c3558",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821",
  "org.scalablytyped.slinky" %%% "style-value-types" % "3.1.7-539f3f",
  "org.scalablytyped.slinky" %%% "stylefire" % "7.0.1-d1aa72",
  "org.scalablytyped.slinky" %%% "ts-essentials" % "1.0.4-2d466f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        