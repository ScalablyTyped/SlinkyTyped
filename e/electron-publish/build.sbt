organization := "org.scalablytyped.slinky"
name := "electron-publish"
version := "22.8.0-7cf443"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "builder-util" % "22.8.0-9e6e13",
  "org.scalablytyped.slinky" %%% "builder-util-runtime" % "8.7.2-be946d",
  "org.scalablytyped.slinky" %%% "debug" % "4.1-dt-20200226Z-08f2a7",
  "org.scalablytyped.slinky" %%% "fs-extra" % "9.0-dt-20200519Z-a8aa21",
  "org.scalablytyped.slinky" %%% "lazy-val" % "1.0.4-d49d4f",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "temp-file" % "3.3.7-238b94")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
