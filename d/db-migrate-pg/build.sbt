organization := "org.scalablytyped.slinky"
name := "db-migrate-pg"
version := "0.0-unknown-dt-20201002Z-2a41e7"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "bluebird" % "3.5-dt-20201028Z-64939d",
  "org.scalablytyped.slinky" %%% "db-migrate-base" % "0.0-unknown-dt-20201002Z-1e6e52",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "pg" % "7.14-dt-20201117Z-a10697",
  "org.scalablytyped.slinky" %%% "pg-types" % "2.2.0-5016c5",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
