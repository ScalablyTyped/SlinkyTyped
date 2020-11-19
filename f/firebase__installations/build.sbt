organization := "org.scalablytyped.slinky"
name := "firebase__installations"
version := "0.4.15-457c90"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "firebase__app-types" % "0.6.1-18b0a9",
  "org.scalablytyped.slinky" %%% "firebase__component" % "0.1.17-d49279",
  "org.scalablytyped.slinky" %%% "firebase__installations-types" % "0.3.4-ad7da2",
  "org.scalablytyped.slinky" %%% "firebase__logger" % "0.2.6-64fdf2",
  "org.scalablytyped.slinky" %%% "firebase__util" % "0.3.0-cda7f6",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
