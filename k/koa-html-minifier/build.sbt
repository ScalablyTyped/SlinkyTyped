organization := "org.scalablytyped.slinky"
name := "koa-html-minifier"
version := "1.0-dt-20180823Z-1da240"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "accepts" % "1.3-dt-20180214Z-d3b8d6",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-ed4596",
  "org.scalablytyped.slinky" %%% "clean-css" % "4.2-dt-20200226Z-66a3be",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200226Z-b2d5a0",
  "org.scalablytyped.slinky" %%% "cookies" % "0.7-dt-20191002Z-1c6d79",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20200227Z-17932f",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200225Z-62466e",
  "org.scalablytyped.slinky" %%% "html-minifier" % "3.5-dt-20200226Z-3d6724",
  "org.scalablytyped.slinky" %%% "keygrip" % "1.0-dt-20191226Z-ff3b21",
  "org.scalablytyped.slinky" %%% "koa" % "2.11.0-dt-20200226Z-5b5415",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20191126Z-e728ff",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-6f090d",
  "org.scalablytyped.slinky" %%% "relateurl" % "v0.2.6-dt-20200227Z-dc54c5",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20200227Z-3c94e9",
  "org.scalablytyped.slinky" %%% "source-map" % "0.7.3-63359b",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "uglify-js" % "3.0-dt-20200225Z-ae4d9a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
