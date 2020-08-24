organization := "org.scalablytyped.slinky"
name := "prisma-binding"
version := "2.3.16-2e88df"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "apollo-link" % "1.2.14-e66111",
  "org.scalablytyped.slinky" %%% "ava" % "3.11.0-e0bf50",
  "org.scalablytyped.slinky" %%% "graphql" % "15.3.0-079e56",
  "org.scalablytyped.slinky" %%% "graphql-binding" % "2.5.2-0b14c5",
  "org.scalablytyped.slinky" %%% "graphql-tools__utils" % "6.0.15-531dfc",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8",
  "org.scalablytyped.slinky" %%% "zen-observable-ts" % "0.8.21-82acd0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
