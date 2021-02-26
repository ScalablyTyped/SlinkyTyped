organization := "org.scalablytyped.slinky"
name := "dagre-d3"
version := "0.6-dt-20201118Z-aec226"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "d3-selection" % "2.0-dt-20201002Z-67bdbd",
  "org.scalablytyped.slinky" %%% "dagre" % "0.7-dt-20200507Z-1d8ec0",
  "org.scalablytyped.slinky" %%% "graphlib" % "2.1.1-dt-20201002Z-17e596",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
