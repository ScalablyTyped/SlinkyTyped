organization := "org.scalablytyped.slinky"
name := "phosphor__dragdrop"
version := "1.4.1-9990b4"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "phosphor__algorithm" % "1.2.0-7269d5",
  "org.scalablytyped.slinky" %%% "phosphor__coreutils" % "1.3.1-0f6ecf",
  "org.scalablytyped.slinky" %%% "phosphor__disposable" % "1.3.1-ef4010",
  "org.scalablytyped.slinky" %%% "phosphor__signaling" % "1.3.1-42cd00",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        