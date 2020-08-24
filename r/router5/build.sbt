organization := "org.scalablytyped.slinky"
name := "router5"
version := "8.0.1-b91285"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "path-parser" % "6.1.0-89cd88",
  "org.scalablytyped.slinky" %%% "route-node" % "4.1.1-0b32aa",
  "org.scalablytyped.slinky" %%% "router5-transition-path" % "8.0.1-9f1cad",
  "org.scalablytyped.slinky" %%% "search-params" % "3.0.0-1da891",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
