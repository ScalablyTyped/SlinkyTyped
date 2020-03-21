organization := "org.scalablytyped.slinky"
name := "hapi__vision"
version := "5.5-dt-20190819Z-d9685f"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "hapi__boom" % "9.0.0-a728db",
  "org.scalablytyped.slinky" %%% "hapi__catbox" % "10.2-dt-20190521Z-917f70",
  "org.scalablytyped.slinky" %%% "hapi__hapi" % "19.0-dt-20200227Z-cd2fe1",
  "org.scalablytyped.slinky" %%% "hapi__iron" % "6.0.0-aeff2c",
  "org.scalablytyped.slinky" %%% "hapi__joi" % "16.0-dt-20200225Z-dcd8bf",
  "org.scalablytyped.slinky" %%% "hapi__mimos" % "4.1-dt-20200225Z-823d8b",
  "org.scalablytyped.slinky" %%% "hapi__podium" % "3.4-dt-20200225Z-ee980a",
  "org.scalablytyped.slinky" %%% "hapi__shot" % "4.1-dt-20190404Z-f135a3",
  "org.scalablytyped.slinky" %%% "mime-db" % "1.27-dt-20190322Z-1463d3",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
