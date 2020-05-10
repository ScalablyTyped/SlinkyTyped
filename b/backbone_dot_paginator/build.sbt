organization := "org.scalablytyped.slinky"
name := "backbone_dot_paginator"
version := "2.0-dt-20200225Z-877b6b"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "backbone" % "1.4-dt-20200225Z-a4527a",
  "org.scalablytyped.slinky" %%% "jquery" % "3.3-dt-20200427Z-d88135",
  "org.scalablytyped.slinky" %%% "sizzle" % "2.3-dt-20181006Z-1b2bf8",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e",
  "org.scalablytyped.slinky" %%% "underscore" % "1.9-dt-20200225Z-3cf1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
