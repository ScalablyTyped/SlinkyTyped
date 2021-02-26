organization := "org.scalablytyped.slinky"
name := "aurelia-templating"
version := "1.10.4-2ea959"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "aurelia-binding" % "2.5.4-363e6b",
  "org.scalablytyped.slinky" %%% "aurelia-dependency-injection" % "1.5.2-3601c7",
  "org.scalablytyped.slinky" %%% "aurelia-loader" % "1.0.2-e32ec3",
  "org.scalablytyped.slinky" %%% "aurelia-metadata" % "1.0.7-977641",
  "org.scalablytyped.slinky" %%% "aurelia-task-queue" % "1.3.3-0d2ec3",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
