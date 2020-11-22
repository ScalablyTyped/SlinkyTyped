organization := "org.scalablytyped.slinky"
name := "prosemirror-gapcursor"
version := "1.0-dt-20200515Z-54c8d5"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "orderedmap" % "1.0-dt-20200515Z-3ab191",
  "org.scalablytyped.slinky" %%% "prosemirror-model" % "1.11-dt-20201109Z-e5ee4c",
  "org.scalablytyped.slinky" %%% "prosemirror-state" % "1.2-dt-20201002Z-650689",
  "org.scalablytyped.slinky" %%% "prosemirror-transform" % "1.1-dt-20191101Z-35984a",
  "org.scalablytyped.slinky" %%% "prosemirror-view" % "1.16-dt-20201015Z-60fb40",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
