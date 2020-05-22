organization := "org.scalablytyped.slinky"
name := "sc-framework-health-check"
version := "2.0-dt-20200205Z-8e2af0"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "async" % "3.2-dt-20200515Z-017136",
  "org.scalablytyped.slinky" %%% "async-iterable-stream" % "3.0-dt-20200205Z-35aa34",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-3172ef",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200515Z-49be3e",
  "org.scalablytyped.slinky" %%% "consumable-stream" % "1.0-dt-20200205Z-4fc092",
  "org.scalablytyped.slinky" %%% "expirymanager" % "0.9-dt-20181130Z-871e30",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20200515Z-35525e",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200515Z-f4fc10",
  "org.scalablytyped.slinky" %%% "fleximap" % "0.9-dt-20181205Z-2eb0fa",
  "org.scalablytyped.slinky" %%% "jsonwebtoken" % "8.5-dt-20200513Z-5cf1aa",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20200515Z-2900a9",
  "org.scalablytyped.slinky" %%% "ncom" % "1.0-dt-20200205Z-706418",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20200519Z-8e6135",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-0a4f98",
  "org.scalablytyped.slinky" %%% "sc-auth" % "5.0-dt-20200407Z-0b0b01",
  "org.scalablytyped.slinky" %%% "sc-broker" % "8.0-dt-20200519Z-1c078e",
  "org.scalablytyped.slinky" %%% "sc-broker-cluster" % "9.0-dt-20200205Z-4a0d36",
  "org.scalablytyped.slinky" %%% "sc-channel" % "2.0-dt-20200205Z-201c35",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20200519Z-85de9b",
  "org.scalablytyped.slinky" %%% "socketcluster" % "14.0-dt-20200205Z-5327b3",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0",
  "org.scalablytyped.slinky" %%% "stream-demux" % "7.0-dt-20200205Z-169d37",
  "org.scalablytyped.slinky" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-66bc37")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
