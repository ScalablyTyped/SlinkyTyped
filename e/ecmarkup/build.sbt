organization := "org.scalablytyped.slinky"
name := "ecmarkup"
version := "4.2.1-9da79f"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "esfx__async-canceltoken" % "1.0.0-pre.13-291919",
  "org.scalablytyped.slinky" %%% "esfx__cancelable" % "1.0.0-pre.13-93b36f",
  "org.scalablytyped.slinky" %%% "esfx__disposable" % "1.0.0-pre.13-9a04f6",
  "org.scalablytyped.slinky" %%% "grammarkdown" % "2.2.7-409c3c",
  "org.scalablytyped.slinky" %%% "nomnom" % "0.0-unknown-dt-20201002Z-8e0d90",
  "org.scalablytyped.slinky" %%% "prex" % "0.4.7-40a470",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
