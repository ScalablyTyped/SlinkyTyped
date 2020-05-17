organization := "org.scalablytyped.slinky"
name := "knockout_dot_rx"
version := "1.0-dt-20200225Z-9cbc64"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "knockout" % "v3.4.0-dt-20200225Z-2a1d7f",
  "org.scalablytyped.slinky" %%% "rx-core" % "4.0-dt-20200225Z-5c3f0e",
  "org.scalablytyped.slinky" %%% "rx-core-binding" % "4.0-dt-20200225Z-c4d4d9",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
