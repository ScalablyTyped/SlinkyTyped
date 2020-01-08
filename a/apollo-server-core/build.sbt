organization := "org.scalablytyped.slinky"
name := "apollo-server-core"
version := "2.9.15-9f00ad"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "accepts" % "1.3-dt-20180214Z-11030c",
  "org.scalablytyped.slinky" %%% "apollo-cache-control" % "0.8.10-af6b3d",
  "org.scalablytyped.slinky" %%% "apollo-datasource" % "0.6.4-c83858",
  "org.scalablytyped.slinky" %%% "apollo-engine-reporting" % "1.4.13-de9f2b",
  "org.scalablytyped.slinky" %%% "apollo-engine-reporting-protobuf" % "0.4.4-85454d",
  "org.scalablytyped.slinky" %%% "apollo-link" % "1.2.13-c98446",
  "org.scalablytyped.slinky" %%% "apollo-server-caching" % "0.5.1-7d290c",
  "org.scalablytyped.slinky" %%% "apollo-server-env" % "2.4.3-27d21d",
  "org.scalablytyped.slinky" %%% "apollo-server-errors" % "2.3.4-0f8c95",
  "org.scalablytyped.slinky" %%% "apollo-server-plugin-base" % "0.6.10-fea6ed",
  "org.scalablytyped.slinky" %%% "apollo-server-types" % "0.2.10-923fdb",
  "org.scalablytyped.slinky" %%% "apollo__protobufjs" % "1.0.3-3a3788",
  "org.scalablytyped.slinky" %%% "apollographql__apollo-tools" % "0.4.2-1fa2ac",
  "org.scalablytyped.slinky" %%% "apollographql__graphql-playground-html" % "1.6.24-072733",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.17-dt-20190819Z-ee62c5",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20191217Z-4825ba",
  "org.scalablytyped.slinky" %%% "cookies" % "0.7-dt-20191002Z-74c9cf",
  "org.scalablytyped.slinky" %%% "eventemitter3" % "4.0.0-b51520",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20191101Z-1aa7b6",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20191220Z-040290",
  "org.scalablytyped.slinky" %%% "fs-capacitor" % "2.0-dt-20190509Z-29c82f",
  "org.scalablytyped.slinky" %%% "graphql" % "14.5.8-ffbf48",
  "org.scalablytyped.slinky" %%% "graphql-extensions" % "0.10.9-7d49f7",
  "org.scalablytyped.slinky" %%% "graphql-tools" % "4.0.6-54ebca",
  "org.scalablytyped.slinky" %%% "graphql-upload" % "8.0-dt-20190826Z-60048f",
  "org.scalablytyped.slinky" %%% "keygrip" % "1.0-dt-20191226Z-e8b4e9",
  "org.scalablytyped.slinky" %%% "koa" % "2.11.0-dt-20191127Z-f75589",
  "org.scalablytyped.slinky" %%% "long" % "4.0.0-dt-20190322Z-386ebc",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20191126Z-0f6108",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-e91b01",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20190819Z-2c1738",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43",
  "org.scalablytyped.slinky" %%% "subscriptions-transport-ws" % "0.9.16-ad1fe7",
  "org.scalablytyped.slinky" %%% "ws" % "6.0-dt-20191125Z-3ee039",
  "org.scalablytyped.slinky" %%% "zen-observable-ts" % "0.8.20-28d607")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        