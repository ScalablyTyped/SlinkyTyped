organization := "org.scalablytyped.slinky"
name := "pouchdb-mapreduce"
version := "6.1-dt-20200515Z-71e552"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "debug" % "4.1-dt-20200226Z-08f2a7",
  "org.scalablytyped.slinky" %%% "pouchdb-core" % "7.0-dt-20200519Z-3f6152",
  "org.scalablytyped.slinky" %%% "pouchdb-find" % "6.3-dt-20200515Z-df29be",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
