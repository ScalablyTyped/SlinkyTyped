organization := "org.scalablytyped.slinky"
name := "aurelia-knockout"
version := "2.4.0-ac1080"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "aurelia-binding" % "2.5.4-07d361",
  "org.scalablytyped.slinky" %%% "aurelia-dependency-injection" % "1.5.2-a33646",
  "org.scalablytyped.slinky" %%% "aurelia-loader" % "1.0.2-e543f8",
  "org.scalablytyped.slinky" %%% "aurelia-metadata" % "1.0.6-903fd5",
  "org.scalablytyped.slinky" %%% "aurelia-task-queue" % "1.3.3-f74830",
  "org.scalablytyped.slinky" %%% "aurelia-templating" % "1.10.4-15913d",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
