organization := "org.scalablytyped.slinky"
name := "grammarkdown"
version := "2.2.0-8eaabe"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "esfx__async-canceltoken" % "1.0.0-pre.13-3086b5",
  "org.scalablytyped.slinky" %%% "esfx__cancelable" % "1.0.0-pre.13-3994cd",
  "org.scalablytyped.slinky" %%% "esfx__disposable" % "1.0.0-pre.13-11c94b",
  "org.scalablytyped.slinky" %%% "prex" % "0.4.7-652151",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
