organization := "org.scalablytyped.slinky"
name := "gulp-tsd"
version := "0.0-unknown-dt-20190322Z-3cdb7a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "chokidar" % "3.3.1-0b5509",
  "org.scalablytyped.slinky" %%% "glob" % "7.1-dt-20180920Z-11ad5d",
  "org.scalablytyped.slinky" %%% "glob-stream" % "v6.1.0-dt-20190322Z-1a6a42",
  "org.scalablytyped.slinky" %%% "gulp" % "4.0-dt-20190405Z-618b79",
  "org.scalablytyped.slinky" %%% "minimatch" % "3.0-dt-20180214Z-4df7c9",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43",
  "org.scalablytyped.slinky" %%% "undertaker" % "1.2-dt-20190405Z-91ec3c",
  "org.scalablytyped.slinky" %%% "undertaker-registry" % "1.0-dt-20180214Z-234975",
  "org.scalablytyped.slinky" %%% "vinyl" % "2.0-dt-20191106Z-27f499",
  "org.scalablytyped.slinky" %%% "vinyl-fs" % "2.4-dt-20190228Z-d11cb6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        