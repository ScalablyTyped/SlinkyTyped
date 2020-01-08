organization := "org.scalablytyped.slinky"
name := "apollo-link-ws"
version := "1.0.19-503501"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "apollo-link" % "1.2.13-c98446",
  "org.scalablytyped.slinky" %%% "eventemitter3" % "4.0.0-b51520",
  "org.scalablytyped.slinky" %%% "graphql" % "14.5.8-ffbf48",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43",
  "org.scalablytyped.slinky" %%% "subscriptions-transport-ws" % "0.9.16-ad1fe7",
  "org.scalablytyped.slinky" %%% "ws" % "6.0-dt-20191125Z-3ee039",
  "org.scalablytyped.slinky" %%% "zen-observable-ts" % "0.8.20-28d607")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        