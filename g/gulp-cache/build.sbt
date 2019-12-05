organization := "org.scalablytyped.slinky"
name := "gulp-cache"
version := "v0.4.5-dt-20190322Z-cf8fa0"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "chalk" % "2.4.2-7b8616",
  "org.scalablytyped.slinky" %%% "gulp-util" % "3.0-dt-20180315Z-23f541",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821",
  "org.scalablytyped.slinky" %%% "through2" % "2.0-dt-20190322Z-6dd430",
  "org.scalablytyped.slinky" %%% "vinyl" % "2.0-dt-20191106Z-2312e6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        