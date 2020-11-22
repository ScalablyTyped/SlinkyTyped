organization := "org.scalablytyped.slinky"
name := "sc-framework-health-check"
version := "2.0-dt-20200205Z-e29985"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "async" % "3.2-dt-20201112Z-e264ed",
  "org.scalablytyped.slinky" %%% "async-iterable-stream" % "3.0-dt-20200205Z-714ba9",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-288ac7",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20201002Z-8c61d7",
  "org.scalablytyped.slinky" %%% "consumable-stream" % "1.0-dt-20200205Z-22ff39",
  "org.scalablytyped.slinky" %%% "expirymanager" % "0.9-dt-20181130Z-3b3214",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20201111Z-3019f6",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200921Z-5d68bc",
  "org.scalablytyped.slinky" %%% "fleximap" % "0.9-dt-20181205Z-4186d9",
  "org.scalablytyped.slinky" %%% "jsonwebtoken" % "8.5-dt-20200513Z-373806",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20200722Z-6314e7",
  "org.scalablytyped.slinky" %%% "ncom" % "1.0-dt-20200205Z-255cc0",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20201002Z-ff6847",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20201002Z-f6189b",
  "org.scalablytyped.slinky" %%% "sc-auth" % "5.0-dt-20200407Z-66949b",
  "org.scalablytyped.slinky" %%% "sc-broker" % "8.0-dt-20200519Z-f426b9",
  "org.scalablytyped.slinky" %%% "sc-broker-cluster" % "9.0-dt-20200205Z-23f4a2",
  "org.scalablytyped.slinky" %%% "sc-channel" % "2.0-dt-20200205Z-e061b1",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20201117Z-ffbd1b",
  "org.scalablytyped.slinky" %%% "socketcluster" % "14.0-dt-20200205Z-34192c",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533",
  "org.scalablytyped.slinky" %%% "stream-demux" % "7.0-dt-20200902Z-09cc48",
  "org.scalablytyped.slinky" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-72a4e4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
