organization := "org.scalablytyped.slinky"
name := "roads-server"
version := "1.0.3-967778"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "babel-core" % "6.25-dt-20200226Z-48ea0b",
  "org.scalablytyped.slinky" %%% "babel-generator" % "6.25-dt-20200515Z-8db44a",
  "org.scalablytyped.slinky" %%% "babel-template" % "6.25-dt-20200226Z-7714de",
  "org.scalablytyped.slinky" %%% "babel-traverse" % "6.25-dt-20200515Z-621db8",
  "org.scalablytyped.slinky" %%% "babel-types" % "7.0-dt-20200706Z-514bff",
  "org.scalablytyped.slinky" %%% "babelify" % "v7.3.0-dt-20200515Z-8d193a",
  "org.scalablytyped.slinky" %%% "babylon" % "6.16-dt-20200226Z-31ab2d",
  "org.scalablytyped.slinky" %%% "browserify" % "12.0-dt-20200515Z-bcbb64",
  "org.scalablytyped.slinky" %%% "cookie" % "0.4-dt-20200513Z-81a894",
  "org.scalablytyped.slinky" %%% "insert-module-globals" % "7.0-dt-20200515Z-c1c301",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "roads" % "6.2.6-58d824",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
