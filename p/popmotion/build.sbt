organization := "org.scalablytyped.slinky"
name := "popmotion"
version := "8.7.1-973fb0"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "framesync" % "4.0.4-a2485c",
  "org.scalablytyped.slinky" %%% "popmotion__easing" % "1.0.2-2eb98e",
  "org.scalablytyped.slinky" %%% "popmotion__popcorn" % "0.4.4-7c180b",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821",
  "org.scalablytyped.slinky" %%% "style-value-types" % "3.1.7-539f3f",
  "org.scalablytyped.slinky" %%% "stylefire" % "7.0.1-d1aa72")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        