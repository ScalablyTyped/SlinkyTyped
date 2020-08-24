organization := "org.scalablytyped.slinky"
name := "inert"
version := "5.1-dt-20200515Z-1cd2d3"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "boom" % "7.3-dt-20200515Z-5e1790",
  "org.scalablytyped.slinky" %%% "catbox" % "10.0-dt-20200515Z-b3bbee",
  "org.scalablytyped.slinky" %%% "hapi" % "18.0-dt-20200721Z-3e84d1",
  "org.scalablytyped.slinky" %%% "iron" % "5.0-dt-20200515Z-2445af",
  "org.scalablytyped.slinky" %%% "joi" % "14.3-dt-20200515Z-c70c1b",
  "org.scalablytyped.slinky" %%% "mime-db" % "1.43-dt-20200424Z-0b33f9",
  "org.scalablytyped.slinky" %%% "mimos" % "3.0-dt-20200515Z-6c0184",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-df8c17",
  "org.scalablytyped.slinky" %%% "podium" % "1.0-dt-20200515Z-ba41fb",
  "org.scalablytyped.slinky" %%% "shot" % "4.0-dt-20200515Z-fc564d",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
