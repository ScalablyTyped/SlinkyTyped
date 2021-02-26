organization := "org.scalablytyped.slinky"
name := "babel-webpack-plugin"
version := "0.1-dt-20200515Z-a8c48d"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "babel-core" % "6.25-dt-20200226Z-abeb0f",
  "org.scalablytyped.slinky" %%% "babel-generator" % "6.25-dt-20200515Z-8957d9",
  "org.scalablytyped.slinky" %%% "babel-template" % "6.25-dt-20200226Z-ad479f",
  "org.scalablytyped.slinky" %%% "babel-traverse" % "6.25-dt-20200515Z-dca7d7",
  "org.scalablytyped.slinky" %%% "babel-types" % "7.0-dt-20200902Z-1391d5",
  "org.scalablytyped.slinky" %%% "babylon" % "6.16-dt-20200226Z-687f36",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
