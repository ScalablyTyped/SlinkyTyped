organization := "org.scalablytyped.slinky"
name := "jupyterlab__services"
version := "5.2.5-abbbc2"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "jupyterlab__coreutils" % "4.2.5-5b6788",
  "org.scalablytyped.slinky" %%% "jupyterlab__nbformat" % "2.2.5-a224d9",
  "org.scalablytyped.slinky" %%% "jupyterlab__observables" % "3.2.5-73ba47",
  "org.scalablytyped.slinky" %%% "jupyterlab__settingregistry" % "2.2.5-41a3f1",
  "org.scalablytyped.slinky" %%% "jupyterlab__statedb" % "2.2.5-fec0a6",
  "org.scalablytyped.slinky" %%% "lumino__algorithm" % "1.3.3-5516f9",
  "org.scalablytyped.slinky" %%% "lumino__commands" % "1.11.4-d636c9",
  "org.scalablytyped.slinky" %%% "lumino__coreutils" % "1.5.3-0c65b7",
  "org.scalablytyped.slinky" %%% "lumino__disposable" % "1.4.3-ecfb0d",
  "org.scalablytyped.slinky" %%% "lumino__messaging" % "1.4.3-5751c6",
  "org.scalablytyped.slinky" %%% "lumino__polling" % "1.3.3-f14983",
  "org.scalablytyped.slinky" %%% "lumino__signaling" % "1.4.3-80eff1",
  "org.scalablytyped.slinky" %%% "lumino__virtualdom" % "1.7.3-1289e7",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
