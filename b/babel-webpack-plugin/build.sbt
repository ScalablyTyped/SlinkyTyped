organization := "org.scalablytyped.slinky"
name := "babel-webpack-plugin"
version := "0.1-dt-20180611Z-20a76c"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "anymatch" % "1.3-dt-20190212Z-69059c",
  "org.scalablytyped.slinky" %%% "babel-core" % "6.25-dt-20200226Z-3bed32",
  "org.scalablytyped.slinky" %%% "babel-generator" % "6.25-dt-20200226Z-39a72a",
  "org.scalablytyped.slinky" %%% "babel-template" % "6.25-dt-20200226Z-513363",
  "org.scalablytyped.slinky" %%% "babel-traverse" % "6.25-dt-20190212Z-0a7cc0",
  "org.scalablytyped.slinky" %%% "babel-types" % "7.0-dt-20190424Z-21d6e2",
  "org.scalablytyped.slinky" %%% "babylon" % "6.16-dt-20200226Z-0a39b5",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "source-list-map" % "v0.1.6-dt-20200225Z-3feb4d",
  "org.scalablytyped.slinky" %%% "source-map" % "0.7.3-53abfb",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "tapable" % "v1.0.0-dt-20200225Z-750916",
  "org.scalablytyped.slinky" %%% "uglify-js" % "3.9-dt-20200413Z-c67f3d",
  "org.scalablytyped.slinky" %%% "webpack" % "4.41-dt-20200418Z-852cfb",
  "org.scalablytyped.slinky" %%% "webpack-sources" % "0.1-dt-20200323Z-21d450")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
