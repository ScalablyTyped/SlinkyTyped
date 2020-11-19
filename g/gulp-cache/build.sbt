organization := "org.scalablytyped.slinky"
name := "gulp-cache"
version := "v0.4.5-dt-20200515Z-1cf9f3"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "chalk" % "4.1.0-a6735e",
  "org.scalablytyped.slinky" %%% "gulp-util" % "3.0-dt-20200515Z-a7cb70",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "through2" % "2.0-dt-20200515Z-fd9879",
  "org.scalablytyped.slinky" %%% "vinyl" % "2.0-dt-20200515Z-59ddcc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
