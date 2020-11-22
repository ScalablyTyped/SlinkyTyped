organization := "org.scalablytyped.slinky"
name := "ag-simple-broker"
version := "4.0-dt-20200205Z-6c35c8"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "ag-channel" % "4.0-dt-20200205Z-a4effd",
  "org.scalablytyped.slinky" %%% "async-stream-emitter" % "3.0-dt-20200902Z-6fc492",
  "org.scalablytyped.slinky" %%% "consumable-stream" % "1.0-dt-20200205Z-22ff39",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533",
  "org.scalablytyped.slinky" %%% "stream-demux" % "7.0-dt-20200902Z-09cc48",
  "org.scalablytyped.slinky" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-72a4e4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
