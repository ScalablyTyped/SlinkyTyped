organization := "org.scalablytyped.slinky"
name := "nvd3"
version := "1.8.1-dt-20201002Z-384b25"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "d3-dispatch" % "2.0-dt-20200930Z-3561fd",
  "org.scalablytyped.slinky" %%% "d3-selection" % "2.0-dt-20201002Z-a092b8",
  "org.scalablytyped.slinky" %%% "d3-transition" % "2.0-dt-20201002Z-97fdba",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
