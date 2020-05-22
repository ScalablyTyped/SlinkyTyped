organization := "org.scalablytyped.slinky"
name := "apollo-server"
version := "2.13.1-84425c"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "accepts" % "1.3-dt-20200515Z-0c9e7d",
  "org.scalablytyped.slinky" %%% "apollo-cache-control" % "0.10.1-alpha.0-55943b",
  "org.scalablytyped.slinky" %%% "apollo-datasource" % "0.7.1-alpha.0-4599af",
  "org.scalablytyped.slinky" %%% "apollo-engine-reporting" % "1.8.1-alpha.0-a443d0",
  "org.scalablytyped.slinky" %%% "apollo-engine-reporting-protobuf" % "0.5.1-alpha.1-0f9eef",
  "org.scalablytyped.slinky" %%% "apollo-link" % "1.2.13-f31c99",
  "org.scalablytyped.slinky" %%% "apollo-server-caching" % "0.5.1-95fbe2",
  "org.scalablytyped.slinky" %%% "apollo-server-core" % "2.13.1-d8b8c1",
  "org.scalablytyped.slinky" %%% "apollo-server-env" % "2.4.4-alpha.0-39c1fb",
  "org.scalablytyped.slinky" %%% "apollo-server-errors" % "2.4.1-ed49ba",
  "org.scalablytyped.slinky" %%% "apollo-server-express" % "2.13.1-0fa4b9",
  "org.scalablytyped.slinky" %%% "apollo-server-plugin-base" % "0.8.1-alpha.0-c3d103",
  "org.scalablytyped.slinky" %%% "apollo-server-types" % "0.4.1-alpha.0-d79ed0",
  "org.scalablytyped.slinky" %%% "apollo__protobufjs" % "1.0.3-d4c0fa",
  "org.scalablytyped.slinky" %%% "apollographql__apollo-tools" % "0.4.8-5baa6e",
  "org.scalablytyped.slinky" %%% "apollographql__graphql-playground-html" % "1.6.24-a3a1c0",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-3172ef",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200515Z-49be3e",
  "org.scalablytyped.slinky" %%% "content-disposition" % "0.5-dt-20200515Z-66a37c",
  "org.scalablytyped.slinky" %%% "cookies" % "0.7-dt-20191002Z-7cfb2f",
  "org.scalablytyped.slinky" %%% "cors" % "2.8-dt-20200515Z-f53092",
  "org.scalablytyped.slinky" %%% "eventemitter3" % "4.0.4-7a8486",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20200515Z-35525e",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200515Z-f4fc10",
  "org.scalablytyped.slinky" %%% "fs-capacitor" % "2.0-dt-20190509Z-ba66ea",
  "org.scalablytyped.slinky" %%% "graphql" % "14.6.0-19956e",
  "org.scalablytyped.slinky" %%% "graphql-extensions" % "0.12.1-alpha.0-1a24a2",
  "org.scalablytyped.slinky" %%% "graphql-subscriptions" % "1.1.0-080fa3",
  "org.scalablytyped.slinky" %%% "graphql-tools" % "4.0.8-8ca15c",
  "org.scalablytyped.slinky" %%% "graphql-upload" % "8.0-dt-20190826Z-3a0d23",
  "org.scalablytyped.slinky" %%% "keygrip" % "1.0-dt-20200515Z-83b29b",
  "org.scalablytyped.slinky" %%% "koa" % "2.11.0-dt-20200515Z-aa680a",
  "org.scalablytyped.slinky" %%% "long" % "4.0.0-dt-20200515Z-ced51c",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20200515Z-2900a9",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20200519Z-8e6135",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-0a4f98",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20200519Z-85de9b",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0",
  "org.scalablytyped.slinky" %%% "subscriptions-transport-ws" % "0.9.16-abed32",
  "org.scalablytyped.slinky" %%% "ws" % "7.2-dt-20200413Z-4b6676",
  "org.scalablytyped.slinky" %%% "zen-observable-ts" % "0.8.20-ba96e6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
