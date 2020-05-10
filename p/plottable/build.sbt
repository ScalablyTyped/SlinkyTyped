organization := "org.scalablytyped.slinky"
name := "plottable"
version := "3.8.6-51ae4f"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "d3-collection" % "1.0-dt-20200225Z-896f87",
  "org.scalablytyped.slinky" %%% "d3-path" % "1.0-dt-20190212Z-ba2ed4",
  "org.scalablytyped.slinky" %%% "d3-selection" % "1.4-dt-20200320Z-19e9d5",
  "org.scalablytyped.slinky" %%% "d3-shape" % "1.3-dt-20200225Z-061c72",
  "org.scalablytyped.slinky" %%% "d3-time" % "1.0-dt-20190212Z-ed2685",
  "org.scalablytyped.slinky" %%% "d3-transition" % "1.1-dt-20200225Z-2d1346",
  "org.scalablytyped.slinky" %%% "lodash" % "4.14-dt-20200417Z-4d62ba",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e",
  "org.scalablytyped.slinky" %%% "typesettable" % "4.1.0-7accc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
