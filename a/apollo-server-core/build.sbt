organization := "org.scalablytyped.slinky"
name := "apollo-server-core"
version := "2.11.0-ea64ce"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "accepts" % "1.3-dt-20180214Z-e97526",
  "org.scalablytyped.slinky" %%% "apollo-cache-control" % "0.9.0-b2354d",
  "org.scalablytyped.slinky" %%% "apollo-datasource" % "0.7.0-977346",
  "org.scalablytyped.slinky" %%% "apollo-engine-reporting" % "1.7.0-d2a542",
  "org.scalablytyped.slinky" %%% "apollo-engine-reporting-protobuf" % "0.4.4-661895",
  "org.scalablytyped.slinky" %%% "apollo-link" % "1.2.13-631faf",
  "org.scalablytyped.slinky" %%% "apollo-server-caching" % "0.5.1-fa0659",
  "org.scalablytyped.slinky" %%% "apollo-server-env" % "2.4.3-9d01fe",
  "org.scalablytyped.slinky" %%% "apollo-server-errors" % "2.4.0-4a9718",
  "org.scalablytyped.slinky" %%% "apollo-server-plugin-base" % "0.7.0-fbb1cb",
  "org.scalablytyped.slinky" %%% "apollo-server-types" % "0.3.0-f43d45",
  "org.scalablytyped.slinky" %%% "apollo__protobufjs" % "1.0.3-8f256b",
  "org.scalablytyped.slinky" %%% "apollographql__apollo-tools" % "0.4.4-17199f",
  "org.scalablytyped.slinky" %%% "apollographql__graphql-playground-html" % "1.6.24-c39e72",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-e2128c",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200226Z-196a23",
  "org.scalablytyped.slinky" %%% "content-disposition" % "0.5-dt-20200331Z-83c44d",
  "org.scalablytyped.slinky" %%% "cookies" % "0.7-dt-20191002Z-090613",
  "org.scalablytyped.slinky" %%% "eventemitter3" % "4.0.0-190910",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20200409Z-5ef924",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200415Z-f286fc",
  "org.scalablytyped.slinky" %%% "fs-capacitor" % "2.0-dt-20190509Z-fc1b61",
  "org.scalablytyped.slinky" %%% "graphql" % "14.6.0-444891",
  "org.scalablytyped.slinky" %%% "graphql-extensions" % "0.11.0-d39515",
  "org.scalablytyped.slinky" %%% "graphql-tools" % "4.0.7-e1d49f",
  "org.scalablytyped.slinky" %%% "graphql-upload" % "8.0-dt-20190826Z-314ebc",
  "org.scalablytyped.slinky" %%% "keygrip" % "1.0-dt-20191226Z-c1763d",
  "org.scalablytyped.slinky" %%% "koa" % "2.11.0-dt-20200327Z-24c1cd",
  "org.scalablytyped.slinky" %%% "long" % "4.0.0-dt-20200226Z-e43b6f",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20191126Z-46fc76",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20200225Z-632c59",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-3e2563",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20200227Z-16be36",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e",
  "org.scalablytyped.slinky" %%% "subscriptions-transport-ws" % "0.9.16-a40452",
  "org.scalablytyped.slinky" %%% "ws" % "7.2-dt-20200413Z-e5ad6b",
  "org.scalablytyped.slinky" %%% "zen-observable-ts" % "0.8.20-044a86")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
