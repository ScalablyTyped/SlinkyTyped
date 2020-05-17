organization := "org.scalablytyped.slinky"
name := "backbone_dot_radio"
version := "0.8-dt-20200225Z-007b98"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "backbone" % "1.4-dt-20200225Z-fc364e",
  "org.scalablytyped.slinky" %%% "jquery" % "3.3-dt-20200427Z-6ecf75",
  "org.scalablytyped.slinky" %%% "sizzle" % "2.3-dt-20181006Z-61c165",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "underscore" % "1.9-dt-20200225Z-0dfaca")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
