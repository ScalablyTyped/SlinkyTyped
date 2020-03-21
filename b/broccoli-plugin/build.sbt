organization := "org.scalablytyped.slinky"
name := "broccoli-plugin"
version := "3.1.0-5048ab"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "broccoli-node-api" % "1.7.0-fcba0b",
  "org.scalablytyped.slinky" %%% "broccoli-output-wrapper" % "2.0.0-21c318",
  "org.scalablytyped.slinky" %%% "fs-merger" % "3.0.2-3b45ad",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "walk-sync" % "0.3.4-4e61c9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
