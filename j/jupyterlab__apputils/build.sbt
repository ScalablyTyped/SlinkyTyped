organization := "org.scalablytyped.slinky"
name := "jupyterlab__apputils"
version := "2.2.6-72d802"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.14-58bcb0",
  "org.scalablytyped.slinky" %%% "free-style" % "3.1.0-121a8d",
  "org.scalablytyped.slinky" %%% "jupyterlab__coreutils" % "4.2.5-ec34ad",
  "org.scalablytyped.slinky" %%% "jupyterlab__nbformat" % "2.2.5-c0cdb1",
  "org.scalablytyped.slinky" %%% "jupyterlab__observables" % "3.2.5-cce741",
  "org.scalablytyped.slinky" %%% "jupyterlab__services" % "5.2.5-628aae",
  "org.scalablytyped.slinky" %%% "jupyterlab__settingregistry" % "2.2.5-11c813",
  "org.scalablytyped.slinky" %%% "jupyterlab__statedb" % "2.2.5-ad6e82",
  "org.scalablytyped.slinky" %%% "jupyterlab__ui-components" % "2.2.4-0bbf5b",
  "org.scalablytyped.slinky" %%% "lumino__algorithm" % "1.3.3-293e85",
  "org.scalablytyped.slinky" %%% "lumino__commands" % "1.11.4-c6a965",
  "org.scalablytyped.slinky" %%% "lumino__coreutils" % "1.5.3-ab1a51",
  "org.scalablytyped.slinky" %%% "lumino__disposable" % "1.4.3-a96577",
  "org.scalablytyped.slinky" %%% "lumino__messaging" % "1.4.3-9abce8",
  "org.scalablytyped.slinky" %%% "lumino__polling" % "1.3.3-fef033",
  "org.scalablytyped.slinky" %%% "lumino__signaling" % "1.4.3-bb6705",
  "org.scalablytyped.slinky" %%% "lumino__virtualdom" % "1.7.3-c1f806",
  "org.scalablytyped.slinky" %%% "lumino__widgets" % "1.14.1-60a623",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-931d77",
  "org.scalablytyped.slinky" %%% "react" % "17.0-dt-20201121Z-9cde70",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "typestyle" % "2.1.0-9d8938")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
