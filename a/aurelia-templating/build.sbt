organization := "org.scalablytyped.slinky"
name := "aurelia-templating"
version := "1.10.2-0b82ed"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "aurelia-binding" % "2.5.0-ce27bf",
  "org.scalablytyped.slinky" %%% "aurelia-dependency-injection" % "1.5.1-0e8118",
  "org.scalablytyped.slinky" %%% "aurelia-loader" % "1.0.2-303d2c",
  "org.scalablytyped.slinky" %%% "aurelia-metadata" % "1.0.6-19e7db",
  "org.scalablytyped.slinky" %%% "aurelia-task-queue" % "1.3.3-1a741f",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        