organization := "org.scalablytyped.slinky"
name := "material__select"
version := "7.0.0-46affd"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "material__base" % "7.0.0-7a21fc",
  "org.scalablytyped.slinky" %%% "material__floating-label" % "7.0.0-808b38",
  "org.scalablytyped.slinky" %%% "material__line-ripple" % "7.0.0-33a349",
  "org.scalablytyped.slinky" %%% "material__list" % "7.0.0-8f487e",
  "org.scalablytyped.slinky" %%% "material__menu" % "7.0.0-1d3e25",
  "org.scalablytyped.slinky" %%% "material__menu-surface" % "7.0.0-8f3672",
  "org.scalablytyped.slinky" %%% "material__notched-outline" % "7.0.0-fdbb49",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
