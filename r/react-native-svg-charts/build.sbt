organization := "org.scalablytyped.slinky"
name := "react-native-svg-charts"
version := "5.0-dt-20200225Z-4d4dc0"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-89abae",
  "org.scalablytyped.slinky" %%% "d3-path" % "1.0-dt-20190212Z-d2685e",
  "org.scalablytyped.slinky" %%% "d3-scale" % "2.1-dt-20200225Z-f1e06a",
  "org.scalablytyped.slinky" %%% "d3-shape" % "1.3-dt-20200225Z-89737c",
  "org.scalablytyped.slinky" %%% "d3-time" % "1.0-dt-20190212Z-09a575",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-6bb503",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200227Z-f18fda",
  "org.scalablytyped.slinky" %%% "react-native" % "0.61-dt-20200225Z-1e97be",
  "org.scalablytyped.slinky" %%% "react-native-svg" % "9.13.6-274f6a",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
