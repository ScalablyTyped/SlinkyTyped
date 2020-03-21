organization := "org.scalablytyped.slinky"
name := "sc-framework-health-check"
version := "2.0-dt-20200205Z-d28186"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "async" % "3.0-dt-20200225Z-476900",
  "org.scalablytyped.slinky" %%% "async-iterable-stream" % "3.0-dt-20200205Z-0a6867",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-ed4596",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200226Z-b2d5a0",
  "org.scalablytyped.slinky" %%% "consumable-stream" % "1.0-dt-20200205Z-7fc1af",
  "org.scalablytyped.slinky" %%% "expirymanager" % "0.9-dt-20181130Z-157dc9",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20200227Z-17932f",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200225Z-62466e",
  "org.scalablytyped.slinky" %%% "fleximap" % "0.9-dt-20181205Z-8d93c2",
  "org.scalablytyped.slinky" %%% "jsonwebtoken" % "8.3-dt-20200228Z-b23aae",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20191126Z-e728ff",
  "org.scalablytyped.slinky" %%% "ncom" % "1.0-dt-20200205Z-561749",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-6f090d",
  "org.scalablytyped.slinky" %%% "sc-auth" % "5.0-dt-20181130Z-1619f6",
  "org.scalablytyped.slinky" %%% "sc-broker" % "8.0-dt-20200205Z-24aa3b",
  "org.scalablytyped.slinky" %%% "sc-broker-cluster" % "9.0-dt-20200205Z-753a90",
  "org.scalablytyped.slinky" %%% "sc-channel" % "2.0-dt-20200205Z-548f6c",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20200227Z-3c94e9",
  "org.scalablytyped.slinky" %%% "socketcluster" % "14.0-dt-20200205Z-10c6f2",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "stream-demux" % "7.0-dt-20200205Z-6362ab",
  "org.scalablytyped.slinky" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-4b8817")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
