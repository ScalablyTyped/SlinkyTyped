organization := "org.scalablytyped.slinky"
name := "falcor-router"
version := "0.8-dt-20190711Z-2ea753"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "falcor" % "2.0-dt-20190711Z-162f05",
  "org.scalablytyped.slinky" %%% "falcor-http-datasource" % "0.1.3-dt-20190711Z-94b13a",
  "org.scalablytyped.slinky" %%% "falcor-json-graph" % "1.1.7-dt-20190711Z-ff293b",
  "org.scalablytyped.slinky" %%% "rx-core" % "4.0-dt-20190322Z-d1e9a9",
  "org.scalablytyped.slinky" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-caa49f",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        