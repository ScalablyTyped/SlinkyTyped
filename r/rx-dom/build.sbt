organization := "org.scalablytyped.slinky"
name := "rx-dom"
version := "7.0-dt-20200227Z-34f0d4"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "rx" % "4.1-dt-20200225Z-6154db",
  "org.scalablytyped.slinky" %%% "rx-core" % "4.0-dt-20200225Z-9f12e6",
  "org.scalablytyped.slinky" %%% "rx-core-binding" % "4.0-dt-20200225Z-6f7c35",
  "org.scalablytyped.slinky" %%% "rx-lite" % "4.0-dt-20200225Z-61a117",
  "org.scalablytyped.slinky" %%% "rx-lite-aggregates" % "4.0-dt-20200225Z-243d0f",
  "org.scalablytyped.slinky" %%% "rx-lite-async" % "4.0-dt-20200225Z-1daa7c",
  "org.scalablytyped.slinky" %%% "rx-lite-backpressure" % "4.0-dt-20200225Z-c50da4",
  "org.scalablytyped.slinky" %%% "rx-lite-coincidence" % "4.0-dt-20200225Z-6bcd2f",
  "org.scalablytyped.slinky" %%% "rx-lite-experimental" % "4.0-dt-20200225Z-db5c25",
  "org.scalablytyped.slinky" %%% "rx-lite-joinpatterns" % "4.0-dt-20200225Z-30c9be",
  "org.scalablytyped.slinky" %%% "rx-lite-testing" % "4.0-dt-20200225Z-cee824",
  "org.scalablytyped.slinky" %%% "rx-lite-time" % "4.0-dt-20200225Z-5ddd59",
  "org.scalablytyped.slinky" %%% "rx-lite-virtualtime" % "4.0-dt-20200225Z-a8f0bf",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
