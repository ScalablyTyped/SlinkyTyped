organization := "org.scalablytyped.slinky"
name := "prisma-binding"
version := "2.3.16-3e9392"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "apollo-link" % "1.2.13-c98446",
  "org.scalablytyped.slinky" %%% "ava" % "2.4.0-654b39",
  "org.scalablytyped.slinky" %%% "graphql" % "14.5.8-ffbf48",
  "org.scalablytyped.slinky" %%% "graphql-binding" % "2.5.2-3b7bc5",
  "org.scalablytyped.slinky" %%% "graphql-tools" % "4.0.6-54ebca",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43",
  "org.scalablytyped.slinky" %%% "zen-observable-ts" % "0.8.20-28d607")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        