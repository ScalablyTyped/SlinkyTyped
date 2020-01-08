organization := "org.scalablytyped.slinky"
name := "meow"
version := "5.x-dt-20181009Z-a57b71"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "minimist" % "1.2.0-dt-20190322Z-83bee2",
  "org.scalablytyped.slinky" %%% "minimist-options" % "3.0-dt-20180214Z-a4b63b",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        