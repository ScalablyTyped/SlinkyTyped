organization := "org.scalablytyped.slinky"
name := "jupyterlab__observables"
version := "2.4.0-2bae43"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "phosphor__algorithm" % "1.2.0-d3d95d",
  "org.scalablytyped.slinky" %%% "phosphor__coreutils" % "1.3.1-033be8",
  "org.scalablytyped.slinky" %%% "phosphor__disposable" % "1.3.1-b805f2",
  "org.scalablytyped.slinky" %%% "phosphor__messaging" % "1.3.0-f79ad3",
  "org.scalablytyped.slinky" %%% "phosphor__signaling" % "1.3.1-955913",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
