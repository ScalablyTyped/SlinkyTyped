organization := "org.scalablytyped.slinky"
name := "material__select"
version := "8.0.0-fd3351"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "material__base" % "8.0.0-33b576",
  "org.scalablytyped.slinky" %%% "material__floating-label" % "8.0.0-79b610",
  "org.scalablytyped.slinky" %%% "material__line-ripple" % "8.0.0-30455f",
  "org.scalablytyped.slinky" %%% "material__list" % "8.0.0-23f09b",
  "org.scalablytyped.slinky" %%% "material__menu" % "8.0.0-41e86a",
  "org.scalablytyped.slinky" %%% "material__menu-surface" % "8.0.0-0cb230",
  "org.scalablytyped.slinky" %%% "material__notched-outline" % "8.0.0-9f093e",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
