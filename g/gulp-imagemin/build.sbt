organization := "org.scalablytyped.slinky"
name := "gulp-imagemin"
version := "7.0-dt-20200228Z-76f061"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "imagemin" % "7.0-dt-20190909Z-1b7f6d",
  "org.scalablytyped.slinky" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-1851f8",
  "org.scalablytyped.slinky" %%% "imagemin-mozjpeg" % "8.0-dt-20190924Z-6a56f0",
  "org.scalablytyped.slinky" %%% "imagemin-optipng" % "5.2-dt-20180825Z-194bf3",
  "org.scalablytyped.slinky" %%% "imagemin-svgo" % "7.0-dt-20180825Z-4bdd46",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "svgo" % "1.3-dt-20200226Z-f0c6e2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
