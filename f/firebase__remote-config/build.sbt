organization := "org.scalablytyped.slinky"
name := "firebase__remote-config"
version := "0.1.9-a49d5a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "firebase__app-types" % "0.5.0-b17dbb",
  "org.scalablytyped.slinky" %%% "firebase__installations-types" % "0.2.4-2be679",
  "org.scalablytyped.slinky" %%% "firebase__logger" % "0.1.33-cfede0",
  "org.scalablytyped.slinky" %%% "firebase__remote-config-types" % "0.1.5-71e2aa",
  "org.scalablytyped.slinky" %%% "firebase__util" % "0.2.36-7c6aeb",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        