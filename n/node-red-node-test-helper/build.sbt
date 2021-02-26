organization := "org.scalablytyped.slinky"
name := "node-red-node-test-helper"
version := "0.2-dt-20200925Z-513f7a"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "ace" % "0.0-unknown-dt-20201013Z-e2cd3b",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-a3cce0",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20201002Z-671a3f",
  "org.scalablytyped.slinky" %%% "cookiejar" % "2.1-dt-20201014Z-7e9ed2",
  "org.scalablytyped.slinky" %%% "cors" % "2.8-dt-20201010Z-6f9760",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20201111Z-1b328b",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200921Z-935502",
  "org.scalablytyped.slinky" %%% "jquery" % "3.5-dt-20201028Z-7b4ce2",
  "org.scalablytyped.slinky" %%% "jsonata" % "1.8.4-410f85",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20200722Z-25c5b2",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "node-red" % "1.1-dt-20200925Z-52fbed",
  "org.scalablytyped.slinky" %%% "node-red__editor-api" % "1.1-dt-20200925Z-086129",
  "org.scalablytyped.slinky" %%% "node-red__editor-client" % "1.1-dt-20201028Z-3aa69c",
  "org.scalablytyped.slinky" %%% "node-red__registry" % "1.1-dt-20200925Z-8a2a45",
  "org.scalablytyped.slinky" %%% "node-red__runtime" % "1.1-dt-20201028Z-e73ba4",
  "org.scalablytyped.slinky" %%% "node-red__util" % "1.1-dt-20200925Z-5b1d7d",
  "org.scalablytyped.slinky" %%% "passport" % "1.0-dt-20201112Z-419f36",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20201002Z-9bc0d9",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20201002Z-d58f66",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20201117Z-7353a1",
  "org.scalablytyped.slinky" %%% "sinon" % "9.0-dt-20201003Z-8fb0a4",
  "org.scalablytyped.slinky" %%% "sinonjs__fake-timers" % "6.0-dt-20200925Z-bd2398",
  "org.scalablytyped.slinky" %%% "sizzle" % "2.3-dt-20201002Z-da3788",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "superagent" % "4.1-dt-20200825Z-87087f",
  "org.scalablytyped.slinky" %%% "supertest" % "v2.0.1-dt-20201002Z-d11475")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
