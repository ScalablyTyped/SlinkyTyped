organization := "org.scalablytyped.slinky"
name := "plottable"
version := "3.8.6-de13f9"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "d3-collection" % "1.0-dt-20200225Z-d89df2",
  "org.scalablytyped.slinky" %%% "d3-path" % "1.0-dt-20190212Z-709f0d",
  "org.scalablytyped.slinky" %%% "d3-selection" % "1.4-dt-20200320Z-176a7c",
  "org.scalablytyped.slinky" %%% "d3-shape" % "1.3-dt-20200225Z-1b0c16",
  "org.scalablytyped.slinky" %%% "d3-time" % "1.0-dt-20190212Z-dc4671",
  "org.scalablytyped.slinky" %%% "d3-transition" % "1.1-dt-20200225Z-299d57",
  "org.scalablytyped.slinky" %%% "lodash" % "4.14-dt-20200417Z-5a7e1e",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "typesettable" % "4.1.0-0bdb99")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
