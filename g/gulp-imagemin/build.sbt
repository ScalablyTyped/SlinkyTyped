organization := "org.scalablytyped.slinky"
name := "gulp-imagemin"
version := "7.0-dt-20200228Z-9bad5a"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "imagemin" % "7.0-dt-20190909Z-4bb431",
  "org.scalablytyped.slinky" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-6bc4ec",
  "org.scalablytyped.slinky" %%% "imagemin-mozjpeg" % "8.0-dt-20190924Z-a8400a",
  "org.scalablytyped.slinky" %%% "imagemin-optipng" % "5.2-dt-20180825Z-49f9dd",
  "org.scalablytyped.slinky" %%% "imagemin-svgo" % "7.0-dt-20180825Z-44a486",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "svgo" % "1.3-dt-20200515Z-45b0ca")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
