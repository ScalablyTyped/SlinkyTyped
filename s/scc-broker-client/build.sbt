organization := "org.scalablytyped.slinky"
name := "scc-broker-client"
version := "7.0-dt-20200519Z-29d6a2"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "ag-channel" % "4.0-dt-20200205Z-494927",
  "org.scalablytyped.slinky" %%% "ag-simple-broker" % "4.0-dt-20200205Z-1d43b6",
  "org.scalablytyped.slinky" %%% "async-stream-emitter" % "3.0-dt-20200205Z-939b4c",
  "org.scalablytyped.slinky" %%% "consumable-stream" % "1.0-dt-20200205Z-4fc092",
  "org.scalablytyped.slinky" %%% "expirymanager" % "0.9-dt-20181130Z-871e30",
  "org.scalablytyped.slinky" %%% "fleximap" % "0.9-dt-20181205Z-2eb0fa",
  "org.scalablytyped.slinky" %%% "jsonwebtoken" % "8.5-dt-20200513Z-5cf1aa",
  "org.scalablytyped.slinky" %%% "ncom" % "1.0-dt-20200205Z-706418",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "sc-auth" % "5.0-dt-20200407Z-0b0b01",
  "org.scalablytyped.slinky" %%% "sc-broker" % "8.0-dt-20200519Z-1c078e",
  "org.scalablytyped.slinky" %%% "sc-errors" % "1.4-dt-20200205Z-0377ff",
  "org.scalablytyped.slinky" %%% "socketcluster-client" % "15.1-dt-20200519Z-530130",
  "org.scalablytyped.slinky" %%% "socketcluster-server" % "15.0-dt-20200214Z-d03a38",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0",
  "org.scalablytyped.slinky" %%% "stream-demux" % "7.0-dt-20200205Z-169d37",
  "org.scalablytyped.slinky" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-66bc37",
  "org.scalablytyped.slinky" %%% "ws" % "7.2-dt-20200413Z-4b6676")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
