organization := "org.scalablytyped.slinky"
name := "apollo-upload-client"
version := "8.1-dt-20190827Z-aa4c94"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "apollo-link" % "1.2.13-b167c5",
  "org.scalablytyped.slinky" %%% "apollo-link-http-common" % "0.2.15-a46ef7",
  "org.scalablytyped.slinky" %%% "extract-files" % "3.1-dt-20180516Z-745175",
  "org.scalablytyped.slinky" %%% "graphql" % "14.6.0-5be153",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "zen-observable-ts" % "0.8.20-4f9a1b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
