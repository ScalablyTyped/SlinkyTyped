organization := "org.scalablytyped.slinky"
name := "postcss-load-config"
version := "2.0-dt-20191112Z-227e37"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "cosmiconfig" % "6.0.0-f1bd66",
  "org.scalablytyped.slinky" %%% "postcss" % "7.0.18-22585d",
  "org.scalablytyped.slinky" %%% "source-map" % "0.7.3-63359b",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
