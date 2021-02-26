organization := "org.scalablytyped.slinky"
name := "poi"
version := "12.5-dt-20190414Z-09b007"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-a3cce0",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20201002Z-671a3f",
  "org.scalablytyped.slinky" %%% "connect-history-api-fallback" % "1.3-dt-20200515Z-d5d121",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20201111Z-1b328b",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200921Z-935502",
  "org.scalablytyped.slinky" %%% "html-minifier-terser" % "5.1-dt-20200923Z-fadb61",
  "org.scalablytyped.slinky" %%% "html-webpack-plugin" % "4.5.0-d494f9",
  "org.scalablytyped.slinky" %%% "http-proxy" % "1.17-dt-20200320Z-54e789",
  "org.scalablytyped.slinky" %%% "http-proxy-middleware" % "0.19-dt-20200515Z-16a474",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20200722Z-25c5b2",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20201002Z-9bc0d9",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20201002Z-d58f66",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20201117Z-7353a1",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "tapable" % "v1.0.0-dt-20201002Z-2c081c",
  "org.scalablytyped.slinky" %%% "webpack-chain" % "6.5.1-373d80",
  "org.scalablytyped.slinky" %%% "webpack-dev-server" % "3.11-dt-20201030Z-fc1333")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
