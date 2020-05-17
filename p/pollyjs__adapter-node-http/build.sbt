organization := "org.scalablytyped.slinky"
name := "pollyjs__adapter-node-http"
version := "2.0-dt-20200225Z-202643"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "pollyjs__adapter" % "3.0-dt-20200225Z-a9eac1",
  "org.scalablytyped.slinky" %%% "pollyjs__core" % "4.0-dt-20200125Z-d5bb5b",
  "org.scalablytyped.slinky" %%% "pollyjs__persister" % "2.0-dt-20200225Z-a5d168",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
