organization := "org.scalablytyped.slinky"
name := "gulp-cache"
version := "v0.4.5-dt-20200225Z-9f872d"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "chalk" % "2.4.2-c48d52",
  "org.scalablytyped.slinky" %%% "gulp-util" % "3.0-dt-20200226Z-4d3be4",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e",
  "org.scalablytyped.slinky" %%% "through2" % "2.0-dt-20200307Z-87c5c1",
  "org.scalablytyped.slinky" %%% "vinyl" % "2.0-dt-20200225Z-f08824")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
