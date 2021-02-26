organization := "org.scalablytyped.slinky"
name := "firebase-admin"
version := "9.4.1-905fc4"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "firebase__app-types" % "0.6.1-e1e312",
  "org.scalablytyped.slinky" %%% "firebase__database-types" % "0.6.1-754cea",
  "org.scalablytyped.slinky" %%% "firebase__logger" % "0.2.6-1cc4ee",
  "org.scalablytyped.slinky" %%% "firebase__util" % "0.3.4-acbd2b",
  "org.scalablytyped.slinky" %%% "gaxios" % "4.0.1-b7ad40",
  "org.scalablytyped.slinky" %%% "google-auth-library" % "6.1.3-d0c57d",
  "org.scalablytyped.slinky" %%% "google-cloud__common" % "3.5.0-fbec67",
  "org.scalablytyped.slinky" %%% "google-cloud__firestore" % "4.7.1-9e1031",
  "org.scalablytyped.slinky" %%% "google-cloud__storage" % "5.5.0-e9d169",
  "org.scalablytyped.slinky" %%% "gtoken" % "5.1.0-039104",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "teeny-request" % "7.0.1-d3e4ff")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
