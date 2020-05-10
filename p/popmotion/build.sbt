organization := "org.scalablytyped.slinky"
name := "popmotion"
version := "8.7.1-eed4a6"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "framesync" % "4.0.4-99528b",
  "org.scalablytyped.slinky" %%% "popmotion__easing" % "1.0.2-99ba95",
  "org.scalablytyped.slinky" %%% "popmotion__popcorn" % "0.4.4-b79ee3",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e",
  "org.scalablytyped.slinky" %%% "style-value-types" % "3.1.7-30eace",
  "org.scalablytyped.slinky" %%% "stylefire" % "7.0.1-dae369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
