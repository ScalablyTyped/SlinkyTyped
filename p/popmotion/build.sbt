organization := "org.scalablytyped.slinky"
name := "popmotion"
version := "8.7.3-1d3dfc"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "framesync" % "4.0.4-0a9606",
  "org.scalablytyped.slinky" %%% "popmotion__easing" % "1.0.2-77664a",
  "org.scalablytyped.slinky" %%% "popmotion__popcorn" % "0.4.4-4889b2",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0",
  "org.scalablytyped.slinky" %%% "style-value-types" % "3.1.7-7e0e89",
  "org.scalablytyped.slinky" %%% "stylefire" % "7.0.3-29e91c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
