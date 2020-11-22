organization := "org.scalablytyped.slinky"
name := "babel-webpack-plugin"
version := "0.1-dt-20200515Z-76dd5f"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "babel-core" % "6.25-dt-20200226Z-73b25f",
  "org.scalablytyped.slinky" %%% "babel-generator" % "6.25-dt-20200515Z-3b2d20",
  "org.scalablytyped.slinky" %%% "babel-template" % "6.25-dt-20200226Z-8ce283",
  "org.scalablytyped.slinky" %%% "babel-traverse" % "6.25-dt-20200515Z-13ee7e",
  "org.scalablytyped.slinky" %%% "babel-types" % "7.0-dt-20200902Z-becac9",
  "org.scalablytyped.slinky" %%% "babylon" % "6.16-dt-20200226Z-c0c10b",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
