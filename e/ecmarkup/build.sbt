organization := "org.scalablytyped.slinky"
name := "ecmarkup"
version := "3.25.3-c013b2"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "esfx__async-canceltoken" % "1.0.0-pre.13-f7fc76",
  "org.scalablytyped.slinky" %%% "esfx__cancelable" % "1.0.0-pre.13-046355",
  "org.scalablytyped.slinky" %%% "esfx__disposable" % "1.0.0-pre.13-9caa32",
  "org.scalablytyped.slinky" %%% "grammarkdown" % "2.2.0-9ab14e",
  "org.scalablytyped.slinky" %%% "nomnom" % "0.0-unknown-dt-20200515Z-1f6f5a",
  "org.scalablytyped.slinky" %%% "prex" % "0.4.7-9c1631",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
