organization := "org.scalablytyped.slinky"
name := "firebase__auth-types"
version := "0.10.0-ec9efb"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "firebase__app-types" % "0.6.0-4b25d1",
  "org.scalablytyped.slinky" %%% "firebase__logger" % "0.2.0-ea8d5a",
  "org.scalablytyped.slinky" %%% "firebase__util" % "0.2.43-be1185",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
