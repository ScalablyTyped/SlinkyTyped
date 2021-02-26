organization := "org.scalablytyped.slinky"
name := "firebase__storage"
version := "0.4.2-1c7836"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "firebase__app-types" % "0.6.1-e1e312",
  "org.scalablytyped.slinky" %%% "firebase__auth-interop-types" % "0.1.5-beb378",
  "org.scalablytyped.slinky" %%% "firebase__component" % "0.1.21-b4d029",
  "org.scalablytyped.slinky" %%% "firebase__logger" % "0.2.6-1cc4ee",
  "org.scalablytyped.slinky" %%% "firebase__storage-types" % "0.3.13-afb0a2",
  "org.scalablytyped.slinky" %%% "firebase__util" % "0.3.4-acbd2b",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
