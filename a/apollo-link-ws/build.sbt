organization := "org.scalablytyped.slinky"
name := "apollo-link-ws"
version := "1.0.19-6c3355"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "apollo-link" % "1.2.14-613542",
  "org.scalablytyped.slinky" %%% "eventemitter3" % "4.0.4-df42d1",
  "org.scalablytyped.slinky" %%% "graphql" % "15.3.0-09ebdf",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "subscriptions-transport-ws" % "0.9.17-b1df5b",
  "org.scalablytyped.slinky" %%% "ws" % "7.2-dt-20200629Z-5fdf7f",
  "org.scalablytyped.slinky" %%% "zen-observable-ts" % "0.8.21-d6155f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
