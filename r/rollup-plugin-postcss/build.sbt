organization := "org.scalablytyped.slinky"
name := "rollup-plugin-postcss"
version := "2.0-dt-20200225Z-e8c541"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "cssnano" % "4.0-dt-20180802Z-8af7ba",
  "org.scalablytyped.slinky" %%% "estree" % "0.0-unknown-dt-20200320Z-9738bf",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "postcss" % "7.0.18-05f317",
  "org.scalablytyped.slinky" %%% "rollup" % "1.32.1-20e39f",
  "org.scalablytyped.slinky" %%% "source-map" % "0.7.3-53abfb",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
