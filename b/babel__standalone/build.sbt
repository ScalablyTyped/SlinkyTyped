organization := "org.scalablytyped.slinky"
name := "babel__standalone"
version := "7.1-dt-20200220Z-8b6bf6"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "babel__core" % "7.1-dt-20200225Z-0a2018",
  "org.scalablytyped.slinky" %%% "babel__generator" % "7.6-dt-20191210Z-4cb196",
  "org.scalablytyped.slinky" %%% "babel__parser" % "7.8.4-78c1fb",
  "org.scalablytyped.slinky" %%% "babel__template" % "7.0-dt-20190213Z-33a562",
  "org.scalablytyped.slinky" %%% "babel__traverse" % "7.0-dt-20200225Z-0594cb",
  "org.scalablytyped.slinky" %%% "babel__types" % "7.8.3-f46cb3",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
