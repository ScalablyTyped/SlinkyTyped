organization := "org.scalablytyped.slinky"
name := "firebase__performance"
version := "0.4.4-c2e9b0"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "firebase__app-types" % "0.6.1-e1e312",
  "org.scalablytyped.slinky" %%% "firebase__installations-types" % "0.3.4-7be9a5",
  "org.scalablytyped.slinky" %%% "firebase__logger" % "0.2.6-1cc4ee",
  "org.scalablytyped.slinky" %%% "firebase__performance-types" % "0.0.13-963603",
  "org.scalablytyped.slinky" %%% "firebase__util" % "0.3.4-acbd2b",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
