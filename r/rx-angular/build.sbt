organization := "org.scalablytyped.slinky"
name := "rx-angular"
version := "0.0-unknown-dt-20200227Z-d10690"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "angular" % "1.6-dt-20200225Z-558e01",
  "org.scalablytyped.slinky" %%% "rx-core" % "4.0-dt-20200225Z-9f12e6",
  "org.scalablytyped.slinky" %%% "rx-lite" % "4.0-dt-20200225Z-61a117",
  "org.scalablytyped.slinky" %%% "rx-lite-aggregates" % "4.0-dt-20200225Z-243d0f",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
