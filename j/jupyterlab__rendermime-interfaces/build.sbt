organization := "org.scalablytyped.slinky"
name := "jupyterlab__rendermime-interfaces"
version := "2.2.0-8b0b69"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "lumino__algorithm" % "1.3.3-3abbc1",
  "org.scalablytyped.slinky" %%% "lumino__commands" % "1.11.3-232ff5",
  "org.scalablytyped.slinky" %%% "lumino__coreutils" % "1.5.3-dfe731",
  "org.scalablytyped.slinky" %%% "lumino__disposable" % "1.4.3-c70cce",
  "org.scalablytyped.slinky" %%% "lumino__messaging" % "1.4.3-33426c",
  "org.scalablytyped.slinky" %%% "lumino__signaling" % "1.4.3-4b1aac",
  "org.scalablytyped.slinky" %%% "lumino__virtualdom" % "1.7.3-9ca6fc",
  "org.scalablytyped.slinky" %%% "lumino__widgets" % "1.13.4-bc656b",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
