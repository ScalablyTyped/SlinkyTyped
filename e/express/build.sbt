organization := "org.scalablytyped.slinky"
name := "express"
version := "4.17-dt-20200515Z-0af7c2"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-19ad37",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200515Z-01f9e7",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200515Z-d4e283",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20200515Z-0a6c67",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200609Z-6ee82c",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20200519Z-fbb70e",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-3dcf14",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20200519Z-49fe75",
  "org.scalablytyped.slinky" %%% "std" % "3.9-dec240")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
