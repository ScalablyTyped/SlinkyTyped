organization := "org.scalablytyped.slinky"
name := "inert"
version := "5.1-dt-20201002Z-732f87"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "boom" % "7.3-dt-20200923Z-e4eec6",
  "org.scalablytyped.slinky" %%% "catbox" % "10.0-dt-20200515Z-47aea4",
  "org.scalablytyped.slinky" %%% "hapi" % "18.0-dt-20201028Z-843f0c",
  "org.scalablytyped.slinky" %%% "iron" % "5.0-dt-20200515Z-642e62",
  "org.scalablytyped.slinky" %%% "joi" % "17.3.0-876e70",
  "org.scalablytyped.slinky" %%% "mime-db" % "1.43-dt-20200424Z-ebf808",
  "org.scalablytyped.slinky" %%% "mimos" % "3.0-dt-20201002Z-07189b",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "podium" % "1.0-dt-20201002Z-38a912",
  "org.scalablytyped.slinky" %%% "shot" % "4.0-dt-20200515Z-7b1525",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
