organization := "org.scalablytyped.slinky"
name := "gulp-cache"
version := "v0.4.5-dt-20200225Z-75eadc"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "chalk" % "2.4.2-07d6c9",
  "org.scalablytyped.slinky" %%% "gulp-util" % "3.0-dt-20200226Z-12c088",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "through2" % "2.0-dt-20200227Z-94ff24",
  "org.scalablytyped.slinky" %%% "vinyl" % "2.0-dt-20200225Z-55c259")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
