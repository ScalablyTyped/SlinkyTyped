organization := "org.scalablytyped.slinky"
name := "prosemirror-markdown"
version := "1.0-dt-20200515Z-748fe6"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "linkify-it" % "2.1.0-dt-20200515Z-447415",
  "org.scalablytyped.slinky" %%% "markdown-it" % "v10.0.0-dt-20200426Z-1e0628",
  "org.scalablytyped.slinky" %%% "mdurl" % "1.0-dt-20200515Z-f9c725",
  "org.scalablytyped.slinky" %%% "orderedmap" % "1.0-dt-20200515Z-3ab191",
  "org.scalablytyped.slinky" %%% "prosemirror-model" % "1.7-dt-20200515Z-de3f7c",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
