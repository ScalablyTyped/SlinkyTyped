organization := "org.scalablytyped.slinky"
name := "babel__core"
version := "7.1-dt-20200621Z-f1b46b"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "babel__generator" % "7.6-dt-20191210Z-38f57a",
  "org.scalablytyped.slinky" %%% "babel__parser" % "7.11.0-90e98e",
  "org.scalablytyped.slinky" %%% "babel__template" % "7.0-dt-20190213Z-c18728",
  "org.scalablytyped.slinky" %%% "babel__traverse" % "7.0-dt-20200706Z-a38ad3",
  "org.scalablytyped.slinky" %%% "babel__types" % "7.11.0-e30392",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
