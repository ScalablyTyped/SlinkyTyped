organization := "org.scalablytyped.slinky"
name := "apollo-server-core"
version := "2.11.0-99a131"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "accepts" % "1.3-dt-20180214Z-c9a3c6",
  "org.scalablytyped.slinky" %%% "apollo-cache-control" % "0.9.0-c8b41e",
  "org.scalablytyped.slinky" %%% "apollo-datasource" % "0.7.0-d63aa5",
  "org.scalablytyped.slinky" %%% "apollo-engine-reporting" % "1.7.0-638b12",
  "org.scalablytyped.slinky" %%% "apollo-engine-reporting-protobuf" % "0.4.4-eaf7d8",
  "org.scalablytyped.slinky" %%% "apollo-link" % "1.2.13-b167c5",
  "org.scalablytyped.slinky" %%% "apollo-server-caching" % "0.5.1-55a6c4",
  "org.scalablytyped.slinky" %%% "apollo-server-env" % "2.4.3-d10ad3",
  "org.scalablytyped.slinky" %%% "apollo-server-errors" % "2.4.0-509ef0",
  "org.scalablytyped.slinky" %%% "apollo-server-plugin-base" % "0.7.0-5e1e69",
  "org.scalablytyped.slinky" %%% "apollo-server-types" % "0.3.0-000103",
  "org.scalablytyped.slinky" %%% "apollo__protobufjs" % "1.0.3-618529",
  "org.scalablytyped.slinky" %%% "apollographql__apollo-tools" % "0.4.4-8c122c",
  "org.scalablytyped.slinky" %%% "apollographql__graphql-playground-html" % "1.6.24-7b7d38",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-ef676c",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200226Z-fe7436",
  "org.scalablytyped.slinky" %%% "content-disposition" % "0.5-dt-20200331Z-9e7955",
  "org.scalablytyped.slinky" %%% "cookies" % "0.7-dt-20191002Z-12c299",
  "org.scalablytyped.slinky" %%% "eventemitter3" % "4.0.0-abb1c1",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20200409Z-223215",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200415Z-cfdf0c",
  "org.scalablytyped.slinky" %%% "fs-capacitor" % "2.0-dt-20190509Z-9d20a0",
  "org.scalablytyped.slinky" %%% "graphql" % "14.6.0-5be153",
  "org.scalablytyped.slinky" %%% "graphql-extensions" % "0.11.0-7c8205",
  "org.scalablytyped.slinky" %%% "graphql-tools" % "4.0.7-8edc2c",
  "org.scalablytyped.slinky" %%% "graphql-upload" % "8.0-dt-20190826Z-afb6ed",
  "org.scalablytyped.slinky" %%% "keygrip" % "1.0-dt-20191226Z-6b91f5",
  "org.scalablytyped.slinky" %%% "koa" % "2.11.0-dt-20200327Z-8ac877",
  "org.scalablytyped.slinky" %%% "long" % "4.0.0-dt-20200226Z-da0575",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20191126Z-d94a1a",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20200225Z-413bcb",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-34f923",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20200227Z-51c95d",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "subscriptions-transport-ws" % "0.9.16-989611",
  "org.scalablytyped.slinky" %%% "ws" % "7.2-dt-20200413Z-ae451a",
  "org.scalablytyped.slinky" %%% "zen-observable-ts" % "0.8.20-4f9a1b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
