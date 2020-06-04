organization := "org.scalablytyped.slinky"
name := "express"
version := "4.17-dt-20200515Z-45eb8c"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-63ecf4",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200515Z-f1cd02",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200515Z-b11459",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20200515Z-9341f6",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-1736f1",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20200519Z-fc35ca",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-866118",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20200519Z-1335a6",
  "org.scalablytyped.slinky" %%% "std" % "3.9-ad7699")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
