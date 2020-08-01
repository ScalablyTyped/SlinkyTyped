organization := "org.scalablytyped.slinky"
name := "express"
version := "4.17-dt-20200706Z-5330cf"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-cca01b",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200515Z-b8e0a2",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200722Z-a0c09d",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20200722Z-699d00",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-51ed10",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20200519Z-ad8cdd",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-c86e67",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20200519Z-96d9f6",
  "org.scalablytyped.slinky" %%% "std" % "3.9-25efe0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
