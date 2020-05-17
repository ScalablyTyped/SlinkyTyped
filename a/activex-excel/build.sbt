organization := "org.scalablytyped.slinky"
name := "activex-excel"
version := "14.0-dt-20200225Z-26f87a"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "activex-adodb" % "6.1-dt-20200225Z-7e9416",
  "org.scalablytyped.slinky" %%% "activex-dao" % "16.0-dt-20200225Z-5efdc3",
  "org.scalablytyped.slinky" %%% "activex-office" % "16.0-dt-20200225Z-282e72",
  "org.scalablytyped.slinky" %%% "activex-outlook" % "14.0-dt-20200225Z-e1d6ff",
  "org.scalablytyped.slinky" %%% "activex-stdole" % "2.0-dt-20200225Z-5b050e",
  "org.scalablytyped.slinky" %%% "activex-vbide" % "14.0-dt-20200225Z-a709ec",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
