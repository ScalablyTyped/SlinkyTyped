organization := "org.scalablytyped.slinky"
name := "gulp-protractor"
version := "v1.0.0-dt-20200226Z-6aecaf"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "chokidar" % "3.3.1-b8ec64",
  "org.scalablytyped.slinky" %%% "glob" % "7.1-dt-20200226Z-2f6948",
  "org.scalablytyped.slinky" %%% "glob-stream" % "v6.1.0-dt-20200226Z-147c7f",
  "org.scalablytyped.slinky" %%% "gulp" % "4.0-dt-20200225Z-c7c21a",
  "org.scalablytyped.slinky" %%% "minimatch" % "3.0-dt-20200226Z-befe22",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "undertaker" % "1.2-dt-20200225Z-92e7ff",
  "org.scalablytyped.slinky" %%% "undertaker-registry" % "1.0-dt-20200225Z-d5a8e2",
  "org.scalablytyped.slinky" %%% "vinyl" % "2.0-dt-20200225Z-55c259",
  "org.scalablytyped.slinky" %%% "vinyl-fs" % "2.4-dt-20200227Z-6fcd90")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
