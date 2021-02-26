organization := "org.scalablytyped.slinky"
name := "jupyterlab__settingregistry"
version := "2.2.5-11c813"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "jupyterlab__statedb" % "2.2.5-ad6e82",
  "org.scalablytyped.slinky" %%% "lumino__algorithm" % "1.3.3-293e85",
  "org.scalablytyped.slinky" %%% "lumino__commands" % "1.11.4-c6a965",
  "org.scalablytyped.slinky" %%% "lumino__coreutils" % "1.5.3-ab1a51",
  "org.scalablytyped.slinky" %%% "lumino__disposable" % "1.4.3-a96577",
  "org.scalablytyped.slinky" %%% "lumino__signaling" % "1.4.3-bb6705",
  "org.scalablytyped.slinky" %%% "lumino__virtualdom" % "1.7.3-c1f806",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
