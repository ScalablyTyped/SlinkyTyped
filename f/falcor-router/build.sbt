organization := "org.scalablytyped.slinky"
name := "falcor-router"
version := "0.8-dt-20200226Z-6d681c"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "falcor" % "2.0-dt-20200225Z-bcd1f4",
  "org.scalablytyped.slinky" %%% "falcor-http-datasource" % "0.1.3-dt-20200226Z-0ea1e9",
  "org.scalablytyped.slinky" %%% "falcor-json-graph" % "1.1.7-dt-20200226Z-2177df",
  "org.scalablytyped.slinky" %%% "rx-core" % "4.0-dt-20200225Z-5c3f0e",
  "org.scalablytyped.slinky" %%% "rx-lite-aggregates" % "4.0-dt-20200225Z-57033c",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
