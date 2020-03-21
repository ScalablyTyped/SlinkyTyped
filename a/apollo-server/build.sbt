organization := "org.scalablytyped.slinky"
name := "apollo-server"
version := "2.10.1-9249aa"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "accepts" % "1.3-dt-20180214Z-d3b8d6",
  "org.scalablytyped.slinky" %%% "apollo-cache-control" % "0.8.11-daa466",
  "org.scalablytyped.slinky" %%% "apollo-datasource" % "0.7.0-2ac65b",
  "org.scalablytyped.slinky" %%% "apollo-engine-reporting" % "1.6.0-130997",
  "org.scalablytyped.slinky" %%% "apollo-engine-reporting-protobuf" % "0.4.4-29c49b",
  "org.scalablytyped.slinky" %%% "apollo-link" % "1.2.13-364afd",
  "org.scalablytyped.slinky" %%% "apollo-server-caching" % "0.5.1-f13506",
  "org.scalablytyped.slinky" %%% "apollo-server-core" % "2.10.1-dd1c3d",
  "org.scalablytyped.slinky" %%% "apollo-server-env" % "2.4.3-d1315a",
  "org.scalablytyped.slinky" %%% "apollo-server-errors" % "2.3.4-cc5507",
  "org.scalablytyped.slinky" %%% "apollo-server-express" % "2.10.1-191c57",
  "org.scalablytyped.slinky" %%% "apollo-server-plugin-base" % "0.6.10-cf2ad2",
  "org.scalablytyped.slinky" %%% "apollo-server-types" % "0.2.10-728ee4",
  "org.scalablytyped.slinky" %%% "apollo__protobufjs" % "1.0.3-ac7503",
  "org.scalablytyped.slinky" %%% "apollographql__apollo-tools" % "0.4.3-164dcc",
  "org.scalablytyped.slinky" %%% "apollographql__graphql-playground-html" % "1.6.24-1a68a3",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-ed4596",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200226Z-b2d5a0",
  "org.scalablytyped.slinky" %%% "cookies" % "0.7-dt-20191002Z-1c6d79",
  "org.scalablytyped.slinky" %%% "cors" % "2.8-dt-20200225Z-ee9ab7",
  "org.scalablytyped.slinky" %%% "eventemitter3" % "4.0.0-130343",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20200227Z-17932f",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200225Z-62466e",
  "org.scalablytyped.slinky" %%% "fs-capacitor" % "2.0-dt-20190509Z-f82733",
  "org.scalablytyped.slinky" %%% "graphql" % "14.6.0-1eff51",
  "org.scalablytyped.slinky" %%% "graphql-extensions" % "0.10.10-324c04",
  "org.scalablytyped.slinky" %%% "graphql-subscriptions" % "1.1.0-44f410",
  "org.scalablytyped.slinky" %%% "graphql-tools" % "4.0.6-e9e202",
  "org.scalablytyped.slinky" %%% "graphql-upload" % "8.0-dt-20190826Z-f03ec6",
  "org.scalablytyped.slinky" %%% "keygrip" % "1.0-dt-20191226Z-ff3b21",
  "org.scalablytyped.slinky" %%% "koa" % "2.11.0-dt-20200226Z-5b5415",
  "org.scalablytyped.slinky" %%% "long" % "4.0.0-dt-20200226Z-1ae2d8",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20191126Z-e728ff",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-6f090d",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20200227Z-3c94e9",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "subscriptions-transport-ws" % "0.9.16-9cd91f",
  "org.scalablytyped.slinky" %%% "ws" % "7.2-dt-20200227Z-1a4b01",
  "org.scalablytyped.slinky" %%% "zen-observable-ts" % "0.8.20-69885a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
