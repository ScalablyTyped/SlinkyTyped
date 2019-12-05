organization := "org.scalablytyped.slinky"
name := "prosemirror-markdown"
version := "1.0-dt-20190822Z-e71ca6"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "linkify-it" % "2.1.0-dt-20190326Z-f901b9",
  "org.scalablytyped.slinky" %%% "markdown-it" % "0.0-unknown-dt-20190925Z-ba46ca",
  "org.scalablytyped.slinky" %%% "orderedmap" % "1.0-dt-20180214Z-5359a1",
  "org.scalablytyped.slinky" %%% "prosemirror-model" % "1.7-dt-20190628Z-b9e144",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        