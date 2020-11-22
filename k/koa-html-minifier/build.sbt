organization := "org.scalablytyped.slinky"
name := "koa-html-minifier"
version := "1.0-dt-20180823Z-154691"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "accepts" % "1.3-dt-20200515Z-445119",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-288ac7",
  "org.scalablytyped.slinky" %%% "clean-css" % "4.2-dt-20201002Z-1786bb",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20201002Z-8c61d7",
  "org.scalablytyped.slinky" %%% "content-disposition" % "0.5-dt-20200515Z-8dac25",
  "org.scalablytyped.slinky" %%% "cookies" % "0.7-dt-20201028Z-e9bf56",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20201111Z-3019f6",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200921Z-5d68bc",
  "org.scalablytyped.slinky" %%% "html-minifier" % "4.0-dt-20201002Z-948437",
  "org.scalablytyped.slinky" %%% "keygrip" % "1.0-dt-20200515Z-f5a3b4",
  "org.scalablytyped.slinky" %%% "koa" % "2.11.0-dt-20201020Z-303a46",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20200722Z-6314e7",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20201002Z-ff6847",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20201002Z-f6189b",
  "org.scalablytyped.slinky" %%% "relateurl" % "v0.2.6-dt-20201002Z-2b18ca",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20201117Z-ffbd1b",
  "org.scalablytyped.slinky" %%% "source-map" % "0.7.3-07892e",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533",
  "org.scalablytyped.slinky" %%% "uglify-js" % "3.11-dt-20201027Z-116148")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
