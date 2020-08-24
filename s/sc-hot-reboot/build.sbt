organization := "org.scalablytyped.slinky"
name := "sc-hot-reboot"
version := "1.0-dt-20200205Z-bc29da"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "async" % "3.2-dt-20200515Z-c1210a",
  "org.scalablytyped.slinky" %%% "async-iterable-stream" % "3.0-dt-20200205Z-84eb29",
  "org.scalablytyped.slinky" %%% "chokidar" % "3.4.1-d27a9c",
  "org.scalablytyped.slinky" %%% "consumable-stream" % "1.0-dt-20200205Z-572183",
  "org.scalablytyped.slinky" %%% "expirymanager" % "0.9-dt-20181130Z-7640ec",
  "org.scalablytyped.slinky" %%% "fleximap" % "0.9-dt-20181205Z-3ef522",
  "org.scalablytyped.slinky" %%% "jsonwebtoken" % "8.5-dt-20200513Z-cc06d3",
  "org.scalablytyped.slinky" %%% "ncom" % "1.0-dt-20200205Z-eecb5f",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-df8c17",
  "org.scalablytyped.slinky" %%% "sc-auth" % "5.0-dt-20200407Z-fb57e2",
  "org.scalablytyped.slinky" %%% "sc-broker" % "8.0-dt-20200519Z-86ac0f",
  "org.scalablytyped.slinky" %%% "sc-broker-cluster" % "9.0-dt-20200205Z-c9bed2",
  "org.scalablytyped.slinky" %%% "sc-channel" % "2.0-dt-20200205Z-f75c11",
  "org.scalablytyped.slinky" %%% "socketcluster" % "14.0-dt-20200205Z-445b1a",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8",
  "org.scalablytyped.slinky" %%% "stream-demux" % "7.0-dt-20200205Z-ced1d2",
  "org.scalablytyped.slinky" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-c09a3d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
