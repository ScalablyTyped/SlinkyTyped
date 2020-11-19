organization := "org.scalablytyped.slinky"
name := "absinthe__socket-apollo-link"
version := "0.2-dt-20200623Z-bf8a1a"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "absinthe__socket" % "0.2-dt-20200616Z-d6f67b",
  "org.scalablytyped.slinky" %%% "apollo-link" % "1.2.14-613542",
  "org.scalablytyped.slinky" %%% "graphql" % "15.3.0-09ebdf",
  "org.scalablytyped.slinky" %%% "phoenix" % "1.4-dt-20200408Z-96c8c1",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "zen-observable-ts" % "0.8.21-d6155f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
