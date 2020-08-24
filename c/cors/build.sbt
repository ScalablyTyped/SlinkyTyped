organization := "org.scalablytyped.slinky"
name := "cors"
version := "2.8-dt-20200515Z-31ced8"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-b686e3",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200515Z-46705a",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20200706Z-e24f67",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200722Z-f4d568",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20200722Z-cba958",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-df8c17",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20200519Z-7e078d",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-d7b143",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20200519Z-0a0205",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
