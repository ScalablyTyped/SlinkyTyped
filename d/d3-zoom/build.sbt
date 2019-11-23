organization := "org.scalablytyped.slinky"
name := "d3-zoom"
version := "1.7-dt-20190212Z-33324b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "d3-color" % "1.2-dt-20190212Z-eeb7f1",
  "org.scalablytyped.slinky" %%% "d3-interpolate" % "1.3-dt-20190212Z-8df393",
  "org.scalablytyped.slinky" %%% "d3-selection" % "1.4-dt-20190710Z-33ce0d",
  "org.scalablytyped.slinky" %%% "std" % "3.7-317bd7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        