organization := "org.scalablytyped.slinky"
name := "sc-hot-reboot"
version := "1.0-dt-20200205Z-44650e"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "ag-channel" % "4.0-dt-20200205Z-0cd300",
  "org.scalablytyped.slinky" %%% "ag-simple-broker" % "4.0-dt-20200205Z-66558d",
  "org.scalablytyped.slinky" %%% "async" % "3.2-dt-20200427Z-a5da39",
  "org.scalablytyped.slinky" %%% "async-iterable-stream" % "3.0-dt-20200205Z-c5dba5",
  "org.scalablytyped.slinky" %%% "async-stream-emitter" % "3.0-dt-20200205Z-b32fea",
  "org.scalablytyped.slinky" %%% "chokidar" % "3.3.1-c4152c",
  "org.scalablytyped.slinky" %%% "consumable-stream" % "1.0-dt-20200205Z-da1d91",
  "org.scalablytyped.slinky" %%% "expirymanager" % "0.9-dt-20181130Z-c45d13",
  "org.scalablytyped.slinky" %%% "fleximap" % "0.9-dt-20181205Z-8b4eaa",
  "org.scalablytyped.slinky" %%% "jsonwebtoken" % "8.3-dt-20200407Z-9cf225",
  "org.scalablytyped.slinky" %%% "ncom" % "1.0-dt-20200205Z-586b20",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "sc-auth" % "5.0-dt-20200407Z-e3c167",
  "org.scalablytyped.slinky" %%% "sc-broker" % "8.0-dt-20200205Z-11d4b5",
  "org.scalablytyped.slinky" %%% "sc-broker-cluster" % "9.0-dt-20200205Z-a1577c",
  "org.scalablytyped.slinky" %%% "sc-channel" % "2.0-dt-20200205Z-ab9880",
  "org.scalablytyped.slinky" %%% "sc-errors" % "1.4-dt-20200205Z-010701",
  "org.scalablytyped.slinky" %%% "socketcluster" % "14.0-dt-20200205Z-002782",
  "org.scalablytyped.slinky" %%% "socketcluster-server" % "15.0-dt-20200214Z-44ef7e",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "stream-demux" % "7.0-dt-20200205Z-594f12",
  "org.scalablytyped.slinky" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-7144cf",
  "org.scalablytyped.slinky" %%% "ws" % "7.2-dt-20200413Z-ae451a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
