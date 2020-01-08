organization := "org.scalablytyped.slinky"
name := "firebase__functions"
version := "0.4.28-900055"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "firebase__app-types" % "0.5.0-b17dbb",
  "org.scalablytyped.slinky" %%% "firebase__auth-interop-types" % "0.1.1-d71cc5",
  "org.scalablytyped.slinky" %%% "firebase__component" % "0.1.1-f087af",
  "org.scalablytyped.slinky" %%% "firebase__functions-types" % "0.3.13-bb1a35",
  "org.scalablytyped.slinky" %%% "firebase__messaging-types" % "0.4.0-739008",
  "org.scalablytyped.slinky" %%% "firebase__util" % "0.2.36-7c6aeb",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        