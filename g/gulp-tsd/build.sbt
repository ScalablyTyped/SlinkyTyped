organization := "org.scalablytyped.slinky"
name := "gulp-tsd"
version := "0.0-unknown-dt-20190322Z-233ff7"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "chokidar" % "3.3.0-e88e44",
  "org.scalablytyped.slinky" %%% "glob" % "7.1-dt-20180920Z-840fcb",
  "org.scalablytyped.slinky" %%% "glob-stream" % "v6.1.0-dt-20190322Z-1c3527",
  "org.scalablytyped.slinky" %%% "gulp" % "4.0-dt-20190405Z-805f84",
  "org.scalablytyped.slinky" %%% "minimatch" % "3.0-dt-20180214Z-561ad4",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821",
  "org.scalablytyped.slinky" %%% "undertaker" % "1.2-dt-20190405Z-1c1d70",
  "org.scalablytyped.slinky" %%% "undertaker-registry" % "1.0-dt-20180214Z-234975",
  "org.scalablytyped.slinky" %%% "vinyl" % "2.0-dt-20191106Z-2312e6",
  "org.scalablytyped.slinky" %%% "vinyl-fs" % "2.4-dt-20190228Z-62be0b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        