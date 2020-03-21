organization := "org.scalablytyped.slinky"
name := "aurelia-templating"
version := "1.10.2-0a0079"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "aurelia-binding" % "2.5.0-6ff1bb",
  "org.scalablytyped.slinky" %%% "aurelia-dependency-injection" % "1.5.1-d11393",
  "org.scalablytyped.slinky" %%% "aurelia-loader" % "1.0.2-377957",
  "org.scalablytyped.slinky" %%% "aurelia-metadata" % "1.0.6-b7fd8c",
  "org.scalablytyped.slinky" %%% "aurelia-task-queue" % "1.3.3-2e57a9",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
