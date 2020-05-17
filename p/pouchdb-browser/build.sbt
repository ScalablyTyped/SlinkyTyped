organization := "org.scalablytyped.slinky"
name := "pouchdb-browser"
version := "6.1-dt-20200226Z-d4ca58"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "debug" % "4.1-dt-20200226Z-c08a13",
  "org.scalablytyped.slinky" %%% "pouchdb-core" % "7.0-dt-20200225Z-8c3df3",
  "org.scalablytyped.slinky" %%% "pouchdb-find" % "6.3-dt-20200225Z-32dfcb",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
