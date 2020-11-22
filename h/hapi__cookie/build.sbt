organization := "org.scalablytyped.slinky"
name := "hapi__cookie"
version := "10.1-dt-20200925Z-bc3969"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "hapi__boom" % "9.1.0-1d0df7",
  "org.scalablytyped.slinky" %%% "hapi__catbox" % "10.2-dt-20200925Z-ddb60e",
  "org.scalablytyped.slinky" %%% "hapi__hapi" % "20.0-dt-20201028Z-f587ef",
  "org.scalablytyped.slinky" %%% "hapi__iron" % "6.0.0-869055",
  "org.scalablytyped.slinky" %%% "hapi__mimos" % "4.1-dt-20200925Z-916e85",
  "org.scalablytyped.slinky" %%% "hapi__podium" % "3.4-dt-20201002Z-be0948",
  "org.scalablytyped.slinky" %%% "hapi__shot" % "4.1-dt-20200925Z-4ad776",
  "org.scalablytyped.slinky" %%% "joi" % "17.3.0-11fb7b",
  "org.scalablytyped.slinky" %%% "mime-db" % "1.43-dt-20200424Z-3991b7",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
