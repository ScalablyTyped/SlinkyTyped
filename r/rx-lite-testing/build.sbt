organization := "org.scalablytyped.slinky"
name := "rx-lite-testing"
version := "4.0-dt-20180214Z-eae9a1"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "rx-core" % "4.0-dt-20190322Z-c54414",
  "org.scalablytyped.slinky" %%% "rx-lite" % "4.0-dt-20190322Z-99bc0e",
  "org.scalablytyped.slinky" %%% "rx-lite-virtualtime" % "4.0-dt-20190322Z-fa603a",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        