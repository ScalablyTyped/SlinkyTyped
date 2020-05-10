organization := "org.scalablytyped.slinky"
name := "jupyterlab__documentsearch"
version := "1.2.2-2c80cf"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "codemirror" % "0.0-unknown-dt-20200410Z-3c0f64",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-fa3762",
  "org.scalablytyped.slinky" %%% "estree" % "0.0-unknown-dt-20200320Z-3b5711",
  "org.scalablytyped.slinky" %%% "jupyterlab__apputils" % "1.2.1-77286a",
  "org.scalablytyped.slinky" %%% "jupyterlab__attachments" % "1.2.1-3e3da6",
  "org.scalablytyped.slinky" %%% "jupyterlab__cells" % "1.2.2-4be13b",
  "org.scalablytyped.slinky" %%% "jupyterlab__codeeditor" % "1.2.0-52786f",
  "org.scalablytyped.slinky" %%% "jupyterlab__codemirror" % "1.2.1-f5ef49",
  "org.scalablytyped.slinky" %%% "jupyterlab__coreutils" % "3.2.0-6a3d09",
  "org.scalablytyped.slinky" %%% "jupyterlab__docregistry" % "1.2.1-f88e7d",
  "org.scalablytyped.slinky" %%% "jupyterlab__fileeditor" % "1.2.1-b6c609",
  "org.scalablytyped.slinky" %%% "jupyterlab__notebook" % "1.2.2-98c06a",
  "org.scalablytyped.slinky" %%% "jupyterlab__observables" % "2.4.0-7c8732",
  "org.scalablytyped.slinky" %%% "jupyterlab__outputarea" % "1.2.2-d37664",
  "org.scalablytyped.slinky" %%% "jupyterlab__rendermime" % "1.2.1-b81ee3",
  "org.scalablytyped.slinky" %%% "jupyterlab__rendermime-interfaces" % "1.5.0-707413",
  "org.scalablytyped.slinky" %%% "jupyterlab__services" % "4.2.0-cc7c60",
  "org.scalablytyped.slinky" %%% "phosphor__algorithm" % "1.2.0-7a2ed3",
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
  "org.scalablytyped.slinky" %%% "tern" % "0.23-dt-20191126Z-316232")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
