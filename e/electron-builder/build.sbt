organization := "org.scalablytyped.slinky"
name := "electron-builder"
version := "21.2.0-133371"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "app-builder-lib" % "21.2.0-944508",
  "org.scalablytyped.slinky" %%% "builder-util" % "21.2.0-72e1f2",
  "org.scalablytyped.slinky" %%% "builder-util-runtime" % "8.3.0-cae751",
  "org.scalablytyped.slinky" %%% "debug" % "4.1-dt-20200226Z-963250",
  "org.scalablytyped.slinky" %%% "electron-publish" % "21.2.0-2be642",
  "org.scalablytyped.slinky" %%% "fs-extra" % "8.1-dt-20200218Z-9b6e4b",
  "org.scalablytyped.slinky" %%% "lazy-val" % "1.0.4-265cca",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "temp-file" % "3.3.4-6b9222",
  "org.scalablytyped.slinky" %%% "yargs" % "15.0-dt-20200225Z-a8e141",
  "org.scalablytyped.slinky" %%% "yargs-parser" % "15.0-dt-20200113Z-13f7d1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
