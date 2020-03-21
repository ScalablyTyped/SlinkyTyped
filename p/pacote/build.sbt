organization := "org.scalablytyped.slinky"
name := "pacote"
version := "9.5-dt-20191126Z-3288cf"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "form-data" % "2.5.1-c3cd72",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "node-fetch" % "2.5-dt-20200225Z-9c1380",
  "org.scalablytyped.slinky" %%% "npm-package-arg" % "6.1-dt-20181031Z-a812dd",
  "org.scalablytyped.slinky" %%% "npm-registry-fetch" % "4.0-dt-20190925Z-e86e9e",
  "org.scalablytyped.slinky" %%% "npmlog" % "4.1-dt-20190626Z-e361e6",
  "org.scalablytyped.slinky" %%% "ssri" % "6.0-dt-20190422Z-f374b8",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
