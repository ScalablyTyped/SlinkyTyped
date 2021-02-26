organization := "org.scalablytyped.slinky"
name := "sc-hot-reboot"
version := "1.0-dt-20200205Z-377b6f"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "async" % "3.2-dt-20201112Z-5ed630",
  "org.scalablytyped.slinky" %%% "async-iterable-stream" % "3.0-dt-20200205Z-e724d3",
  "org.scalablytyped.slinky" %%% "chokidar" % "3.4.3-77adf0",
  "org.scalablytyped.slinky" %%% "consumable-stream" % "1.0-dt-20200205Z-8ac306",
  "org.scalablytyped.slinky" %%% "expirymanager" % "0.9-dt-20181130Z-e43835",
  "org.scalablytyped.slinky" %%% "fleximap" % "0.9-dt-20181205Z-c9504c",
  "org.scalablytyped.slinky" %%% "jsonwebtoken" % "8.5-dt-20200513Z-7dce4d",
  "org.scalablytyped.slinky" %%% "ncom" % "1.0-dt-20200205Z-1bb2e7",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "sc-auth" % "5.0-dt-20200407Z-de5379",
  "org.scalablytyped.slinky" %%% "sc-broker" % "8.0-dt-20200519Z-c393fb",
  "org.scalablytyped.slinky" %%% "sc-broker-cluster" % "9.0-dt-20200205Z-d469ff",
  "org.scalablytyped.slinky" %%% "sc-channel" % "2.0-dt-20200205Z-12c0b0",
  "org.scalablytyped.slinky" %%% "socketcluster" % "14.0-dt-20200205Z-dd00a0",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "stream-demux" % "7.0-dt-20200902Z-a2818e",
  "org.scalablytyped.slinky" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-3a482d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
