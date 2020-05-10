organization := "org.scalablytyped.slinky"
name := "router5"
version := "7.0.2-413e08"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "path-parser" % "4.2.0-7b80ae",
  "org.scalablytyped.slinky" %%% "route-node" % "3.4.2-59a0c1",
  "org.scalablytyped.slinky" %%% "router5-transition-path" % "7.0.1-2ee31a",
  "org.scalablytyped.slinky" %%% "search-params" % "2.1.3-d5aed0",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
