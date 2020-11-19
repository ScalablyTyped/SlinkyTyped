organization := "org.scalablytyped.slinky"
name := "react-dev-utils"
version := "9.0-dt-20200213Z-5659e3"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-e4419c",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200515Z-41abee",
  "org.scalablytyped.slinky" %%% "connect-history-api-fallback" % "1.3-dt-20200515Z-0d785c",
  "org.scalablytyped.slinky" %%% "eslint" % "7.2-dt-20200611Z-2afd5d",
  "org.scalablytyped.slinky" %%% "estree" % "0.0-unknown-dt-20200623Z-5f5d40",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20200706Z-a5f9b2",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200722Z-5cbccc",
  "org.scalablytyped.slinky" %%% "html-minifier-terser" % "5.1-dt-20200504Z-7809a8",
  "org.scalablytyped.slinky" %%% "html-webpack-plugin" % "4.3.0-8bd0fe",
  "org.scalablytyped.slinky" %%% "http-proxy" % "1.17-dt-20200320Z-c2a039",
  "org.scalablytyped.slinky" %%% "http-proxy-middleware" % "0.19-dt-20200515Z-8cdd2e",
  "org.scalablytyped.slinky" %%% "json-schema" % "7.0-dt-20200609Z-d26060",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20200722Z-600803",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20200519Z-524837",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-18f701",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20200519Z-04f03f",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "tapable" % "v1.0.0-dt-20200616Z-a2f134",
  "org.scalablytyped.slinky" %%% "webpack-dev-server" % "3.11-dt-20200521Z-423f0b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
