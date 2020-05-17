organization := "org.scalablytyped.slinky"
name := "gulp-htmlmin"
version := "v1.3.0-dt-20200226Z-b48838"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "clean-css" % "4.2-dt-20200226Z-69bac8",
  "org.scalablytyped.slinky" %%% "html-minifier" % "3.5-dt-20200226Z-02f4da",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "relateurl" % "v0.2.6-dt-20200227Z-f6a145",
  "org.scalablytyped.slinky" %%% "source-map" % "0.7.3-53abfb",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "uglify-js" % "3.9-dt-20200413Z-c67f3d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
