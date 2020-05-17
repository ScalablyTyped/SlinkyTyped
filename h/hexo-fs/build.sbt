organization := "org.scalablytyped.slinky"
name := "hexo-fs"
version := "0.2-dt-20190524Z-ed44c2"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "bluebird" % "3.5-dt-20200302Z-44c437",
  "org.scalablytyped.slinky" %%% "chokidar" % "3.3.1-c4152c",
  "org.scalablytyped.slinky" %%% "graceful-fs" % "4.1-dt-20190212Z-04e269",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
