organization := "org.scalablytyped.slinky"
name := "hapi__h2o2"
version := "8.3-dt-20200515Z-b23089"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "hapi__boom" % "9.1.0-d06251",
  "org.scalablytyped.slinky" %%% "hapi__catbox" % "10.2-dt-20190521Z-c3f13d",
  "org.scalablytyped.slinky" %%% "hapi__hapi" % "19.0-dt-20200722Z-4ad2a3",
  "org.scalablytyped.slinky" %%% "hapi__iron" % "6.0.0-1ce8e4",
  "org.scalablytyped.slinky" %%% "hapi__joi" % "17.1-dt-20200710Z-59c6a1",
  "org.scalablytyped.slinky" %%% "hapi__mimos" % "4.1-dt-20200424Z-7dc6c5",
  "org.scalablytyped.slinky" %%% "hapi__podium" % "3.4-dt-20200515Z-1541cc",
  "org.scalablytyped.slinky" %%% "hapi__shot" % "4.1-dt-20190404Z-96e427",
  "org.scalablytyped.slinky" %%% "mime-db" % "1.43-dt-20200424Z-0b33f9",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-df8c17",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
