organization := "org.scalablytyped.slinky"
name := "firebase-admin"
version := "8.10.0-9e56e2"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "gaxios" % "2.0.1-326730",
  "org.scalablytyped.slinky" %%% "google-auth-library" % "5.3.0-f53a74",
  "org.scalablytyped.slinky" %%% "google-cloud__common" % "2.2.3-9164ca",
  "org.scalablytyped.slinky" %%% "google-cloud__firestore" % "3.7.1-4ded65",
  "org.scalablytyped.slinky" %%% "google-cloud__storage" % "3.5.0-00884d",
  "org.scalablytyped.slinky" %%% "gtoken" % "4.1.0-a23a03",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "teeny-request" % "5.3.0-305ffb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
