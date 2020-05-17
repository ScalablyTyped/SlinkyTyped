organization := "org.scalablytyped.slinky"
name := "dagre-d3"
version := "0.4-dt-20200226Z-835796"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "d3-selection" % "1.4-dt-20200320Z-176a7c",
  "org.scalablytyped.slinky" %%% "d3-transition" % "1.1-dt-20200225Z-299d57",
  "org.scalablytyped.slinky" %%% "dagre" % "0.7-dt-20200320Z-65c34b",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
