organization := "org.scalablytyped.slinky"
name := "rx-lite-testing"
version := "4.0-dt-20200515Z-4ee11e"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "rx-core" % "4.0-dt-20200515Z-163fff",
  "org.scalablytyped.slinky" %%% "rx-lite" % "4.0-dt-20200515Z-2f7e2f",
  "org.scalablytyped.slinky" %%% "rx-lite-virtualtime" % "4.0-dt-20200515Z-f845b7",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
