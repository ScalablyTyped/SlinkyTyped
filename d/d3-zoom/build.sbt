organization := "org.scalablytyped.slinky"
name := "d3-zoom"
version := "1.7-dt-20200515Z-d6a7b1"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "d3-color" % "1.2-dt-20200515Z-633b83",
  "org.scalablytyped.slinky" %%% "d3-interpolate" % "1.3-dt-20200515Z-373a93",
  "org.scalablytyped.slinky" %%% "d3-selection" % "1.4-dt-20200515Z-cd1b5a",
  "org.scalablytyped.slinky" %%% "std" % "3.9-ad7699")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
