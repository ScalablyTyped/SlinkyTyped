organization := "org.scalablytyped.slinky"
name := "ecmarkup"
version := "4.2.1-0b947a"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "esfx__async-canceltoken" % "1.0.0-pre.13-579b08",
  "org.scalablytyped.slinky" %%% "esfx__cancelable" % "1.0.0-pre.13-ed41da",
  "org.scalablytyped.slinky" %%% "esfx__disposable" % "1.0.0-pre.13-3000ad",
  "org.scalablytyped.slinky" %%% "grammarkdown" % "2.2.7-1f0302",
  "org.scalablytyped.slinky" %%% "nomnom" % "0.0-unknown-dt-20201002Z-ddd77c",
  "org.scalablytyped.slinky" %%% "prex" % "0.4.7-82719d",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
