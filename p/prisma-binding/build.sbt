organization := "org.scalablytyped.slinky"
name := "prisma-binding"
version := "2.3.16-86e97c"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "apollo-link" % "1.2.13-364afd",
  "org.scalablytyped.slinky" %%% "ava" % "2.4.0-3e78c1",
  "org.scalablytyped.slinky" %%% "graphql" % "14.6.0-1eff51",
  "org.scalablytyped.slinky" %%% "graphql-binding" % "2.5.2-c7241c",
  "org.scalablytyped.slinky" %%% "graphql-tools" % "4.0.6-e9e202",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "zen-observable-ts" % "0.8.20-69885a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
