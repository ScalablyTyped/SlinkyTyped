organization := "org.scalablytyped.slinky"
name := "firebase__functions"
version := "0.6.1-d22be2"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "firebase__app-types" % "0.6.1-e1e312",
  "org.scalablytyped.slinky" %%% "firebase__auth-interop-types" % "0.1.5-beb378",
  "org.scalablytyped.slinky" %%% "firebase__component" % "0.1.21-b4d029",
  "org.scalablytyped.slinky" %%% "firebase__functions-types" % "0.4.0-e57a61",
  "org.scalablytyped.slinky" %%% "firebase__logger" % "0.2.6-1cc4ee",
  "org.scalablytyped.slinky" %%% "firebase__messaging-types" % "0.5.0-b5a472",
  "org.scalablytyped.slinky" %%% "firebase__util" % "0.3.4-acbd2b",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
