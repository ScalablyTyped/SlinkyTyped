organization := "org.scalablytyped.slinky"
name := "googleapis"
version := "39.2.0-8ce478"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "gaxios" % "2.0.1-dec8a8",
  "org.scalablytyped.slinky" %%% "google-auth-library" % "5.3.0-aa1477",
  "org.scalablytyped.slinky" %%% "googleapis-common" % "0.7.2-99dbc5",
  "org.scalablytyped.slinky" %%% "gtoken" % "4.1.0-9b1d69",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        