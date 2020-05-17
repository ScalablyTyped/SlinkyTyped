organization := "org.scalablytyped.slinky"
name := "koa-proxy"
version := "1.0-dt-20191022Z-2b44ce"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "accepts" % "1.3-dt-20180214Z-c9a3c6",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-ef676c",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200226Z-fe7436",
  "org.scalablytyped.slinky" %%% "content-disposition" % "0.5-dt-20200331Z-9e7955",
  "org.scalablytyped.slinky" %%% "cookies" % "0.7-dt-20191002Z-12c299",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20200409Z-223215",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200415Z-cfdf0c",
  "org.scalablytyped.slinky" %%% "keygrip" % "1.0-dt-20191226Z-6b91f5",
  "org.scalablytyped.slinky" %%% "koa" % "2.11.0-dt-20200327Z-8ac877",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20191126Z-d94a1a",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20200225Z-413bcb",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-34f923",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20200227Z-51c95d",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
