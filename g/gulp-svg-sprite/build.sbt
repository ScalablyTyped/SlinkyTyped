organization := "org.scalablytyped.slinky"
name := "gulp-svg-sprite"
version := "1.2.9-dt-20190322Z-2aaa66"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "logform" % "2.1.2-2d1cfb",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821",
  "org.scalablytyped.slinky" %%% "svg-sprite" % "0.0-unknown-dt-20190322Z-907aee",
  "org.scalablytyped.slinky" %%% "vinyl" % "2.0-dt-20191106Z-2312e6",
  "org.scalablytyped.slinky" %%% "winston" % "3.2.1-d151db",
  "org.scalablytyped.slinky" %%% "winston-transport" % "4.3.0-beca48")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        