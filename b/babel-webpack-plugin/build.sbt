organization := "org.scalablytyped.slinky"
name := "babel-webpack-plugin"
version := "0.1-dt-20200515Z-d644d4"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "anymatch" % "1.3-dt-20200515Z-2c3c09",
  "org.scalablytyped.slinky" %%% "babel-core" % "6.25-dt-20200226Z-b9aeef",
  "org.scalablytyped.slinky" %%% "babel-generator" % "6.25-dt-20200515Z-055e84",
  "org.scalablytyped.slinky" %%% "babel-template" % "6.25-dt-20200226Z-c5afcf",
  "org.scalablytyped.slinky" %%% "babel-traverse" % "6.25-dt-20200515Z-f999c9",
  "org.scalablytyped.slinky" %%% "babel-types" % "7.0-dt-20200515Z-5eda48",
  "org.scalablytyped.slinky" %%% "babylon" % "6.16-dt-20200226Z-df95b9",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "source-list-map" % "v0.1.6-dt-20200515Z-c6cc21",
  "org.scalablytyped.slinky" %%% "source-map" % "0.7.3-ba4eed",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0",
  "org.scalablytyped.slinky" %%% "tapable" % "v1.0.0-dt-20200515Z-780548",
  "org.scalablytyped.slinky" %%% "uglify-js" % "3.9-dt-20200519Z-6f8d3e",
  "org.scalablytyped.slinky" %%% "webpack" % "4.41-dt-20200515Z-8e5d2e",
  "org.scalablytyped.slinky" %%% "webpack-sources" % "0.1-dt-20200515Z-96d9b2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
