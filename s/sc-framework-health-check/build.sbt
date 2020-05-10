organization := "org.scalablytyped.slinky"
name := "sc-framework-health-check"
version := "2.0-dt-20200205Z-01002a"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "async" % "3.2-dt-20200427Z-cd91e9",
  "org.scalablytyped.slinky" %%% "async-iterable-stream" % "3.0-dt-20200205Z-e5f300",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-e2128c",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200226Z-196a23",
  "org.scalablytyped.slinky" %%% "consumable-stream" % "1.0-dt-20200205Z-4552ae",
  "org.scalablytyped.slinky" %%% "expirymanager" % "0.9-dt-20181130Z-4ef3a9",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20200409Z-5ef924",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200415Z-f286fc",
  "org.scalablytyped.slinky" %%% "fleximap" % "0.9-dt-20181205Z-7058f8",
  "org.scalablytyped.slinky" %%% "jsonwebtoken" % "8.3-dt-20200407Z-bf67f0",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20191126Z-46fc76",
  "org.scalablytyped.slinky" %%% "ncom" % "1.0-dt-20200205Z-73f5db",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20200225Z-632c59",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-3e2563",
  "org.scalablytyped.slinky" %%% "sc-auth" % "5.0-dt-20200407Z-268e84",
  "org.scalablytyped.slinky" %%% "sc-broker" % "8.0-dt-20200205Z-c56123",
  "org.scalablytyped.slinky" %%% "sc-broker-cluster" % "9.0-dt-20200205Z-daed9a",
  "org.scalablytyped.slinky" %%% "sc-channel" % "2.0-dt-20200205Z-1c069a",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20200227Z-16be36",
  "org.scalablytyped.slinky" %%% "socketcluster" % "14.0-dt-20200205Z-5f9e04",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e",
  "org.scalablytyped.slinky" %%% "stream-demux" % "7.0-dt-20200205Z-010fa8",
  "org.scalablytyped.slinky" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-fb63ff")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
