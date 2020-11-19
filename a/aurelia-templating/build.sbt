organization := "org.scalablytyped.slinky"
name := "aurelia-templating"
version := "1.10.4-c03c53"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "aurelia-binding" % "2.5.4-80c15b",
  "org.scalablytyped.slinky" %%% "aurelia-dependency-injection" % "1.5.2-ee6182",
  "org.scalablytyped.slinky" %%% "aurelia-loader" % "1.0.2-2c0e21",
  "org.scalablytyped.slinky" %%% "aurelia-metadata" % "1.0.6-0829a3",
  "org.scalablytyped.slinky" %%% "aurelia-task-queue" % "1.3.3-090557",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
