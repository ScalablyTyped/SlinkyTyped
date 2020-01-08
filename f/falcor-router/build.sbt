organization := "org.scalablytyped.slinky"
name := "falcor-router"
version := "0.8-dt-20190711Z-1bc83d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "falcor" % "2.0-dt-20190711Z-c3fc6b",
  "org.scalablytyped.slinky" %%% "falcor-http-datasource" % "0.1.3-dt-20190711Z-94b13a",
  "org.scalablytyped.slinky" %%% "falcor-json-graph" % "1.1.7-dt-20190711Z-35859a",
  "org.scalablytyped.slinky" %%% "rx-core" % "4.0-dt-20190322Z-c54414",
  "org.scalablytyped.slinky" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-9f4edf",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        