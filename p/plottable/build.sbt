organization := "org.scalablytyped.slinky"
name := "plottable"
version := "3.8.6-e3d164"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "d3-collection" % "1.0-dt-20200515Z-050fea",
  "org.scalablytyped.slinky" %%% "d3-path" % "1.0-dt-20200515Z-6d7225",
  "org.scalablytyped.slinky" %%% "d3-selection" % "1.4-dt-20200515Z-b39db8",
  "org.scalablytyped.slinky" %%% "d3-shape" % "1.3-dt-20200515Z-9986de",
  "org.scalablytyped.slinky" %%% "d3-time" % "1.0-dt-20200515Z-2edf0d",
  "org.scalablytyped.slinky" %%% "d3-transition" % "1.1-dt-20200515Z-134dee",
  "org.scalablytyped.slinky" %%% "lodash" % "4.14-dt-20200519Z-08d73a",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0",
  "org.scalablytyped.slinky" %%% "typesettable" % "4.1.0-024d6e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
