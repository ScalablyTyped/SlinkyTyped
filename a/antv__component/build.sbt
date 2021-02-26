organization := "org.scalablytyped.slinky"
name := "antv__component"
version := "0.8.2-2593d0"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "antv__event-emitter" % "0.1.2-96771d",
  "org.scalablytyped.slinky" %%% "antv__g-base" % "0.5.1-c0cac4",
  "org.scalablytyped.slinky" %%% "d3-timer" % "2.0-dt-20201002Z-ce8821",
  "org.scalablytyped.slinky" %%% "gl-matrix" % "3.3.0-4af3a8",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
