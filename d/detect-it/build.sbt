organization := "org.scalablytyped.slinky"
name := "detect-it"
version := "2.1-dt-20180214Z-bd23f2"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "detect-hover" % "1.0-dt-20180214Z-7353d7",
  "org.scalablytyped.slinky" %%% "detect-passive-events" % "1.0-dt-20180214Z-51c53f",
  "org.scalablytyped.slinky" %%% "detect-pointer" % "1.0-dt-20180214Z-297583",
  "org.scalablytyped.slinky" %%% "detect-touch-events" % "1.0-dt-20180214Z-3e539b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
