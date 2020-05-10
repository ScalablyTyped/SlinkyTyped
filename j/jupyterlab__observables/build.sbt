organization := "org.scalablytyped.slinky"
name := "jupyterlab__observables"
version := "2.4.0-7c8732"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "phosphor__algorithm" % "1.2.0-7a2ed3",
  "org.scalablytyped.slinky" %%% "phosphor__coreutils" % "1.3.1-bc46b6",
  "org.scalablytyped.slinky" %%% "phosphor__disposable" % "1.3.1-3c499a",
  "org.scalablytyped.slinky" %%% "phosphor__messaging" % "1.3.0-8ca4e4",
  "org.scalablytyped.slinky" %%% "phosphor__signaling" % "1.3.1-64f758",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
