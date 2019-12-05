organization := "org.scalablytyped.slinky"
name := "apollo-server"
version := "2.9.12-915ba4"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "accepts" % "1.3-dt-20180214Z-979fa2",
  "org.scalablytyped.slinky" %%% "apollo-cache-control" % "0.8.8-918309",
  "org.scalablytyped.slinky" %%% "apollo-datasource" % "0.6.3-4a3c1e",
  "org.scalablytyped.slinky" %%% "apollo-engine-reporting" % "1.4.10-49f943",
  "org.scalablytyped.slinky" %%% "apollo-engine-reporting-protobuf" % "0.4.4-f4cfc5",
  "org.scalablytyped.slinky" %%% "apollo-link" % "1.2.13-c0afa5",
  "org.scalablytyped.slinky" %%% "apollo-server-caching" % "0.5.0-e46db5",
  "org.scalablytyped.slinky" %%% "apollo-server-core" % "2.9.12-06669c",
  "org.scalablytyped.slinky" %%% "apollo-server-env" % "2.4.3-c26879",
  "org.scalablytyped.slinky" %%% "apollo-server-errors" % "2.3.4-d3020f",
  "org.scalablytyped.slinky" %%% "apollo-server-express" % "2.9.12-d84040",
  "org.scalablytyped.slinky" %%% "apollo-server-plugin-base" % "0.6.8-d63451",
  "org.scalablytyped.slinky" %%% "apollo-server-types" % "0.2.8-46fa41",
  "org.scalablytyped.slinky" %%% "apollo__protobufjs" % "1.0.3-9b8b84",
  "org.scalablytyped.slinky" %%% "apollographql__apollo-tools" % "0.4.1-738b69",
  "org.scalablytyped.slinky" %%% "apollographql__graphql-playground-html" % "1.6.24-e37402",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.17-dt-20190819Z-0fbf69",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20190322Z-7f9ff6",
  "org.scalablytyped.slinky" %%% "cookies" % "0.7-dt-20191002Z-8a192c",
  "org.scalablytyped.slinky" %%% "cors" % "2.8-dt-20190819Z-ff9afb",
  "org.scalablytyped.slinky" %%% "eventemitter3" % "4.0.0-c10e8e",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20191101Z-99b8ef",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20191115Z-6e0a7c",
  "org.scalablytyped.slinky" %%% "fs-capacitor" % "2.0-dt-20190509Z-4389d2",
  "org.scalablytyped.slinky" %%% "graphql" % "14.5.8-a854ac",
  "org.scalablytyped.slinky" %%% "graphql-extensions" % "0.10.7-ae7db8",
  "org.scalablytyped.slinky" %%% "graphql-subscriptions" % "1.1.0-60a5f3",
  "org.scalablytyped.slinky" %%% "graphql-tools" % "4.0.6-acbc3a",
  "org.scalablytyped.slinky" %%% "graphql-upload" % "8.0-dt-20190826Z-e3c049",
  "org.scalablytyped.slinky" %%% "keygrip" % "1.0-dt-20180214Z-30570a",
  "org.scalablytyped.slinky" %%% "koa" % "2.11.0-dt-20191127Z-c2dda2",
  "org.scalablytyped.slinky" %%% "long" % "4.0.0-dt-20190322Z-ac0727",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20191126Z-568141",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-aa5088",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20190819Z-98e334",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821",
  "org.scalablytyped.slinky" %%% "subscriptions-transport-ws" % "0.9.16-25e9ac",
  "org.scalablytyped.slinky" %%% "ws" % "6.0-dt-20191125Z-5dacb9",
  "org.scalablytyped.slinky" %%% "zen-observable-ts" % "0.8.20-9b9238")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        