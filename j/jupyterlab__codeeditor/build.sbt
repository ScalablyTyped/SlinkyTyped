organization := "org.scalablytyped.slinky"
name := "jupyterlab__codeeditor"
version := "1.2.0-8c6d3e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "jupyterlab__coreutils" % "3.2.0-c162bd",
  "org.scalablytyped.slinky" %%% "jupyterlab__observables" % "2.4.0-2065f7",
  "org.scalablytyped.slinky" %%% "phosphor__algorithm" % "1.2.0-7269d5",
  "org.scalablytyped.slinky" %%% "phosphor__commands" % "1.7.2-9c4df5",
  "org.scalablytyped.slinky" %%% "phosphor__coreutils" % "1.3.1-0f6ecf",
  "org.scalablytyped.slinky" %%% "phosphor__disposable" % "1.3.1-ef4010",
  "org.scalablytyped.slinky" %%% "phosphor__messaging" % "1.3.0-5a119e",
  "org.scalablytyped.slinky" %%% "phosphor__signaling" % "1.3.1-42cd00",
  "org.scalablytyped.slinky" %%% "phosphor__virtualdom" % "1.2.0-caae32",
  "org.scalablytyped.slinky" %%% "phosphor__widgets" % "1.9.3-64685d",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        