organization := "org.scalablytyped.slinky"
name := "jupyterlab__fileeditor-extension"
version := "1.2.2-8e542c"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-fa3762",
  "org.scalablytyped.slinky" %%% "jupyterlab__application" % "1.2.1-4ae499",
  "org.scalablytyped.slinky" %%% "jupyterlab__apputils" % "1.2.1-77286a",
  "org.scalablytyped.slinky" %%% "jupyterlab__attachments" % "1.2.1-3e3da6",
  "org.scalablytyped.slinky" %%% "jupyterlab__cells" % "1.2.2-4be13b",
  "org.scalablytyped.slinky" %%% "jupyterlab__codeeditor" % "1.2.0-52786f",
  "org.scalablytyped.slinky" %%% "jupyterlab__console" % "1.2.2-4f6b60",
  "org.scalablytyped.slinky" %%% "jupyterlab__coreutils" % "3.2.0-6a3d09",
  "org.scalablytyped.slinky" %%% "jupyterlab__docmanager" % "1.2.1-77f8b9",
  "org.scalablytyped.slinky" %%% "jupyterlab__docregistry" % "1.2.1-f88e7d",
  "org.scalablytyped.slinky" %%% "jupyterlab__filebrowser" % "1.2.1-3b1e50",
  "org.scalablytyped.slinky" %%% "jupyterlab__fileeditor" % "1.2.1-b6c609",
  "org.scalablytyped.slinky" %%% "jupyterlab__launcher" % "1.2.1-3b2579",
  "org.scalablytyped.slinky" %%% "jupyterlab__mainmenu" % "1.2.1-7483fb",
  "org.scalablytyped.slinky" %%% "jupyterlab__observables" % "2.4.0-7c8732",
  "org.scalablytyped.slinky" %%% "jupyterlab__outputarea" % "1.2.2-d37664",
  "org.scalablytyped.slinky" %%% "jupyterlab__rendermime" % "1.2.1-b81ee3",
  "org.scalablytyped.slinky" %%% "jupyterlab__rendermime-interfaces" % "1.5.0-707413",
  "org.scalablytyped.slinky" %%% "jupyterlab__services" % "4.2.0-cc7c60",
  "org.scalablytyped.slinky" %%% "jupyterlab__ui-components" % "1.2.1-147624",
  "org.scalablytyped.slinky" %%% "phosphor__algorithm" % "1.2.0-7a2ed3",
  "org.scalablytyped.slinky" %%% "phosphor__application" % "1.7.3-047a88",
  "org.scalablytyped.slinky" %%% "phosphor__commands" % "1.7.2-53dd61",
  "org.scalablytyped.slinky" %%% "phosphor__coreutils" % "1.3.1-bc46b6",
  "org.scalablytyped.slinky" %%% "phosphor__disposable" % "1.3.1-3c499a",
  "org.scalablytyped.slinky" %%% "phosphor__messaging" % "1.3.0-8ca4e4",
  "org.scalablytyped.slinky" %%% "phosphor__signaling" % "1.3.1-64f758",
  "org.scalablytyped.slinky" %%% "phosphor__virtualdom" % "1.2.0-fc7f51",
  "org.scalablytyped.slinky" %%% "phosphor__widgets" % "1.9.3-aa2951",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-24495c",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200409Z-47fb9f",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e",
  "org.scalablytyped.slinky" %%% "typestyle" % "2.0.4-2e125d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
