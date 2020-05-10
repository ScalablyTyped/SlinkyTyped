organization := "org.scalablytyped.slinky"
name := "run-sequence"
version := "0.0-unknown-dt-20200227Z-c4ff51"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "chokidar" % "3.3.1-f1f0ab",
  "org.scalablytyped.slinky" %%% "glob" % "7.1-dt-20200226Z-4b5c9a",
  "org.scalablytyped.slinky" %%% "glob-stream" % "v6.1.0-dt-20200226Z-965bd4",
  "org.scalablytyped.slinky" %%% "gulp" % "4.0-dt-20200225Z-ac849a",
  "org.scalablytyped.slinky" %%% "minimatch" % "3.0-dt-20200226Z-98e362",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e",
  "org.scalablytyped.slinky" %%% "undertaker" % "1.2-dt-20200225Z-dca11a",
  "org.scalablytyped.slinky" %%% "undertaker-registry" % "1.0-dt-20200225Z-27e1ea",
  "org.scalablytyped.slinky" %%% "vinyl" % "2.0-dt-20200225Z-f08824",
  "org.scalablytyped.slinky" %%% "vinyl-fs" % "2.4-dt-20200227Z-bc86b6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
