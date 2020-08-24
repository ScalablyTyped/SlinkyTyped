organization := "org.scalablytyped.slinky"
name := "babel__standalone"
version := "7.1-dt-20200318Z-4e371b"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "babel__core" % "7.1-dt-20200621Z-27564d",
  "org.scalablytyped.slinky" %%% "babel__generator" % "7.6-dt-20191210Z-10c7cf",
  "org.scalablytyped.slinky" %%% "babel__parser" % "7.11.0-267e63",
  "org.scalablytyped.slinky" %%% "babel__template" % "7.0-dt-20190213Z-34b16a",
  "org.scalablytyped.slinky" %%% "babel__traverse" % "7.0-dt-20200706Z-3a745e",
  "org.scalablytyped.slinky" %%% "babel__types" % "7.11.0-e8c905",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
