organization := "org.scalablytyped.slinky"
name := "popmotion"
version := "8.7.1-1d0508"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "framesync" % "4.0.4-f99c39",
  "org.scalablytyped.slinky" %%% "popmotion__easing" % "1.0.2-09dcd8",
  "org.scalablytyped.slinky" %%% "popmotion__popcorn" % "0.4.4-f97556",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "style-value-types" % "3.1.7-3c80b3",
  "org.scalablytyped.slinky" %%% "stylefire" % "7.0.1-435a97")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
