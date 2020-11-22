organization := "org.scalablytyped.slinky"
name := "pouchdb"
version := "6.4-dt-20200304Z-9ecd83"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "debug" % "4.1-dt-20200226Z-794065",
  "org.scalablytyped.slinky" %%% "pouchdb-adapter-fruitdown" % "6.1-dt-20200515Z-2476ac",
  "org.scalablytyped.slinky" %%% "pouchdb-core" % "7.0-dt-20200519Z-60ec9e",
  "org.scalablytyped.slinky" %%% "pouchdb-find" % "6.3-dt-20200728Z-398565",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
