organization := "org.scalablytyped.slinky"
name := "activex-vbide"
version := "14.0-dt-20190213Z-39e970"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "activex-office" % "16.0-dt-20190213Z-1d858d",
  "org.scalablytyped.slinky" %%% "activex-outlook" % "14.0-dt-20190213Z-4844db",
  "org.scalablytyped.slinky" %%% "activex-stdole" % "2.0-dt-20190213Z-f39927",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        