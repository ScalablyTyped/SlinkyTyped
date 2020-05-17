organization := "org.scalablytyped.slinky"
name := "prosemirror-view"
version := "1.11-dt-20200416Z-7b5b26"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "orderedmap" % "1.0-dt-20180214Z-6b2146",
  "org.scalablytyped.slinky" %%% "prosemirror-model" % "1.7-dt-20190628Z-97ecd6",
  "org.scalablytyped.slinky" %%% "prosemirror-transform" % "1.1-dt-20191101Z-225c47",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
