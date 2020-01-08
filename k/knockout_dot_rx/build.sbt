organization := "org.scalablytyped.slinky"
name := "knockout_dot_rx"
version := "1.0-dt-20190322Z-9a979a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "knockout" % "v3.4.0-dt-20190819Z-564082",
  "org.scalablytyped.slinky" %%% "rx-core" % "4.0-dt-20190322Z-c54414",
  "org.scalablytyped.slinky" %%% "rx-core-binding" % "4.0-dt-20190322Z-8bbd5f",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        