organization := "org.scalablytyped.slinky"
name := "cwise"
version := "1.0-dt-20200225Z-b31562"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "cwise-compiler" % "1.1-dt-20180214Z-3d1d8f",
  "org.scalablytyped.slinky" %%% "cwise-parser" % "1.0-dt-20200225Z-61c481",
  "org.scalablytyped.slinky" %%% "ndarray" % "1.0-dt-20190212Z-f9d5e9",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
