organization := "org.scalablytyped.slinky"
name := "gulp-help"
version := "0.0-unknown-dt-20200515Z-5111c8"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "chokidar" % "3.4.0-ab3e5d",
  "org.scalablytyped.slinky" %%% "glob" % "7.1-dt-20200515Z-90a207",
  "org.scalablytyped.slinky" %%% "glob-stream" % "v6.1.0-dt-20200515Z-b48333",
  "org.scalablytyped.slinky" %%% "gulp" % "4.0-dt-20200515Z-61b118",
  "org.scalablytyped.slinky" %%% "minimatch" % "3.0-dt-20200515Z-9d1960",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "orchestrator" % "0.3-dt-20200515Z-07954d",
  "org.scalablytyped.slinky" %%% "q" % "1.5-dt-20200515Z-d29ee5",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0",
  "org.scalablytyped.slinky" %%% "undertaker" % "1.2-dt-20200515Z-279fe2",
  "org.scalablytyped.slinky" %%% "undertaker-registry" % "1.0-dt-20200515Z-65f6f5",
  "org.scalablytyped.slinky" %%% "vinyl" % "2.0-dt-20200515Z-6c877b",
  "org.scalablytyped.slinky" %%% "vinyl-fs" % "2.4-dt-20200515Z-cbc207")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
