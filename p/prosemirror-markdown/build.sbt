organization := "org.scalablytyped.slinky"
name := "prosemirror-markdown"
version := "1.0-dt-20190822Z-f0e729"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "linkify-it" % "2.1.0-dt-20190326Z-e8544b",
  "org.scalablytyped.slinky" %%% "markdown-it" % "0.0-unknown-dt-20190925Z-132ec8",
  "org.scalablytyped.slinky" %%% "orderedmap" % "1.0-dt-20180214Z-5359a1",
  "org.scalablytyped.slinky" %%% "prosemirror-model" % "1.7-dt-20190628Z-4ce6eb",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        