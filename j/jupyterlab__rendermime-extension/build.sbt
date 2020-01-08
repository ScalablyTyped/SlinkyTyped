organization := "org.scalablytyped.slinky"
name := "jupyterlab__rendermime-extension"
version := "1.2.1-6295c8"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-f22bc8",
  "org.scalablytyped.slinky" %%% "jupyterlab__application" % "1.2.1-07fc61",
  "org.scalablytyped.slinky" %%% "jupyterlab__apputils" % "1.2.1-1ed877",
  "org.scalablytyped.slinky" %%% "jupyterlab__codeeditor" % "1.2.0-8c6d3e",
  "org.scalablytyped.slinky" %%% "jupyterlab__coreutils" % "3.2.0-c162bd",
  "org.scalablytyped.slinky" %%% "jupyterlab__docregistry" % "1.2.1-dfe435",
  "org.scalablytyped.slinky" %%% "jupyterlab__observables" % "2.4.0-2065f7",
  "org.scalablytyped.slinky" %%% "jupyterlab__rendermime" % "1.2.1-bea10c",
  "org.scalablytyped.slinky" %%% "jupyterlab__rendermime-interfaces" % "1.5.0-3b8596",
  "org.scalablytyped.slinky" %%% "jupyterlab__services" % "4.2.0-3a7bbc",
  "org.scalablytyped.slinky" %%% "phosphor__algorithm" % "1.2.0-7269d5",
  "org.scalablytyped.slinky" %%% "phosphor__application" % "1.7.3-f86e3e",
  "org.scalablytyped.slinky" %%% "phosphor__commands" % "1.7.2-9c4df5",
  "org.scalablytyped.slinky" %%% "phosphor__coreutils" % "1.3.1-0f6ecf",
  "org.scalablytyped.slinky" %%% "phosphor__disposable" % "1.3.1-ef4010",
  "org.scalablytyped.slinky" %%% "phosphor__messaging" % "1.3.0-5a119e",
  "org.scalablytyped.slinky" %%% "phosphor__signaling" % "1.3.1-42cd00",
  "org.scalablytyped.slinky" %%% "phosphor__virtualdom" % "1.2.0-caae32",
  "org.scalablytyped.slinky" %%% "phosphor__widgets" % "1.9.3-64685d",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-1d231d",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20191220Z-f02704",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        