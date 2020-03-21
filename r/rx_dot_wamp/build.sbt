organization := "org.scalablytyped.slinky"
name := "rx_dot_wamp"
version := "0.5.0-dt-20200225Z-f60c53"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "autobahn" % "18.10-dt-20200225Z-4af649",
  "org.scalablytyped.slinky" %%% "rx-core" % "4.0-dt-20200225Z-9f12e6",
  "org.scalablytyped.slinky" %%% "rx-lite" % "4.0-dt-20200225Z-61a117",
  "org.scalablytyped.slinky" %%% "rx-lite-aggregates" % "4.0-dt-20200225Z-243d0f",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "when" % "2.4.0-dt-20200225Z-7afc0a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
