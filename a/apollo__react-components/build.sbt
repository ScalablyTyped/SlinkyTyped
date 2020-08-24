organization := "org.scalablytyped.slinky"
name := "apollo__react-components"
version := "3.1.5-d71312"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "apollo-cache" % "1.3.5-5546a5",
  "org.scalablytyped.slinky" %%% "apollo-client" % "2.6.10-2fc756",
  "org.scalablytyped.slinky" %%% "apollo-link" % "1.2.14-e66111",
  "org.scalablytyped.slinky" %%% "apollo-utilities" % "1.3.4-fd388b",
  "org.scalablytyped.slinky" %%% "apollo__react-common" % "3.1.4-aa2348",
  "org.scalablytyped.slinky" %%% "csstype" % "3.0.2-c880b4",
  "org.scalablytyped.slinky" %%% "graphql" % "15.3.0-079e56",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-9fd6d8",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200711Z-c528cd",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8",
  "org.scalablytyped.slinky" %%% "zen-observable" % "0.8-dt-20200515Z-7c78fc",
  "org.scalablytyped.slinky" %%% "zen-observable-ts" % "0.8.21-82acd0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
