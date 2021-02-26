organization := "org.scalablytyped.slinky"
name := "prosemirror-tables"
version := "1.1.1-29c374"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "orderedmap" % "1.0-dt-20200515Z-7419de",
  "org.scalablytyped.slinky" %%% "prosemirror-model" % "1.11-dt-20201109Z-7cc998",
  "org.scalablytyped.slinky" %%% "prosemirror-state" % "1.2-dt-20201002Z-d6892d",
  "org.scalablytyped.slinky" %%% "prosemirror-transform" % "1.1-dt-20191101Z-379e6c",
  "org.scalablytyped.slinky" %%% "prosemirror-view" % "1.16-dt-20201015Z-9140e6",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
