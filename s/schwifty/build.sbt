organization := "org.scalablytyped.slinky"
name := "schwifty"
version := "4.0-dt-20191105Z-414971"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "ajv" % "6.11.0-7a0f9a",
  "org.scalablytyped.slinky" %%% "boom" % "7.3-dt-20200226Z-402496",
  "org.scalablytyped.slinky" %%% "catbox" % "10.0-dt-20190219Z-9090b1",
  "org.scalablytyped.slinky" %%% "hapi" % "18.0-dt-20200227Z-306452",
  "org.scalablytyped.slinky" %%% "iron" % "5.0-dt-20180214Z-7f7c73",
  "org.scalablytyped.slinky" %%% "joi" % "14.3-dt-20200227Z-58a37b",
  "org.scalablytyped.slinky" %%% "knex" % "0.19.5-c13015",
  "org.scalablytyped.slinky" %%% "mime-db" % "1.27-dt-20190322Z-1463d3",
  "org.scalablytyped.slinky" %%% "mimos" % "3.0-dt-20200225Z-296775",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "objection" % "1.6.11-5bc58e",
  "org.scalablytyped.slinky" %%% "podium" % "1.0-dt-20200225Z-6b4f0e",
  "org.scalablytyped.slinky" %%% "shot" % "4.0-dt-20181002Z-34c89c",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
