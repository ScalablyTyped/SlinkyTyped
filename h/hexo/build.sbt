organization := "org.scalablytyped.slinky"
name := "hexo"
version := "3.8-dt-20200225Z-f93dcc"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "bunyan" % "1.8-dt-20200226Z-a7f935",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200226Z-b2d5a0",
  "org.scalablytyped.slinky" %%% "hexo-util" % "0.6-dt-20190808Z-c14072",
  "org.scalablytyped.slinky" %%% "minimist" % "1.2.0-dt-20200225Z-1245f0",
  "org.scalablytyped.slinky" %%% "moment" % "2.24.0-ca8f54",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "underscore" % "1.9-dt-20200225Z-01d58c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
