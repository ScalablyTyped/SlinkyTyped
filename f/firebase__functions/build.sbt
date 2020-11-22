organization := "org.scalablytyped.slinky"
name := "firebase__functions"
version := "0.6.1-ebe233"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "firebase__app-types" % "0.6.1-67f006",
  "org.scalablytyped.slinky" %%% "firebase__auth-interop-types" % "0.1.5-723243",
  "org.scalablytyped.slinky" %%% "firebase__component" % "0.1.21-2131c1",
  "org.scalablytyped.slinky" %%% "firebase__functions-types" % "0.4.0-2a7e43",
  "org.scalablytyped.slinky" %%% "firebase__logger" % "0.2.6-be9f66",
  "org.scalablytyped.slinky" %%% "firebase__messaging-types" % "0.5.0-2327e0",
  "org.scalablytyped.slinky" %%% "firebase__util" % "0.3.4-8a1a2b",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
