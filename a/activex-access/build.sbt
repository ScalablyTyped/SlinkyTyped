organization := "org.scalablytyped.slinky"
name := "activex-access"
version := "14.0-dt-20190213Z-efb8c6"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "activex-adodb" % "6.1-dt-20190213Z-6d819e",
  "org.scalablytyped.slinky" %%% "activex-dao" % "16.0-dt-20190213Z-0fba69",
  "org.scalablytyped.slinky" %%% "activex-office" % "16.0-dt-20190213Z-be9d3a",
  "org.scalablytyped.slinky" %%% "activex-outlook" % "14.0-dt-20190213Z-585470",
  "org.scalablytyped.slinky" %%% "activex-stdole" % "2.0-dt-20190213Z-10ffaf",
  "org.scalablytyped.slinky" %%% "activex-vbide" % "14.0-dt-20190213Z-f70ce0",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        