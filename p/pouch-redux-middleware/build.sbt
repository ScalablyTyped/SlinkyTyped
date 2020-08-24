organization := "org.scalablytyped.slinky"
name := "pouch-redux-middleware"
version := "1.2-dt-20200515Z-d76197"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "debug" % "4.1-dt-20200226Z-b1f8de",
  "org.scalablytyped.slinky" %%% "pouchdb-core" % "7.0-dt-20200519Z-e0104a",
  "org.scalablytyped.slinky" %%% "pouchdb-find" % "6.3-dt-20200515Z-15eb67",
  "org.scalablytyped.slinky" %%% "redux" % "4.0.5-1ae70d",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
