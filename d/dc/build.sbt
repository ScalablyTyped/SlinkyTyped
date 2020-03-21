organization := "org.scalablytyped.slinky"
name := "dc"
version := "0.0-unknown-dt-20200226Z-a7de52"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "d3-color" % "1.2-dt-20200225Z-8511a4",
  "org.scalablytyped.slinky" %%% "d3-selection" % "1.4-dt-20200225Z-ac6795",
  "org.scalablytyped.slinky" %%% "d3-transition" % "1.1-dt-20200225Z-30d6dd",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
