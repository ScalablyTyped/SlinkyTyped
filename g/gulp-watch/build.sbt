organization := "org.scalablytyped.slinky"
name := "gulp-watch"
version := "v4.1.1-dt-20200226Z-021734"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "glob" % "7.1-dt-20200226Z-2f6948",
  "org.scalablytyped.slinky" %%% "glob-stream" % "v6.1.0-dt-20200226Z-147c7f",
  "org.scalablytyped.slinky" %%% "minimatch" % "3.0-dt-20200226Z-befe22",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "vinyl" % "2.0-dt-20200225Z-55c259",
  "org.scalablytyped.slinky" %%% "vinyl-fs" % "2.4-dt-20200227Z-6fcd90")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
