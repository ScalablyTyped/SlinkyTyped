organization := "org.scalablytyped.slinky"
name := "apollo-react"
version := "0.7.1-12839c"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "apollo-cache" % "1.3.5-15f71e",
  "org.scalablytyped.slinky" %%% "apollo-client" % "2.6.10-5c30a6",
  "org.scalablytyped.slinky" %%% "apollo-link" % "1.2.14-613542",
  "org.scalablytyped.slinky" %%% "apollo-utilities" % "1.3.4-cad2fb",
  "org.scalablytyped.slinky" %%% "csstype" % "3.0.2-fce754",
  "org.scalablytyped.slinky" %%% "graphql" % "15.3.0-09ebdf",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ce652f",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200711Z-6a9854",
  "org.scalablytyped.slinky" %%% "redux" % "4.0.5-13a419",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "typed-graphql" % "1.0.2-e2ee6d",
  "org.scalablytyped.slinky" %%% "zen-observable" % "0.8-dt-20200515Z-c83963",
  "org.scalablytyped.slinky" %%% "zen-observable-ts" % "0.8.21-d6155f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
