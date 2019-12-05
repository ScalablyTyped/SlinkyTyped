organization := "org.scalablytyped.slinky"
name := "aurelia-knockout"
version := "2.3.0-245e8d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "aurelia-binding" % "2.5.0-01913d",
  "org.scalablytyped.slinky" %%% "aurelia-dependency-injection" % "1.5.1-fbf2d6",
  "org.scalablytyped.slinky" %%% "aurelia-loader" % "1.0.2-886698",
  "org.scalablytyped.slinky" %%% "aurelia-metadata" % "1.0.6-9f7701",
  "org.scalablytyped.slinky" %%% "aurelia-task-queue" % "1.3.3-4b5249",
  "org.scalablytyped.slinky" %%% "aurelia-templating" % "1.10.2-5bc775",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        