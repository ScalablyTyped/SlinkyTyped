organization := "org.scalablytyped.slinky"
name := "aurelia-knockout"
version := "2.4.0-ff786c"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "aurelia-binding" % "2.5.2-e1fa19",
  "org.scalablytyped.slinky" %%% "aurelia-dependency-injection" % "1.5.2-a530a4",
  "org.scalablytyped.slinky" %%% "aurelia-loader" % "1.0.2-67f3ed",
  "org.scalablytyped.slinky" %%% "aurelia-metadata" % "1.0.6-000905",
  "org.scalablytyped.slinky" %%% "aurelia-task-queue" % "1.3.3-4a48b7",
  "org.scalablytyped.slinky" %%% "aurelia-templating" % "1.10.3-613804",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
