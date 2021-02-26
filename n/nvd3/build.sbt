organization := "org.scalablytyped.slinky"
name := "nvd3"
version := "1.8.1-dt-20201002Z-969b33"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "d3-dispatch" % "2.0-dt-20200930Z-4797ae",
  "org.scalablytyped.slinky" %%% "d3-selection" % "2.0-dt-20201002Z-67bdbd",
  "org.scalablytyped.slinky" %%% "d3-transition" % "2.0-dt-20201002Z-fd0136",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
