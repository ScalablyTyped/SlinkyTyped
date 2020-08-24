organization := "org.scalablytyped.slinky"
name := "material__textfield"
version := "7.0.0-2be06e"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "material__base" % "7.0.0-16f095",
  "org.scalablytyped.slinky" %%% "material__floating-label" % "7.0.0-1213a7",
  "org.scalablytyped.slinky" %%% "material__line-ripple" % "7.0.0-f19224",
  "org.scalablytyped.slinky" %%% "material__notched-outline" % "7.0.0-1f8d4f",
  "org.scalablytyped.slinky" %%% "material__ripple" % "7.0.0-8a5776",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
