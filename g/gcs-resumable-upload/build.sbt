organization := "org.scalablytyped.slinky"
name := "gcs-resumable-upload"
version := "2.3.0-ffe3e1"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "configstore" % "4.0-dt-20181202Z-4193a3",
  "org.scalablytyped.slinky" %%% "duplexify" % "3.6-dt-20181030Z-a860a9",
  "org.scalablytyped.slinky" %%% "gaxios" % "2.0.1-15dee7",
  "org.scalablytyped.slinky" %%% "google-auth-library" % "5.3.0-254cb6",
  "org.scalablytyped.slinky" %%% "gtoken" % "4.1.0-439cb0",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "pumpify" % "1.4-dt-20181017Z-a5d5f1",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
