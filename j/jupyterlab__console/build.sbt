organization := "org.scalablytyped.slinky"
name := "jupyterlab__console"
version := "1.2.9-e8264f"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-6e65be",
  "org.scalablytyped.slinky" %%% "jupyterlab__apputils" % "1.2.8-1f3411",
  "org.scalablytyped.slinky" %%% "jupyterlab__attachments" % "1.2.8-ebd895",
  "org.scalablytyped.slinky" %%% "jupyterlab__cells" % "1.2.9-d82589",
  "org.scalablytyped.slinky" %%% "jupyterlab__codeeditor" % "1.2.0-acc6a4",
  "org.scalablytyped.slinky" %%% "jupyterlab__coreutils" % "3.2.0-511f91",
  "org.scalablytyped.slinky" %%% "jupyterlab__observables" % "2.4.0-c720ff",
  "org.scalablytyped.slinky" %%% "jupyterlab__outputarea" % "1.2.9-2b5e55",
  "org.scalablytyped.slinky" %%% "jupyterlab__rendermime" % "1.2.8-7cdf3d",
  "org.scalablytyped.slinky" %%% "jupyterlab__rendermime-interfaces" % "1.5.0-4fcc52",
  "org.scalablytyped.slinky" %%% "jupyterlab__services" % "4.2.2-598bde",
  "org.scalablytyped.slinky" %%% "phosphor__algorithm" % "1.2.0-787f4c",
  "org.scalablytyped.slinky" %%% "phosphor__commands" % "1.7.2-b6159b",
  "org.scalablytyped.slinky" %%% "phosphor__coreutils" % "1.3.1-3c6f75",
  "org.scalablytyped.slinky" %%% "phosphor__disposable" % "1.3.1-42e33c",
  "org.scalablytyped.slinky" %%% "phosphor__messaging" % "1.3.0-3dd3f4",
  "org.scalablytyped.slinky" %%% "phosphor__signaling" % "1.3.1-06b254",
  "org.scalablytyped.slinky" %%% "phosphor__virtualdom" % "1.2.0-f01026",
  "org.scalablytyped.slinky" %%% "phosphor__widgets" % "1.9.3-93a919",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ecc9ab",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200515Z-b103c7",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
