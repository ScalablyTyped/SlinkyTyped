organization := "org.scalablytyped.slinky"
name := "rollup-plugin-postcss"
version := "2.0-dt-20200225Z-d33e2a"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "cssnano" % "4.0-dt-20180802Z-36eb17",
  "org.scalablytyped.slinky" %%% "estree" % "0.0-unknown-dt-20200225Z-7e1416",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "postcss" % "7.0.18-22585d",
  "org.scalablytyped.slinky" %%% "rollup" % "1.31.1-0097d2",
  "org.scalablytyped.slinky" %%% "source-map" % "0.7.3-63359b",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
