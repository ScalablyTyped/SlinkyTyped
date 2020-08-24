organization := "org.scalablytyped.slinky"
name := "popmotion"
version := "8.7.3-c5b434"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "framesync" % "4.0.4-fa3508",
  "org.scalablytyped.slinky" %%% "popmotion__easing" % "1.0.2-cc701e",
  "org.scalablytyped.slinky" %%% "popmotion__popcorn" % "0.4.4-1c5622",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8",
  "org.scalablytyped.slinky" %%% "style-value-types" % "3.1.9-cf10c0",
  "org.scalablytyped.slinky" %%% "stylefire" % "7.0.3-07572d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
