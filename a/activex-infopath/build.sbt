organization := "org.scalablytyped.slinky"
name := "activex-infopath"
version := "3.0-dt-20200225Z-247c0c"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "activex-adodb" % "6.1-dt-20200225Z-7e9416",
  "org.scalablytyped.slinky" %%% "activex-mshtml" % "4.0-dt-20200225Z-cf2162",
  "org.scalablytyped.slinky" %%% "activex-msxml2" % "6.0-dt-20200225Z-cb6fa8",
  "org.scalablytyped.slinky" %%% "activex-stdole" % "2.0-dt-20200225Z-5b050e",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
