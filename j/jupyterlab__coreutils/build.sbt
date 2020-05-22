organization := "org.scalablytyped.slinky"
name := "jupyterlab__coreutils"
version := "3.2.0-511f91"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "phosphor__algorithm" % "1.2.0-787f4c",
  "org.scalablytyped.slinky" %%% "phosphor__commands" % "1.7.2-b6159b",
  "org.scalablytyped.slinky" %%% "phosphor__coreutils" % "1.3.1-3c6f75",
  "org.scalablytyped.slinky" %%% "phosphor__disposable" % "1.3.1-42e33c",
  "org.scalablytyped.slinky" %%% "phosphor__signaling" % "1.3.1-06b254",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
