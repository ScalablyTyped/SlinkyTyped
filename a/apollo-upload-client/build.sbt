organization := "org.scalablytyped.slinky"
name := "apollo-upload-client"
version := "8.1-dt-20190827Z-390679"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "apollo-link" % "1.2.13-364afd",
  "org.scalablytyped.slinky" %%% "apollo-link-http-common" % "0.2.15-2c2ea2",
  "org.scalablytyped.slinky" %%% "extract-files" % "3.1-dt-20180516Z-e8d074",
  "org.scalablytyped.slinky" %%% "graphql" % "14.6.0-1eff51",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "zen-observable-ts" % "0.8.20-69885a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
