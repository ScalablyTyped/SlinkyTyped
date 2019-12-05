organization := "org.scalablytyped.slinky"
name := "plottable"
version := "3.8.6-60aa10"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "d3-collection" % "1.0-dt-20190212Z-47278e",
  "org.scalablytyped.slinky" %%% "d3-path" % "1.0-dt-20190212Z-a293de",
  "org.scalablytyped.slinky" %%% "d3-selection" % "1.4-dt-20190710Z-7ae6a9",
  "org.scalablytyped.slinky" %%% "d3-shape" % "1.3-dt-20191014Z-1b83e3",
  "org.scalablytyped.slinky" %%% "d3-time" % "1.0-dt-20190212Z-8ceaf1",
  "org.scalablytyped.slinky" %%% "d3-transition" % "1.1-dt-20191029Z-7c1da9",
  "org.scalablytyped.slinky" %%% "lodash" % "4.14-dt-20191126Z-7d8796",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821",
  "org.scalablytyped.slinky" %%% "typesettable" % "4.1.0-f51cc1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        