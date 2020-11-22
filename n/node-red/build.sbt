organization := "org.scalablytyped.slinky"
name := "node-red"
version := "1.1-dt-20200925Z-cf9734"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "ace" % "0.0-unknown-dt-20201013Z-8a601a",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-288ac7",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20201002Z-8c61d7",
  "org.scalablytyped.slinky" %%% "cors" % "2.8-dt-20201010Z-636418",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20201111Z-3019f6",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200921Z-5d68bc",
  "org.scalablytyped.slinky" %%% "jquery" % "3.5-dt-20201028Z-467d08",
  "org.scalablytyped.slinky" %%% "jsonata" % "1.8.4-a0d8c5",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20200722Z-6314e7",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "node-red__editor-api" % "1.1-dt-20200925Z-a4c7b4",
  "org.scalablytyped.slinky" %%% "node-red__editor-client" % "1.1-dt-20201028Z-9e7987",
  "org.scalablytyped.slinky" %%% "node-red__registry" % "1.1-dt-20200925Z-659b38",
  "org.scalablytyped.slinky" %%% "node-red__runtime" % "1.1-dt-20201028Z-b0f61c",
  "org.scalablytyped.slinky" %%% "node-red__util" % "1.1-dt-20200925Z-17c641",
  "org.scalablytyped.slinky" %%% "passport" % "1.0-dt-20201112Z-b42549",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20201002Z-ff6847",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20201002Z-f6189b",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20201117Z-ffbd1b",
  "org.scalablytyped.slinky" %%% "sizzle" % "2.3-dt-20201002Z-017d7b",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
