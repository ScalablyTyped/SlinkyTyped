organization := "org.scalablytyped.slinky"
name := "fluentui__react-focus"
version := "7.12.26-78e706"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "cheerio" % "v0.22.0-dt-20200708Z-510163",
  "org.scalablytyped.slinky" %%% "csstype" % "3.0.2-fce754",
  "org.scalablytyped.slinky" %%% "enzyme" % "3.10-dt-20200515Z-d1a3fc",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ce652f",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200711Z-6a9854",
  "org.scalablytyped.slinky" %%% "react-test-renderer" % "16.9-dt-20200515Z-23ef70",
  "org.scalablytyped.slinky" %%% "sinon" % "9.0-dt-20200521Z-7fec13",
  "org.scalablytyped.slinky" %%% "sinonjs__fake-timers" % "6.0-dt-20200331Z-9876d6",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "uifabric__merge-styles" % "7.16.3-59154b",
  "org.scalablytyped.slinky" %%% "uifabric__utilities" % "7.24.6-1523fa")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
