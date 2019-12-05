organization := "org.scalablytyped.slinky"
name := "activex-infopath"
version := "3.0-dt-20190213Z-b4d1ea"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "activex-adodb" % "6.1-dt-20190213Z-6d819e",
  "org.scalablytyped.slinky" %%% "activex-mshtml" % "4.0-dt-20190503Z-f41a9a",
  "org.scalablytyped.slinky" %%% "activex-msxml2" % "6.0-dt-20190213Z-fcadad",
  "org.scalablytyped.slinky" %%% "activex-stdole" % "2.0-dt-20190213Z-10ffaf",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        