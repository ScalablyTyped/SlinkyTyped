organization := "org.scalablytyped.slinky"
name := "react-loadable-visibility"
version := "3.0-dt-20191126Z-042312"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "anymatch" % "1.3-dt-20190212Z-015d8e",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-89abae",
  "org.scalablytyped.slinky" %%% "loadable__component" % "5.10-dt-20190711Z-dbb64b",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-6bb503",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200227Z-f18fda",
  "org.scalablytyped.slinky" %%% "react-loadable" % "5.5-dt-20200225Z-b15843",
  "org.scalablytyped.slinky" %%% "source-list-map" % "v0.1.6-dt-20200225Z-ebe192",
  "org.scalablytyped.slinky" %%% "source-map" % "0.7.3-63359b",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "tapable" % "v1.0.0-dt-20200225Z-a8b959",
  "org.scalablytyped.slinky" %%% "uglify-js" % "3.0-dt-20200225Z-ae4d9a",
  "org.scalablytyped.slinky" %%% "webpack" % "4.41-dt-20200227Z-6dbb07",
  "org.scalablytyped.slinky" %%% "webpack-sources" % "0.1-dt-20200225Z-2c39c2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
