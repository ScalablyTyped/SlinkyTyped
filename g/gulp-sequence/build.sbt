organization := "org.scalablytyped.slinky"
name := "gulp-sequence"
version := "1.0-dt-20201002Z-1a7dec"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "chokidar" % "3.4.3-77adf0",
  "org.scalablytyped.slinky" %%% "glob" % "7.1-dt-20200706Z-3975db",
  "org.scalablytyped.slinky" %%% "glob-stream" % "v6.1.0-dt-20201002Z-ceaa83",
  "org.scalablytyped.slinky" %%% "gulp" % "4.0-dt-20201002Z-46b520",
  "org.scalablytyped.slinky" %%% "minimatch" % "3.0-dt-20200515Z-817af0",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "undertaker" % "1.2-dt-20200902Z-f44661",
  "org.scalablytyped.slinky" %%% "undertaker-registry" % "1.0-dt-20200515Z-ee083c",
  "org.scalablytyped.slinky" %%% "vinyl" % "2.0-dt-20201002Z-fb690a",
  "org.scalablytyped.slinky" %%% "vinyl-fs" % "2.4-dt-20200515Z-d10aaf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
