organization := "org.scalablytyped.slinky"
name := "scc-broker-client"
version := "7.0-dt-20200519Z-8ed720"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "ag-channel" % "4.0-dt-20200205Z-8cedf6",
  "org.scalablytyped.slinky" %%% "ag-simple-broker" % "4.0-dt-20200205Z-0b660f",
  "org.scalablytyped.slinky" %%% "async-stream-emitter" % "3.0-dt-20200902Z-89a7e3",
  "org.scalablytyped.slinky" %%% "consumable-stream" % "1.0-dt-20200205Z-8ac306",
  "org.scalablytyped.slinky" %%% "expirymanager" % "0.9-dt-20181130Z-e43835",
  "org.scalablytyped.slinky" %%% "fleximap" % "0.9-dt-20181205Z-c9504c",
  "org.scalablytyped.slinky" %%% "jsonwebtoken" % "8.5-dt-20200513Z-7dce4d",
  "org.scalablytyped.slinky" %%% "ncom" % "1.0-dt-20200205Z-1bb2e7",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "sc-auth" % "5.0-dt-20200407Z-de5379",
  "org.scalablytyped.slinky" %%% "sc-broker" % "8.0-dt-20200519Z-c393fb",
  "org.scalablytyped.slinky" %%% "sc-errors" % "1.4-dt-20200205Z-a644e4",
  "org.scalablytyped.slinky" %%% "socketcluster-client" % "15.1-dt-20201028Z-4b653e",
  "org.scalablytyped.slinky" %%% "socketcluster-server" % "15.0-dt-20200214Z-bfd7ff",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "stream-demux" % "7.0-dt-20200902Z-a2818e",
  "org.scalablytyped.slinky" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-3a482d",
  "org.scalablytyped.slinky" %%% "ws" % "7.4-dt-20201109Z-9c5f70")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
