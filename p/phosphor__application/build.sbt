organization := "org.scalablytyped.slinky"
name := "phosphor__application"
version := "1.7.3-c5f73e"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "phosphor__algorithm" % "1.2.0-cf55da",
  "org.scalablytyped.slinky" %%% "phosphor__commands" % "1.7.2-549aa2",
  "org.scalablytyped.slinky" %%% "phosphor__coreutils" % "1.3.1-c22335",
  "org.scalablytyped.slinky" %%% "phosphor__disposable" % "1.3.1-0f9af2",
  "org.scalablytyped.slinky" %%% "phosphor__messaging" % "1.3.0-5a4500",
  "org.scalablytyped.slinky" %%% "phosphor__signaling" % "1.3.1-0ac0f6",
  "org.scalablytyped.slinky" %%% "phosphor__virtualdom" % "1.2.0-a128a2",
  "org.scalablytyped.slinky" %%% "phosphor__widgets" % "1.9.3-d66dd5",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
