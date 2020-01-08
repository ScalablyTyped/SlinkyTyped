organization := "org.scalablytyped.slinky"
name := "karma-webpack"
version := "2.0-dt-20190524Z-730379"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "anymatch" % "1.3-dt-20190212Z-aec9d7",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20191217Z-4825ba",
  "org.scalablytyped.slinky" %%% "loglevel" % "1.6.6-4ee961",
  "org.scalablytyped.slinky" %%% "memory-fs" % "0.3.0-dt-20191126Z-849183",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "source-list-map" % "v0.1.6-dt-20190322Z-1643d7",
  "org.scalablytyped.slinky" %%% "source-map" % "0.7.3-6d51e7",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43",
  "org.scalablytyped.slinky" %%% "tapable" % "v1.0.0-dt-20190322Z-27a644",
  "org.scalablytyped.slinky" %%% "uglify-js" % "3.0-dt-20181015Z-cdf164",
  "org.scalablytyped.slinky" %%% "webpack" % "4.41-dt-20191230Z-55b185",
  "org.scalablytyped.slinky" %%% "webpack-dev-middleware" % "2.0-dt-20190624Z-9cbce8",
  "org.scalablytyped.slinky" %%% "webpack-sources" % "0.1-dt-20180625Z-5d736a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        