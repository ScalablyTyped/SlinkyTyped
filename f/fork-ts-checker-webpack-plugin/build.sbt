organization := "org.scalablytyped.slinky"
name := "fork-ts-checker-webpack-plugin"
version := "1.6.0-6e110b"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "anymatch" % "1.3-dt-20190212Z-015d8e",
  "org.scalablytyped.slinky" %%% "eslint" % "6.1-dt-20200204Z-6e88a0",
  "org.scalablytyped.slinky" %%% "estree" % "0.0-unknown-dt-20200225Z-7e1416",
  "org.scalablytyped.slinky" %%% "json-schema" % "7.0-dt-20200225Z-5972e0",
  "org.scalablytyped.slinky" %%% "minimatch" % "3.0-dt-20200226Z-befe22",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "source-list-map" % "v0.1.6-dt-20200225Z-ebe192",
  "org.scalablytyped.slinky" %%% "source-map" % "0.7.3-63359b",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "tapable" % "v1.0.0-dt-20200225Z-a8b959",
  "org.scalablytyped.slinky" %%% "tslint" % "5.20.1-1c7b91",
  "org.scalablytyped.slinky" %%% "typescript" % "3.8.2-65a561",
  "org.scalablytyped.slinky" %%% "uglify-js" % "3.0-dt-20200225Z-ae4d9a",
  "org.scalablytyped.slinky" %%% "webpack" % "4.41-dt-20200227Z-6dbb07",
  "org.scalablytyped.slinky" %%% "webpack-sources" % "0.1-dt-20200225Z-2c39c2",
  "org.scalablytyped.slinky" %%% "worker-rpc" % "0.1.1-a76203")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
