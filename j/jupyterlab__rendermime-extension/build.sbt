organization := "org.scalablytyped.slinky"
name := "jupyterlab__rendermime-extension"
version := "2.2.6-98ccc9"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.14-23cf0c",
  "org.scalablytyped.slinky" %%% "free-style" % "3.1.0-f18d64",
  "org.scalablytyped.slinky" %%% "jupyterlab__application" % "2.2.6-73a30c",
  "org.scalablytyped.slinky" %%% "jupyterlab__apputils" % "2.2.6-2a62f6",
  "org.scalablytyped.slinky" %%% "jupyterlab__codeeditor" % "2.2.5-1323d8",
  "org.scalablytyped.slinky" %%% "jupyterlab__coreutils" % "4.2.5-5b6788",
  "org.scalablytyped.slinky" %%% "jupyterlab__docregistry" % "2.2.4-80b2b2",
  "org.scalablytyped.slinky" %%% "jupyterlab__nbformat" % "2.2.5-a224d9",
  "org.scalablytyped.slinky" %%% "jupyterlab__observables" % "3.2.5-73ba47",
  "org.scalablytyped.slinky" %%% "jupyterlab__rendermime" % "2.2.4-a2dcce",
  "org.scalablytyped.slinky" %%% "jupyterlab__rendermime-interfaces" % "2.2.1-e8fcf8",
  "org.scalablytyped.slinky" %%% "jupyterlab__services" % "5.2.5-abbbc2",
  "org.scalablytyped.slinky" %%% "jupyterlab__settingregistry" % "2.2.5-41a3f1",
  "org.scalablytyped.slinky" %%% "jupyterlab__statedb" % "2.2.5-fec0a6",
  "org.scalablytyped.slinky" %%% "jupyterlab__ui-components" % "2.2.4-1a703d",
  "org.scalablytyped.slinky" %%% "lumino__algorithm" % "1.3.3-5516f9",
  "org.scalablytyped.slinky" %%% "lumino__application" % "1.11.1-fa4292",
  "org.scalablytyped.slinky" %%% "lumino__commands" % "1.11.4-d636c9",
  "org.scalablytyped.slinky" %%% "lumino__coreutils" % "1.5.3-0c65b7",
  "org.scalablytyped.slinky" %%% "lumino__disposable" % "1.4.3-ecfb0d",
  "org.scalablytyped.slinky" %%% "lumino__messaging" % "1.4.3-5751c6",
  "org.scalablytyped.slinky" %%% "lumino__polling" % "1.3.3-f14983",
  "org.scalablytyped.slinky" %%% "lumino__signaling" % "1.4.3-80eff1",
  "org.scalablytyped.slinky" %%% "lumino__virtualdom" % "1.7.3-1289e7",
  "org.scalablytyped.slinky" %%% "lumino__widgets" % "1.14.1-13ffca",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ed7fbd",
  "org.scalablytyped.slinky" %%% "react" % "17.0-dt-20201121Z-8f0b52",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533",
  "org.scalablytyped.slinky" %%% "typestyle" % "2.1.0-73ff2f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
