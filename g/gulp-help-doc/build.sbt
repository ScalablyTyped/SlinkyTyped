organization := "org.scalablytyped.slinky"
name := "gulp-help-doc"
version := "0.0-unknown-dt-20201002Z-ae5ae6"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "chokidar" % "3.4.3-0b540f",
  "org.scalablytyped.slinky" %%% "glob" % "7.1-dt-20200706Z-833f54",
  "org.scalablytyped.slinky" %%% "glob-stream" % "v6.1.0-dt-20201002Z-c74a6e",
  "org.scalablytyped.slinky" %%% "gulp" % "4.0-dt-20201002Z-79d3c0",
  "org.scalablytyped.slinky" %%% "minimatch" % "3.0-dt-20200515Z-3c948a",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533",
  "org.scalablytyped.slinky" %%% "undertaker" % "1.2-dt-20200902Z-c63034",
  "org.scalablytyped.slinky" %%% "undertaker-registry" % "1.0-dt-20200515Z-87d69a",
  "org.scalablytyped.slinky" %%% "vinyl" % "2.0-dt-20201002Z-2b1132",
  "org.scalablytyped.slinky" %%% "vinyl-fs" % "2.4-dt-20200515Z-7e674b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
