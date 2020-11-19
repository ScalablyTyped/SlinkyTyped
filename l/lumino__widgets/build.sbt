organization := "org.scalablytyped.slinky"
name := "lumino__widgets"
version := "1.13.4-8e6bb9"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "lumino__algorithm" % "1.3.3-5cf99d",
  "org.scalablytyped.slinky" %%% "lumino__commands" % "1.11.3-5d1f4b",
  "org.scalablytyped.slinky" %%% "lumino__coreutils" % "1.5.3-9bc078",
  "org.scalablytyped.slinky" %%% "lumino__disposable" % "1.4.3-d5389d",
  "org.scalablytyped.slinky" %%% "lumino__messaging" % "1.4.3-e2c74a",
  "org.scalablytyped.slinky" %%% "lumino__signaling" % "1.4.3-f9af4e",
  "org.scalablytyped.slinky" %%% "lumino__virtualdom" % "1.7.3-e6c2ea",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
