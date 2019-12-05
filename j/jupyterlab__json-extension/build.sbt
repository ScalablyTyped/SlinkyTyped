organization := "org.scalablytyped.slinky"
name := "jupyterlab__json-extension"
version := "1.2.1-e1c645"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-34c756",
  "org.scalablytyped.slinky" %%% "jupyterlab__apputils" % "1.2.1-77b294",
  "org.scalablytyped.slinky" %%% "jupyterlab__coreutils" % "3.2.0-4c9dae",
  "org.scalablytyped.slinky" %%% "jupyterlab__observables" % "2.4.0-cd1251",
  "org.scalablytyped.slinky" %%% "jupyterlab__rendermime-interfaces" % "1.5.0-fb3358",
  "org.scalablytyped.slinky" %%% "jupyterlab__services" % "4.2.0-9be369",
  "org.scalablytyped.slinky" %%% "phosphor__algorithm" % "1.2.0-4a3060",
  "org.scalablytyped.slinky" %%% "phosphor__commands" % "1.7.2-9c62de",
  "org.scalablytyped.slinky" %%% "phosphor__coreutils" % "1.3.1-c57c10",
  "org.scalablytyped.slinky" %%% "phosphor__disposable" % "1.3.1-dc0667",
  "org.scalablytyped.slinky" %%% "phosphor__messaging" % "1.3.0-15923a",
  "org.scalablytyped.slinky" %%% "phosphor__signaling" % "1.3.1-c92c2c",
  "org.scalablytyped.slinky" %%% "phosphor__virtualdom" % "1.2.0-86697f",
  "org.scalablytyped.slinky" %%% "phosphor__widgets" % "1.9.3-a29a4d",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-243f84",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20191126Z-6c3558",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        