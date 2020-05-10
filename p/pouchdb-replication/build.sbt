organization := "org.scalablytyped.slinky"
name := "pouchdb-replication"
version := "6.4-dt-20200226Z-df8dec"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "debug" % "4.1-dt-20200226Z-645012",
  "org.scalablytyped.slinky" %%% "pouchdb-core" % "7.0-dt-20200225Z-4bd34e",
  "org.scalablytyped.slinky" %%% "pouchdb-find" % "6.3-dt-20200225Z-2e72cf",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
