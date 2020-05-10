organization := "org.scalablytyped.slinky"
name := "hapi-pino"
version := "8.0-dt-20200426Z-5828f0"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "hapi__boom" % "9.1.0-83f636",
  "org.scalablytyped.slinky" %%% "hapi__catbox" % "10.2-dt-20190521Z-7fcae0",
  "org.scalablytyped.slinky" %%% "hapi__hapi" % "19.0-dt-20200427Z-620616",
  "org.scalablytyped.slinky" %%% "hapi__iron" % "6.0.0-30f60b",
  "org.scalablytyped.slinky" %%% "hapi__joi" % "16.0-dt-20200225Z-2ba646",
  "org.scalablytyped.slinky" %%% "hapi__mimos" % "4.1-dt-20200424Z-4512cb",
  "org.scalablytyped.slinky" %%% "hapi__podium" % "3.4-dt-20200225Z-2fde04",
  "org.scalablytyped.slinky" %%% "hapi__shot" % "4.1-dt-20190404Z-582203",
  "org.scalablytyped.slinky" %%% "mime-db" % "1.43-dt-20200424Z-565e34",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "pino" % "6.0-dt-20200413Z-99dc8a",
  "org.scalablytyped.slinky" %%% "pino-std-serializers" % "2.4-dt-20200426Z-6cc201",
  "org.scalablytyped.slinky" %%% "sonic-boom" % "0.7-dt-20190819Z-6b9f44",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
