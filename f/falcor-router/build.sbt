organization := "org.scalablytyped.slinky"
name := "falcor-router"
version := "0.8-dt-20200515Z-a14251"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "falcor" % "2.0-dt-20200515Z-671275",
  "org.scalablytyped.slinky" %%% "falcor-http-datasource" % "0.1.3-dt-20200515Z-075877",
  "org.scalablytyped.slinky" %%% "falcor-json-graph" % "1.1.7-dt-20200515Z-a0d65b",
  "org.scalablytyped.slinky" %%% "rx" % "4.1.0-ac3ba5",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
