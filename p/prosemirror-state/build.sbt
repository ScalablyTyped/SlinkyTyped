organization := "org.scalablytyped.slinky"
name := "prosemirror-state"
version := "1.2-dt-20200515Z-acdbcc"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "orderedmap" % "1.0-dt-20200515Z-76ecac",
  "org.scalablytyped.slinky" %%% "prosemirror-model" % "1.7-dt-20200515Z-153ab0",
  "org.scalablytyped.slinky" %%% "prosemirror-transform" % "1.1-dt-20191101Z-8fd4db",
  "org.scalablytyped.slinky" %%% "prosemirror-view" % "1.11-dt-20200515Z-7aa4ce",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
