organization := "org.scalablytyped.slinky"
name := "aurelia-templating"
version := "1.10.3-637ee5"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "aurelia-binding" % "2.5.2-d48ff3",
  "org.scalablytyped.slinky" %%% "aurelia-dependency-injection" % "1.5.2-b82ed3",
  "org.scalablytyped.slinky" %%% "aurelia-loader" % "1.0.2-0944a5",
  "org.scalablytyped.slinky" %%% "aurelia-metadata" % "1.0.6-bfb614",
  "org.scalablytyped.slinky" %%% "aurelia-task-queue" % "1.3.3-8eea92",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
