organization := "org.scalablytyped.slinky"
name := "gulp-imagemin"
version := "7.0-dt-20200228Z-62d3fc"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "imagemin" % "7.0-dt-20190909Z-4bb556",
  "org.scalablytyped.slinky" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-e6682e",
  "org.scalablytyped.slinky" %%% "imagemin-mozjpeg" % "8.0-dt-20190924Z-2ce653",
  "org.scalablytyped.slinky" %%% "imagemin-optipng" % "5.2-dt-20180825Z-3f8a54",
  "org.scalablytyped.slinky" %%% "imagemin-svgo" % "7.0-dt-20180825Z-6663b2",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "svgo" % "1.3-dt-20200331Z-cb4204")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
