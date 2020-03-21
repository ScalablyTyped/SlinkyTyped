organization := "org.scalablytyped.slinky"
name := "restify-cors-middleware"
version := "1.0-dt-20180214Z-37cb28"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "bunyan" % "1.8-dt-20200226Z-a7f935",
  "org.scalablytyped.slinky" %%% "formidable" % "1.0.16-dt-20200225Z-8efb65",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "restify" % "8.4-dt-20200225Z-cf271e",
  "org.scalablytyped.slinky" %%% "spdy" % "3.4-dt-20200227Z-259214",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
