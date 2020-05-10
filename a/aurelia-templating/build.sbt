organization := "org.scalablytyped.slinky"
name := "aurelia-templating"
version := "1.10.3-c87751"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "aurelia-binding" % "2.5.2-5175d9",
  "org.scalablytyped.slinky" %%% "aurelia-dependency-injection" % "1.5.2-c7b092",
  "org.scalablytyped.slinky" %%% "aurelia-loader" % "1.0.2-110228",
  "org.scalablytyped.slinky" %%% "aurelia-metadata" % "1.0.6-4633f5",
  "org.scalablytyped.slinky" %%% "aurelia-task-queue" % "1.3.3-88ec7e",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
