organization := "org.scalablytyped.slinky"
name := "firebase__messaging"
version := "0.6.15-396815"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "firebase__app-types" % "0.6.0-d23c04",
  "org.scalablytyped.slinky" %%% "firebase__component" % "0.1.11-f4538d",
  "org.scalablytyped.slinky" %%% "firebase__installations-types" % "0.3.3-64d022",
  "org.scalablytyped.slinky" %%% "firebase__logger" % "0.2.3-3efe92",
  "org.scalablytyped.slinky" %%% "firebase__messaging-types" % "0.4.4-363139",
  "org.scalablytyped.slinky" %%% "firebase__util" % "0.2.46-4579be",
  "org.scalablytyped.slinky" %%% "sinon" % "9.0-dt-20200519Z-09125f",
  "org.scalablytyped.slinky" %%% "sinonjs__fake-timers" % "6.0-dt-20200331Z-f928be",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
