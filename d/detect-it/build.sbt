organization := "org.scalablytyped.slinky"
name := "detect-it"
version := "2.1-dt-20180214Z-2caa8a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "detect-hover" % "1.0-dt-20180214Z-1097d6",
  "org.scalablytyped.slinky" %%% "detect-passive-events" % "1.0-dt-20180214Z-973350",
  "org.scalablytyped.slinky" %%% "detect-pointer" % "1.0-dt-20180214Z-2ee63a",
  "org.scalablytyped.slinky" %%% "detect-touch-events" % "1.0-dt-20180214Z-92d0df")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        