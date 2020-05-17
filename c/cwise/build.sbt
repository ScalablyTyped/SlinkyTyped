organization := "org.scalablytyped.slinky"
name := "cwise"
version := "1.0-dt-20200225Z-a152c3"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "cwise-compiler" % "1.1-dt-20180214Z-7e4422",
  "org.scalablytyped.slinky" %%% "cwise-parser" % "1.0-dt-20200225Z-59dd29",
  "org.scalablytyped.slinky" %%% "ndarray" % "1.0-dt-20190212Z-d1f89c",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
