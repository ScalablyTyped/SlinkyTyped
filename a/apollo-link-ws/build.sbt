organization := "org.scalablytyped.slinky"
name := "apollo-link-ws"
version := "1.0.19-c116a4"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "apollo-link" % "1.2.13-c0afa5",
  "org.scalablytyped.slinky" %%% "eventemitter3" % "4.0.0-c10e8e",
  "org.scalablytyped.slinky" %%% "graphql" % "14.5.8-a854ac",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821",
  "org.scalablytyped.slinky" %%% "subscriptions-transport-ws" % "0.9.16-25e9ac",
  "org.scalablytyped.slinky" %%% "ws" % "6.0-dt-20191125Z-5dacb9",
  "org.scalablytyped.slinky" %%% "zen-observable-ts" % "0.8.20-9b9238")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        