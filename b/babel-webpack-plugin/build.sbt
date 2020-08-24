organization := "org.scalablytyped.slinky"
name := "babel-webpack-plugin"
version := "0.1-dt-20200515Z-2235dd"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "babel-core" % "6.25-dt-20200226Z-b7b3fc",
  "org.scalablytyped.slinky" %%% "babel-generator" % "6.25-dt-20200515Z-c68838",
  "org.scalablytyped.slinky" %%% "babel-template" % "6.25-dt-20200226Z-9e8d6e",
  "org.scalablytyped.slinky" %%% "babel-traverse" % "6.25-dt-20200515Z-534c1a",
  "org.scalablytyped.slinky" %%% "babel-types" % "7.0-dt-20200706Z-7f53dc",
  "org.scalablytyped.slinky" %%% "babylon" % "6.16-dt-20200226Z-1783d7",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
