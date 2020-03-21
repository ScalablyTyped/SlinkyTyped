organization := "org.scalablytyped.slinky"
name := "firebase-admin"
version := "8.9.2-7f99aa"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "gaxios" % "2.0.1-15dee7",
  "org.scalablytyped.slinky" %%% "google-auth-library" % "5.3.0-254cb6",
  "org.scalablytyped.slinky" %%% "google-cloud__common" % "2.2.3-9b65c2",
  "org.scalablytyped.slinky" %%% "google-cloud__firestore" % "3.5.0-57c0e2",
  "org.scalablytyped.slinky" %%% "google-cloud__storage" % "3.5.0-06fbd4",
  "org.scalablytyped.slinky" %%% "gtoken" % "4.1.0-439cb0",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "teeny-request" % "5.3.0-5292db")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
