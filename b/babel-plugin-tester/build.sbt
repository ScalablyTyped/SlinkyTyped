organization := "org.scalablytyped.slinky"
name := "babel-plugin-tester"
version := "9.0-dt-20200515Z-19f66a"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "babel__core" % "7.1-dt-20200515Z-add43b",
  "org.scalablytyped.slinky" %%% "babel__generator" % "7.6-dt-20191210Z-53d15d",
  "org.scalablytyped.slinky" %%% "babel__parser" % "7.9.6-a526a0",
  "org.scalablytyped.slinky" %%% "babel__template" % "7.0-dt-20190213Z-09ee6d",
  "org.scalablytyped.slinky" %%% "babel__traverse" % "7.0-dt-20200515Z-4bbdd5",
  "org.scalablytyped.slinky" %%% "babel__types" % "7.9.6-f0c07e",
  "org.scalablytyped.slinky" %%% "prettier" % "2.0-dt-20200515Z-610cd8",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
