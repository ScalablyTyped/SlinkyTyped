organization := "org.scalablytyped.slinky"
name := "ecmarkup"
version := "3.25.3-8590da"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "esfx__async-canceltoken" % "1.0.0-pre.13-1d1945",
  "org.scalablytyped.slinky" %%% "esfx__cancelable" % "1.0.0-pre.13-f6b9d7",
  "org.scalablytyped.slinky" %%% "esfx__disposable" % "1.0.0-pre.13-46cd93",
  "org.scalablytyped.slinky" %%% "grammarkdown" % "2.2.0-970fd4",
  "org.scalablytyped.slinky" %%% "nomnom" % "0.0-unknown-dt-20200515Z-010b51",
  "org.scalablytyped.slinky" %%% "prex" % "0.4.7-266921",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
