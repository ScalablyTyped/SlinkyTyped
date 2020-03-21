organization := "org.scalablytyped.slinky"
name := "mongodb-memory-server"
version := "6.2.4-7086eb"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "bson" % "4.0-dt-20200225Z-c3747a",
  "org.scalablytyped.slinky" %%% "https-proxy-agent" % "2.2.2-6055c9",
  "org.scalablytyped.slinky" %%% "mongodb" % "3.5-dt-20200302Z-10e7bd",
  "org.scalablytyped.slinky" %%% "mongodb-memory-server-core" % "6.2.4-4d51c2",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "tmp" % "0.1-dt-20200227Z-eabf0b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
