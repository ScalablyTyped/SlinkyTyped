organization := "org.scalablytyped.slinky"
name := "mongoose-delete"
version := "0.5-dt-20190812Z-11b8ed"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "bson" % "4.0-dt-20200225Z-c3747a",
  "org.scalablytyped.slinky" %%% "mongodb" % "3.5-dt-20200302Z-10e7bd",
  "org.scalablytyped.slinky" %%% "mongoose" % "5.7.12-dt-20200227Z-748469",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
