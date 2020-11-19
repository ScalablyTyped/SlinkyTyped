organization := "org.scalablytyped.slinky"
name := "optics-agent"
version := "1.1-dt-20200515Z-e04a76"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "accepts" % "1.3-dt-20200515Z-a883a7",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-e4419c",
  "org.scalablytyped.slinky" %%% "boom" % "7.3-dt-20200515Z-0097ad",
  "org.scalablytyped.slinky" %%% "catbox" % "10.0-dt-20200515Z-b076ab",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200515Z-41abee",
  "org.scalablytyped.slinky" %%% "content-disposition" % "0.5-dt-20200515Z-8dac25",
  "org.scalablytyped.slinky" %%% "cookies" % "0.7-dt-20191002Z-0a7a1c",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20200706Z-a5f9b2",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200722Z-5cbccc",
  "org.scalablytyped.slinky" %%% "graphql" % "15.3.0-09ebdf",
  "org.scalablytyped.slinky" %%% "hapi" % "18.0-dt-20200721Z-6303f1",
  "org.scalablytyped.slinky" %%% "iron" % "5.0-dt-20200515Z-8267c1",
  "org.scalablytyped.slinky" %%% "joi" % "14.3-dt-20200515Z-7e47dd",
  "org.scalablytyped.slinky" %%% "keygrip" % "1.0-dt-20200515Z-f3092a",
  "org.scalablytyped.slinky" %%% "koa" % "2.11.0-dt-20200515Z-64d711",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20200722Z-600803",
  "org.scalablytyped.slinky" %%% "mime-db" % "1.43-dt-20200424Z-f64a1e",
  "org.scalablytyped.slinky" %%% "mimos" % "3.0-dt-20200515Z-7f1d66",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "podium" % "1.0-dt-20200515Z-f38265",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20200519Z-524837",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-18f701",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20200519Z-04f03f",
  "org.scalablytyped.slinky" %%% "shot" % "4.0-dt-20200515Z-fdb566",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
