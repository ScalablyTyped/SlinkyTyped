organization := "org.scalablytyped.slinky"
name := "babelify"
version := "v7.3.0-dt-20200225Z-b6f276"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "babel-core" % "6.25-dt-20200226Z-544ca1",
  "org.scalablytyped.slinky" %%% "babel-generator" % "6.25-dt-20200226Z-3dde5d",
  "org.scalablytyped.slinky" %%% "babel-template" % "6.25-dt-20200226Z-705f46",
  "org.scalablytyped.slinky" %%% "babel-traverse" % "6.25-dt-20190212Z-ea109e",
  "org.scalablytyped.slinky" %%% "babel-types" % "7.0-dt-20190424Z-7d07c4",
  "org.scalablytyped.slinky" %%% "babylon" % "6.16-dt-20200226Z-c2b6b5",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
