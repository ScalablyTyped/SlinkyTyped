organization := "org.scalablytyped.slinky"
name := "jupyterlab__pdf-extension"
version := "1.2.0-d3427a"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "jupyterlab__rendermime-interfaces" % "1.5.0-9eeb36",
  "org.scalablytyped.slinky" %%% "phosphor__algorithm" % "1.2.0-d3d95d",
  "org.scalablytyped.slinky" %%% "phosphor__commands" % "1.7.2-916dfd",
  "org.scalablytyped.slinky" %%% "phosphor__coreutils" % "1.3.1-033be8",
  "org.scalablytyped.slinky" %%% "phosphor__disposable" % "1.3.1-b805f2",
  "org.scalablytyped.slinky" %%% "phosphor__messaging" % "1.3.0-f79ad3",
  "org.scalablytyped.slinky" %%% "phosphor__signaling" % "1.3.1-955913",
  "org.scalablytyped.slinky" %%% "phosphor__virtualdom" % "1.2.0-08ae4c",
  "org.scalablytyped.slinky" %%% "phosphor__widgets" % "1.9.3-683f6b",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
