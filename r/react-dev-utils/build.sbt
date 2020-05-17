organization := "org.scalablytyped.slinky"
name := "react-dev-utils"
version := "9.0-dt-20200213Z-7af9ba"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "anymatch" % "1.3-dt-20190212Z-69059c",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-ef676c",
  "org.scalablytyped.slinky" %%% "clean-css" % "4.2-dt-20200226Z-69bac8",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200226Z-fe7436",
  "org.scalablytyped.slinky" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-22c509",
  "org.scalablytyped.slinky" %%% "eslint" % "6.8-dt-20200406Z-514493",
  "org.scalablytyped.slinky" %%% "estree" % "0.0-unknown-dt-20200320Z-9738bf",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20200409Z-223215",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200415Z-cfdf0c",
  "org.scalablytyped.slinky" %%% "html-minifier" % "3.5-dt-20200226Z-02f4da",
  "org.scalablytyped.slinky" %%% "html-webpack-plugin" % "3.2-dt-20200129Z-c72911",
  "org.scalablytyped.slinky" %%% "http-proxy" % "1.17-dt-20200320Z-188def",
  "org.scalablytyped.slinky" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-e23a7f",
  "org.scalablytyped.slinky" %%% "json-schema" % "7.0-dt-20200225Z-45667d",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20191126Z-d94a1a",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20200225Z-413bcb",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-34f923",
  "org.scalablytyped.slinky" %%% "relateurl" % "v0.2.6-dt-20200227Z-f6a145",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20200227Z-51c95d",
  "org.scalablytyped.slinky" %%% "source-list-map" % "v0.1.6-dt-20200225Z-3feb4d",
  "org.scalablytyped.slinky" %%% "source-map" % "0.7.3-53abfb",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "tapable" % "v1.0.0-dt-20200225Z-750916",
  "org.scalablytyped.slinky" %%% "uglify-js" % "3.9-dt-20200413Z-c67f3d",
  "org.scalablytyped.slinky" %%% "webpack" % "4.41-dt-20200418Z-852cfb",
  "org.scalablytyped.slinky" %%% "webpack-dev-server" % "3.10-dt-20200312Z-28ba57",
  "org.scalablytyped.slinky" %%% "webpack-sources" % "0.1-dt-20200323Z-21d450")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
