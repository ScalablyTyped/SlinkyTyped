organization := "org.scalablytyped.slinky"
name := "firebase-admin"
version := "8.8.0-da24ad"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "gaxios" % "2.0.1-51a84d",
  "org.scalablytyped.slinky" %%% "google-auth-library" % "5.3.0-87b112",
  "org.scalablytyped.slinky" %%% "google-cloud__common" % "2.2.3-a9417b",
  "org.scalablytyped.slinky" %%% "google-cloud__firestore" % "2.6.0-e6f18b",
  "org.scalablytyped.slinky" %%% "google-cloud__storage" % "3.5.0-cbbc67",
  "org.scalablytyped.slinky" %%% "gtoken" % "4.1.0-db5a10",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821",
  "org.scalablytyped.slinky" %%% "teeny-request" % "5.3.0-07dc50")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        