organization := "org.scalablytyped.slinky"
name := "prosemirror-gapcursor"
version := "1.0-dt-20200515Z-053f2f"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "orderedmap" % "1.0-dt-20200515Z-3ab191",
  "org.scalablytyped.slinky" %%% "prosemirror-model" % "1.7-dt-20200515Z-de3f7c",
  "org.scalablytyped.slinky" %%% "prosemirror-state" % "1.2-dt-20200629Z-f656bc",
  "org.scalablytyped.slinky" %%% "prosemirror-transform" % "1.1-dt-20191101Z-647e99",
  "org.scalablytyped.slinky" %%% "prosemirror-view" % "1.15-dt-20200629Z-55c0b7",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
