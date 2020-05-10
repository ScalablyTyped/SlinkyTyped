organization := "org.scalablytyped.slinky"
name := "prosemirror-markdown"
version := "1.0-dt-20200410Z-2707c7"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "linkify-it" % "2.1.0-dt-20200225Z-e4003d",
  "org.scalablytyped.slinky" %%% "markdown-it" % "v10.0.0-dt-20200426Z-d9f30a",
  "org.scalablytyped.slinky" %%% "mdurl" % "1.0-dt-20181017Z-dc3795",
  "org.scalablytyped.slinky" %%% "orderedmap" % "1.0-dt-20180214Z-60bb92",
  "org.scalablytyped.slinky" %%% "prosemirror-model" % "1.7-dt-20190628Z-5d76af",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
