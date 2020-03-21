organization := "org.scalablytyped.slinky"
name := "prosemirror-dev-tools"
version := "2.1-dt-20190730Z-88b23d"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "orderedmap" % "1.0-dt-20180214Z-924c55",
  "org.scalablytyped.slinky" %%% "prosemirror-model" % "1.7-dt-20190628Z-f4d79e",
  "org.scalablytyped.slinky" %%% "prosemirror-state" % "1.2-dt-20200225Z-fe15a4",
  "org.scalablytyped.slinky" %%% "prosemirror-transform" % "1.1-dt-20191101Z-759d78",
  "org.scalablytyped.slinky" %%% "prosemirror-view" % "1.11-dt-20190930Z-d12cd7",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
