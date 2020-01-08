organization := "org.scalablytyped.slinky"
name := "plottable"
version := "3.8.6-5cc85b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "d3-collection" % "1.0-dt-20190212Z-36e2c3",
  "org.scalablytyped.slinky" %%% "d3-path" % "1.0-dt-20190212Z-4a26d0",
  "org.scalablytyped.slinky" %%% "d3-selection" % "1.4-dt-20190710Z-e8dbdc",
  "org.scalablytyped.slinky" %%% "d3-shape" % "1.3-dt-20191014Z-2eabec",
  "org.scalablytyped.slinky" %%% "d3-time" % "1.0-dt-20190212Z-c0c9de",
  "org.scalablytyped.slinky" %%% "d3-transition" % "1.1-dt-20191029Z-98e406",
  "org.scalablytyped.slinky" %%% "lodash" % "4.14-dt-20191126Z-643ed0",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43",
  "org.scalablytyped.slinky" %%% "typesettable" % "4.1.0-e66d9c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        