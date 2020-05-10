organization := "org.scalablytyped.slinky"
name := "d3-graphviz"
version := "2.6-dt-20200103Z-13c18a"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "d3-color" % "1.2-dt-20200225Z-51b5d1",
  "org.scalablytyped.slinky" %%% "d3-interpolate" % "1.3-dt-20200225Z-8c41c6",
  "org.scalablytyped.slinky" %%% "d3-selection" % "1.4-dt-20200320Z-19e9d5",
  "org.scalablytyped.slinky" %%% "d3-transition" % "1.1-dt-20200225Z-2d1346",
  "org.scalablytyped.slinky" %%% "d3-zoom" % "1.7-dt-20200225Z-ccf288",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
