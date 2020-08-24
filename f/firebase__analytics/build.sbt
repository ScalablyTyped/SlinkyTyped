organization := "org.scalablytyped.slinky"
name := "firebase__analytics"
version := "0.4.1-d58d57"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "firebase__analytics-types" % "0.3.1-17641d",
  "org.scalablytyped.slinky" %%% "firebase__app-types" % "0.6.1-a0c0df",
  "org.scalablytyped.slinky" %%% "firebase__installations-types" % "0.3.4-e1ab7c",
  "org.scalablytyped.slinky" %%% "firebase__logger" % "0.2.6-af732d",
  "org.scalablytyped.slinky" %%% "firebase__util" % "0.3.0-29a7b8",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
