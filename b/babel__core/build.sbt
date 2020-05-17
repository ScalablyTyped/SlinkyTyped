organization := "org.scalablytyped.slinky"
name := "babel__core"
version := "7.1-dt-20200331Z-5b53d8"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "babel__generator" % "7.6-dt-20191210Z-f43691",
  "org.scalablytyped.slinky" %%% "babel__parser" % "7.9.3-38f0b8",
  "org.scalablytyped.slinky" %%% "babel__template" % "7.0-dt-20190213Z-70cf5c",
  "org.scalablytyped.slinky" %%% "babel__traverse" % "7.0-dt-20200406Z-06a5f2",
  "org.scalablytyped.slinky" %%% "babel__types" % "7.9.0-1ead13",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
