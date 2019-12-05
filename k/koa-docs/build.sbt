organization := "org.scalablytyped.slinky"
name := "koa-docs"
version := "2.1-dt-20191104Z-d355ac"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "accepts" % "1.3-dt-20180214Z-979fa2",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.17-dt-20190819Z-0fbf69",
  "org.scalablytyped.slinky" %%% "co-body" % "0.0-unknown-dt-20190322Z-81e31e",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20190322Z-7f9ff6",
  "org.scalablytyped.slinky" %%% "cookies" % "0.7-dt-20191002Z-8a192c",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20191101Z-99b8ef",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20191115Z-6e0a7c",
  "org.scalablytyped.slinky" %%% "joi" % "14.3-dt-20191101Z-bdcee5",
  "org.scalablytyped.slinky" %%% "keygrip" % "1.0-dt-20180214Z-30570a",
  "org.scalablytyped.slinky" %%% "koa" % "2.11.0-dt-20191127Z-c2dda2",
  "org.scalablytyped.slinky" %%% "koa-joi-router" % "5.2-dt-20191107Z-e31cf0",
  "org.scalablytyped.slinky" %%% "koa-router" % "v7.x-dt-20191016Z-22408b",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20191126Z-568141",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20191107Z-a83036",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-aa5088",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20190819Z-98e334",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        