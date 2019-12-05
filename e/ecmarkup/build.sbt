organization := "org.scalablytyped.slinky"
name := "ecmarkup"
version := "3.16.0-d6a766"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "esfx__cancelable" % "1.0.0-pre.13-5a834c",
  "org.scalablytyped.slinky" %%% "esfx__disposable" % "1.0.0-pre.13-9f837b",
  "org.scalablytyped.slinky" %%% "prex" % "0.4.6-fbf2a6",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        