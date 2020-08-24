organization := "org.scalablytyped.slinky"
name := "plottable"
version := "3.9.0-6720bc"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "d3-collection" % "1.0-dt-20200515Z-8ae7c4",
  "org.scalablytyped.slinky" %%% "d3-path" % "1.0-dt-20200515Z-938e93",
  "org.scalablytyped.slinky" %%% "d3-selection" % "1.4-dt-20200707Z-7e5f10",
  "org.scalablytyped.slinky" %%% "d3-shape" % "1.3-dt-20200515Z-29cbdb",
  "org.scalablytyped.slinky" %%% "d3-time" % "1.0-dt-20200515Z-b1a86c",
  "org.scalablytyped.slinky" %%% "d3-transition" % "1.1-dt-20200515Z-b7e3bd",
  "org.scalablytyped.slinky" %%% "lodash" % "4.14-dt-20200722Z-6aee51",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8",
  "org.scalablytyped.slinky" %%% "typesettable" % "4.1.0-15e59d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
