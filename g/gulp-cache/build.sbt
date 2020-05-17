organization := "org.scalablytyped.slinky"
name := "gulp-cache"
version := "v0.4.5-dt-20200225Z-a6f083"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "chalk" % "2.4.2-b5200d",
  "org.scalablytyped.slinky" %%% "gulp-util" % "3.0-dt-20200226Z-167d32",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "through2" % "2.0-dt-20200307Z-67d2b4",
  "org.scalablytyped.slinky" %%% "vinyl" % "2.0-dt-20200225Z-ee4bf0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
