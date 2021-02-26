organization := "org.scalablytyped.slinky"
name := "ember-testing-helpers"
version := "0.0-unknown-dt-20201028Z-e67c3c"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "jquery" % "3.5-dt-20201028Z-7b4ce2",
  "org.scalablytyped.slinky" %%% "rsvp" % "4.0-dt-20201028Z-f308b4",
  "org.scalablytyped.slinky" %%% "sizzle" % "2.3-dt-20201002Z-da3788",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
