organization := "org.scalablytyped.slinky"
name := "gulp-imagemin"
version := "7.0-dt-20200228Z-998417"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "imagemin" % "7.0-dt-20190909Z-346245",
  "org.scalablytyped.slinky" %%% "imagemin-gifsicle" % "7.0-dt-20201001Z-515a83",
  "org.scalablytyped.slinky" %%% "imagemin-mozjpeg" % "8.0-dt-20190924Z-dd627d",
  "org.scalablytyped.slinky" %%% "imagemin-optipng" % "5.2-dt-20180825Z-8739ed",
  "org.scalablytyped.slinky" %%% "imagemin-svgo" % "8.0-dt-20200930Z-820fca",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "svgo" % "1.3-dt-20200515Z-3ece59")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
