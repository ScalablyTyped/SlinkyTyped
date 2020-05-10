organization := "org.scalablytyped.slinky"
name := "gulp-imagemin"
version := "7.0-dt-20200228Z-060a82"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "imagemin" % "7.0-dt-20190909Z-ce240f",
  "org.scalablytyped.slinky" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-879689",
  "org.scalablytyped.slinky" %%% "imagemin-mozjpeg" % "8.0-dt-20190924Z-f716d7",
  "org.scalablytyped.slinky" %%% "imagemin-optipng" % "5.2-dt-20180825Z-c34b7a",
  "org.scalablytyped.slinky" %%% "imagemin-svgo" % "7.0-dt-20180825Z-476a05",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e",
  "org.scalablytyped.slinky" %%% "svgo" % "1.3-dt-20200331Z-53b09f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
