organization := "org.scalablytyped.slinky"
name := "graphql-binding"
version := "2.5.2-fca011"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "apollo-link" % "1.2.13-631faf",
  "org.scalablytyped.slinky" %%% "ava" % "2.4.0-902fd6",
  "org.scalablytyped.slinky" %%% "graphql" % "14.6.0-444891",
  "org.scalablytyped.slinky" %%% "graphql-tools" % "4.0.7-e1d49f",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e",
  "org.scalablytyped.slinky" %%% "zen-observable-ts" % "0.8.20-044a86")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
