organization := "org.scalablytyped.slinky"
name := "router5"
version := "7.0.2-0d6d7c"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "path-parser" % "4.2.0-ab52f4",
  "org.scalablytyped.slinky" %%% "route-node" % "3.4.2-04ac3c",
  "org.scalablytyped.slinky" %%% "router5-transition-path" % "7.0.1-4be300",
  "org.scalablytyped.slinky" %%% "search-params" % "2.1.3-927bd7",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
