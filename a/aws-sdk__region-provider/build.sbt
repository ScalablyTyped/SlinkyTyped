organization := "org.scalablytyped.slinky"
name := "aws-sdk__region-provider"
version := "0.1.0-preview.1-d5ca90"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "aws-sdk__shared-ini-file-loader" % "0.1.0-preview.1-c7a185",
  "org.scalablytyped.slinky" %%% "aws-sdk__types" % "0.1.0-preview.1-0528f0",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        