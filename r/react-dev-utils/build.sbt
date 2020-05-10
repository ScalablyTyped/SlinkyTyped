organization := "org.scalablytyped.slinky"
name := "react-dev-utils"
version := "9.0-dt-20200213Z-a4ad5d"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "anymatch" % "1.3-dt-20190212Z-0c158e",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-e2128c",
  "org.scalablytyped.slinky" %%% "clean-css" % "4.2-dt-20200226Z-6016a2",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200226Z-196a23",
  "org.scalablytyped.slinky" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-f37102",
  "org.scalablytyped.slinky" %%% "eslint" % "6.8-dt-20200406Z-369fd1",
  "org.scalablytyped.slinky" %%% "estree" % "0.0-unknown-dt-20200320Z-3b5711",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20200409Z-5ef924",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200415Z-f286fc",
  "org.scalablytyped.slinky" %%% "html-minifier" % "3.5-dt-20200226Z-9f5145",
  "org.scalablytyped.slinky" %%% "html-webpack-plugin" % "3.2-dt-20200129Z-b3a9ce",
  "org.scalablytyped.slinky" %%% "http-proxy" % "1.17-dt-20200320Z-06fe3f",
  "org.scalablytyped.slinky" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-57cdc7",
  "org.scalablytyped.slinky" %%% "json-schema" % "7.0-dt-20200225Z-f81d2c",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20191126Z-46fc76",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20200225Z-632c59",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-3e2563",
  "org.scalablytyped.slinky" %%% "relateurl" % "v0.2.6-dt-20200227Z-aa0285",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20200227Z-16be36",
  "org.scalablytyped.slinky" %%% "source-list-map" % "v0.1.6-dt-20200225Z-780bcc",
  "org.scalablytyped.slinky" %%% "source-map" % "0.7.3-cd3c83",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e",
  "org.scalablytyped.slinky" %%% "tapable" % "v1.0.0-dt-20200225Z-9a5280",
  "org.scalablytyped.slinky" %%% "uglify-js" % "3.9-dt-20200413Z-a34c26",
  "org.scalablytyped.slinky" %%% "webpack" % "4.41-dt-20200418Z-5d7c48",
  "org.scalablytyped.slinky" %%% "webpack-dev-server" % "3.10-dt-20200312Z-4f79d5",
  "org.scalablytyped.slinky" %%% "webpack-sources" % "0.1-dt-20200323Z-0b1523")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
