organization := "org.scalablytyped.slinky"
name := "remotedev-server"
version := "0.3-dt-20200721Z-570a01"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "async" % "3.2-dt-20200515Z-fc1cff",
  "org.scalablytyped.slinky" %%% "async-iterable-stream" % "3.0-dt-20200205Z-318974",
  "org.scalablytyped.slinky" %%% "consumable-stream" % "1.0-dt-20200205Z-22b34c",
  "org.scalablytyped.slinky" %%% "expirymanager" % "0.9-dt-20181130Z-ffe414",
  "org.scalablytyped.slinky" %%% "fleximap" % "0.9-dt-20181205Z-ce6eef",
  "org.scalablytyped.slinky" %%% "jsonwebtoken" % "8.5-dt-20200513Z-c7f19c",
  "org.scalablytyped.slinky" %%% "ncom" % "1.0-dt-20200205Z-0ef4b6",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "sc-auth" % "5.0-dt-20200407Z-30a297",
  "org.scalablytyped.slinky" %%% "sc-broker" % "8.0-dt-20200519Z-cf2285",
  "org.scalablytyped.slinky" %%% "sc-broker-cluster" % "9.0-dt-20200205Z-6cd086",
  "org.scalablytyped.slinky" %%% "sc-channel" % "2.0-dt-20200205Z-0bd8d1",
  "org.scalablytyped.slinky" %%% "socketcluster" % "14.0-dt-20200205Z-ff0293",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "stream-demux" % "7.0-dt-20200205Z-af3939",
  "org.scalablytyped.slinky" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-99f582")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
