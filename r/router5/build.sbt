organization := "org.scalablytyped.slinky"
name := "router5"
version := "7.0.2-ac135e"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "path-parser" % "4.2.0-d9ea5c",
  "org.scalablytyped.slinky" %%% "route-node" % "3.4.2-e03300",
  "org.scalablytyped.slinky" %%% "router5-transition-path" % "7.0.1-f3aad1",
  "org.scalablytyped.slinky" %%% "search-params" % "2.1.3-e1b648",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
