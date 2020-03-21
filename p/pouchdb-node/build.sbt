organization := "org.scalablytyped.slinky"
name := "pouchdb-node"
version := "6.1-dt-20200226Z-e45f53"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "debug" % "4.1-dt-20200226Z-963250",
  "org.scalablytyped.slinky" %%% "pouchdb-core" % "7.0-dt-20200225Z-a3d6f5",
  "org.scalablytyped.slinky" %%% "pouchdb-find" % "6.3-dt-20200225Z-a65514",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
