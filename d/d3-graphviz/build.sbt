organization := "org.scalablytyped.slinky"
name := "d3-graphviz"
version := "2.6-dt-20201005Z-110a6c"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "d3-color" % "2.0-dt-20201117Z-ff546b",
  "org.scalablytyped.slinky" %%% "d3-interpolate" % "2.0-dt-20201001Z-6a16df",
  "org.scalablytyped.slinky" %%% "d3-selection" % "2.0-dt-20201002Z-67bdbd",
  "org.scalablytyped.slinky" %%% "d3-transition" % "2.0-dt-20201002Z-fd0136",
  "org.scalablytyped.slinky" %%% "d3-zoom" % "2.0-dt-20201104Z-a79ce3",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
