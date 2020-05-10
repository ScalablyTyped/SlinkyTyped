organization := "org.scalablytyped.slinky"
name := "browser-sync-webpack-plugin"
version := "2.2-dt-20190722Z-63ad77"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "anymatch" % "1.3-dt-20190212Z-0c158e",
  "org.scalablytyped.slinky" %%% "browser-sync" % "2.26-dt-20200226Z-c015da",
  "org.scalablytyped.slinky" %%% "chokidar" % "3.3.1-f1f0ab",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200415Z-f286fc",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20191126Z-46fc76",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-3e2563",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20200227Z-16be36",
  "org.scalablytyped.slinky" %%% "source-list-map" % "v0.1.6-dt-20200225Z-780bcc",
  "org.scalablytyped.slinky" %%% "source-map" % "0.7.3-cd3c83",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e",
  "org.scalablytyped.slinky" %%% "tapable" % "v1.0.0-dt-20200225Z-9a5280",
  "org.scalablytyped.slinky" %%% "uglify-js" % "3.9-dt-20200413Z-a34c26",
  "org.scalablytyped.slinky" %%% "webpack" % "4.41-dt-20200418Z-5d7c48",
  "org.scalablytyped.slinky" %%% "webpack-sources" % "0.1-dt-20200323Z-0b1523")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
