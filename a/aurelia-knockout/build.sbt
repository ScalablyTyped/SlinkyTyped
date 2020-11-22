organization := "org.scalablytyped.slinky"
name := "aurelia-knockout"
version := "2.4.0-31951f"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "aurelia-binding" % "2.5.4-48b6bb",
  "org.scalablytyped.slinky" %%% "aurelia-dependency-injection" % "1.5.2-5ec585",
  "org.scalablytyped.slinky" %%% "aurelia-loader" % "1.0.2-2127e0",
  "org.scalablytyped.slinky" %%% "aurelia-metadata" % "1.0.7-96a5b7",
  "org.scalablytyped.slinky" %%% "aurelia-task-queue" % "1.3.3-e1b62b",
  "org.scalablytyped.slinky" %%% "aurelia-templating" % "1.10.4-c8b112",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
