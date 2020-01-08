organization := "org.scalablytyped.slinky"
name := "google-cloud__storage"
version := "3.5.0-0b64dc"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "gaxios" % "2.0.1-dec8a8",
  "org.scalablytyped.slinky" %%% "google-auth-library" % "5.3.0-aa1477",
  "org.scalablytyped.slinky" %%% "google-cloud__common" % "2.2.3-de00cd",
  "org.scalablytyped.slinky" %%% "gtoken" % "4.1.0-9b1d69",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43",
  "org.scalablytyped.slinky" %%% "teeny-request" % "5.3.0-912544")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        