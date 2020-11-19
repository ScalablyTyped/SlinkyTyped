organization := "org.scalablytyped.slinky"
name := "plottable"
version := "3.9.0-a2fc16"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "d3-collection" % "1.0-dt-20200515Z-8ea6e3",
  "org.scalablytyped.slinky" %%% "d3-path" % "1.0-dt-20200515Z-26b3ba",
  "org.scalablytyped.slinky" %%% "d3-selection" % "1.4-dt-20200707Z-e0c377",
  "org.scalablytyped.slinky" %%% "d3-shape" % "1.3-dt-20200515Z-8729ce",
  "org.scalablytyped.slinky" %%% "d3-time" % "1.0-dt-20200515Z-3f492a",
  "org.scalablytyped.slinky" %%% "d3-transition" % "1.1-dt-20200515Z-8183b5",
  "org.scalablytyped.slinky" %%% "lodash" % "4.14-dt-20200722Z-21aec5",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "typesettable" % "4.1.0-eaddfe")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
