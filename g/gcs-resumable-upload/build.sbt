organization := "org.scalablytyped.slinky"
name := "gcs-resumable-upload"
version := "2.3.0-9fda60"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "configstore" % "4.0-dt-20181202Z-6e4584",
  "org.scalablytyped.slinky" %%% "duplexify" % "3.6-dt-20181030Z-56fbce",
  "org.scalablytyped.slinky" %%% "gaxios" % "2.0.1-51a84d",
  "org.scalablytyped.slinky" %%% "google-auth-library" % "5.3.0-87b112",
  "org.scalablytyped.slinky" %%% "gtoken" % "4.1.0-db5a10",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "pumpify" % "1.4-dt-20181017Z-f66aa7",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        