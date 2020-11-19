organization := "org.scalablytyped.slinky"
name := "hapi__yar"
version := "9.2-dt-20190425Z-8e16a7"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "hapi__boom" % "9.1.0-758312",
  "org.scalablytyped.slinky" %%% "hapi__catbox" % "10.2-dt-20190521Z-295fd8",
  "org.scalablytyped.slinky" %%% "hapi__hapi" % "19.0-dt-20200722Z-a49bfa",
  "org.scalablytyped.slinky" %%% "hapi__iron" % "6.0.0-de150e",
  "org.scalablytyped.slinky" %%% "hapi__joi" % "17.1-dt-20200710Z-32b2ec",
  "org.scalablytyped.slinky" %%% "hapi__mimos" % "4.1-dt-20200424Z-14f7b0",
  "org.scalablytyped.slinky" %%% "hapi__podium" % "3.4-dt-20200515Z-406789",
  "org.scalablytyped.slinky" %%% "hapi__shot" % "4.1-dt-20190404Z-47ef55",
  "org.scalablytyped.slinky" %%% "mime-db" % "1.43-dt-20200424Z-f64a1e",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
