organization := "org.scalablytyped.slinky"
name := "optics-agent"
version := "1.1-dt-20190826Z-c2379a"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "accepts" % "1.3-dt-20180214Z-d3b8d6",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-ed4596",
  "org.scalablytyped.slinky" %%% "boom" % "7.3-dt-20200226Z-402496",
  "org.scalablytyped.slinky" %%% "catbox" % "10.0-dt-20190219Z-9090b1",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200226Z-b2d5a0",
  "org.scalablytyped.slinky" %%% "cookies" % "0.7-dt-20191002Z-1c6d79",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20200227Z-17932f",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200225Z-62466e",
  "org.scalablytyped.slinky" %%% "graphql" % "14.6.0-1eff51",
  "org.scalablytyped.slinky" %%% "hapi" % "18.0-dt-20200227Z-306452",
  "org.scalablytyped.slinky" %%% "iron" % "5.0-dt-20180214Z-7f7c73",
  "org.scalablytyped.slinky" %%% "joi" % "14.3-dt-20200227Z-58a37b",
  "org.scalablytyped.slinky" %%% "keygrip" % "1.0-dt-20191226Z-ff3b21",
  "org.scalablytyped.slinky" %%% "koa" % "2.11.0-dt-20200226Z-5b5415",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20191126Z-e728ff",
  "org.scalablytyped.slinky" %%% "mime-db" % "1.27-dt-20190322Z-1463d3",
  "org.scalablytyped.slinky" %%% "mimos" % "3.0-dt-20200225Z-296775",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "podium" % "1.0-dt-20200225Z-6b4f0e",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-6f090d",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20200227Z-3c94e9",
  "org.scalablytyped.slinky" %%% "shot" % "4.0-dt-20181002Z-34c89c",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
