organization := "org.scalablytyped.slinky"
name := "hexo-fs"
version := "0.2-dt-20190524Z-ceea63"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "bluebird" % "3.5-dt-20200302Z-a7b277",
  "org.scalablytyped.slinky" %%% "chokidar" % "3.3.1-b8ec64",
  "org.scalablytyped.slinky" %%% "graceful-fs" % "4.1-dt-20190212Z-c854a2",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
