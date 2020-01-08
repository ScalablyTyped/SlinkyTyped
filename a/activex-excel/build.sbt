organization := "org.scalablytyped.slinky"
name := "activex-excel"
version := "14.0-dt-20190213Z-397f6b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "activex-adodb" % "6.1-dt-20190213Z-d20c17",
  "org.scalablytyped.slinky" %%% "activex-dao" % "16.0-dt-20190213Z-80dcc9",
  "org.scalablytyped.slinky" %%% "activex-office" % "16.0-dt-20190213Z-1d858d",
  "org.scalablytyped.slinky" %%% "activex-outlook" % "14.0-dt-20190213Z-4844db",
  "org.scalablytyped.slinky" %%% "activex-stdole" % "2.0-dt-20190213Z-f39927",
  "org.scalablytyped.slinky" %%% "activex-vbide" % "14.0-dt-20190213Z-39e970",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        