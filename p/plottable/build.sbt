organization := "org.scalablytyped.slinky"
name := "plottable"
version := "3.8.6-c324eb"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "d3-collection" % "1.0-dt-20200225Z-6911bb",
  "org.scalablytyped.slinky" %%% "d3-path" % "1.0-dt-20190212Z-d2685e",
  "org.scalablytyped.slinky" %%% "d3-selection" % "1.4-dt-20200225Z-ac6795",
  "org.scalablytyped.slinky" %%% "d3-shape" % "1.3-dt-20200225Z-89737c",
  "org.scalablytyped.slinky" %%% "d3-time" % "1.0-dt-20190212Z-09a575",
  "org.scalablytyped.slinky" %%% "d3-transition" % "1.1-dt-20200225Z-30d6dd",
  "org.scalablytyped.slinky" %%% "lodash" % "4.14-dt-20200302Z-29d3df",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "typesettable" % "4.1.0-9df925")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
