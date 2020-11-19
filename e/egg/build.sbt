organization := "org.scalablytyped.slinky"
name := "egg"
version := "2.27.0-a07d98"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "accepts" % "1.3-dt-20200515Z-a883a7",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-e4419c",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200515Z-41abee",
  "org.scalablytyped.slinky" %%% "content-disposition" % "0.5-dt-20200515Z-8dac25",
  "org.scalablytyped.slinky" %%% "cookies" % "0.7-dt-20191002Z-0a7a1c",
  "org.scalablytyped.slinky" %%% "depd" % "1.1-dt-20200515Z-c4608e",
  "org.scalablytyped.slinky" %%% "egg-cookies" % "2.4.2-9b5a31",
  "org.scalablytyped.slinky" %%% "egg-core" % "4.17.4-ada4b4",
  "org.scalablytyped.slinky" %%% "egg-logger" % "2.4.2-cf28d1",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20200706Z-a5f9b2",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200722Z-5cbccc",
  "org.scalablytyped.slinky" %%% "keygrip" % "1.0-dt-20200515Z-f3092a",
  "org.scalablytyped.slinky" %%% "koa" % "2.11.0-dt-20200515Z-64d711",
  "org.scalablytyped.slinky" %%% "koa-router" % "7.4-dt-20200515Z-544feb",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20200722Z-600803",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20200519Z-524837",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-18f701",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20200519Z-04f03f",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "urllib" % "2.36.1-69b46a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
