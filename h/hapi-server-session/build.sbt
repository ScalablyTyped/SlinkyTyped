organization := "org.scalablytyped.slinky"
name := "hapi-server-session"
version := "5.1-dt-20200219Z-2f10bf"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "hapi__boom" % "9.1.0-cb6024",
  "org.scalablytyped.slinky" %%% "hapi__catbox" % "10.2-dt-20190521Z-63f228",
  "org.scalablytyped.slinky" %%% "hapi__hapi" % "19.0-dt-20200515Z-af82c7",
  "org.scalablytyped.slinky" %%% "hapi__iron" % "6.0.0-48f0ca",
  "org.scalablytyped.slinky" %%% "hapi__joi" % "17.1-dt-20200505Z-fc5d6b",
  "org.scalablytyped.slinky" %%% "hapi__mimos" % "4.1-dt-20200424Z-d72697",
  "org.scalablytyped.slinky" %%% "hapi__podium" % "3.4-dt-20200515Z-328c12",
  "org.scalablytyped.slinky" %%% "hapi__shot" % "4.1-dt-20190404Z-a5fc9f",
  "org.scalablytyped.slinky" %%% "mime-db" % "1.43-dt-20200424Z-0a8c94",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
