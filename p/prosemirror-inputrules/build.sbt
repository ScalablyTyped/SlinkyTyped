organization := "org.scalablytyped.slinky"
name := "prosemirror-inputrules"
version := "1.0-dt-20200225Z-5afc60"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "orderedmap" % "1.0-dt-20180214Z-60bb92",
  "org.scalablytyped.slinky" %%% "prosemirror-model" % "1.7-dt-20190628Z-5d76af",
  "org.scalablytyped.slinky" %%% "prosemirror-state" % "1.2-dt-20200225Z-c59b5e",
  "org.scalablytyped.slinky" %%% "prosemirror-transform" % "1.1-dt-20191101Z-b3016a",
  "org.scalablytyped.slinky" %%% "prosemirror-view" % "1.11-dt-20200416Z-031d30",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
