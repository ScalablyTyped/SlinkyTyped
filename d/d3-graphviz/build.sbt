organization := "org.scalablytyped.slinky"
name := "d3-graphviz"
version := "2.6-dt-20200103Z-d61146"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "d3-color" % "1.2-dt-20200515Z-d28d77",
  "org.scalablytyped.slinky" %%% "d3-interpolate" % "1.3-dt-20200515Z-f38770",
  "org.scalablytyped.slinky" %%% "d3-selection" % "1.4-dt-20200707Z-7e5f10",
  "org.scalablytyped.slinky" %%% "d3-transition" % "1.1-dt-20200515Z-b7e3bd",
  "org.scalablytyped.slinky" %%% "d3-zoom" % "1.7-dt-20200515Z-8a2abc",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
