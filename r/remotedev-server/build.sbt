organization := "org.scalablytyped.slinky"
name := "remotedev-server"
version := "0.3-dt-20200721Z-ab38dc"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "async" % "3.2-dt-20201112Z-e264ed",
  "org.scalablytyped.slinky" %%% "async-iterable-stream" % "3.0-dt-20200205Z-714ba9",
  "org.scalablytyped.slinky" %%% "consumable-stream" % "1.0-dt-20200205Z-22ff39",
  "org.scalablytyped.slinky" %%% "expirymanager" % "0.9-dt-20181130Z-3b3214",
  "org.scalablytyped.slinky" %%% "fleximap" % "0.9-dt-20181205Z-4186d9",
  "org.scalablytyped.slinky" %%% "jsonwebtoken" % "8.5-dt-20200513Z-373806",
  "org.scalablytyped.slinky" %%% "ncom" % "1.0-dt-20200205Z-255cc0",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "sc-auth" % "5.0-dt-20200407Z-66949b",
  "org.scalablytyped.slinky" %%% "sc-broker" % "8.0-dt-20200519Z-f426b9",
  "org.scalablytyped.slinky" %%% "sc-broker-cluster" % "9.0-dt-20200205Z-23f4a2",
  "org.scalablytyped.slinky" %%% "sc-channel" % "2.0-dt-20200205Z-e061b1",
  "org.scalablytyped.slinky" %%% "socketcluster" % "14.0-dt-20200205Z-34192c",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533",
  "org.scalablytyped.slinky" %%% "stream-demux" % "7.0-dt-20200902Z-09cc48",
  "org.scalablytyped.slinky" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-72a4e4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
