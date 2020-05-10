organization := "org.scalablytyped.slinky"
name := "ag-simple-broker"
version := "4.0-dt-20200205Z-b36b2c"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "ag-channel" % "4.0-dt-20200205Z-ef7da2",
  "org.scalablytyped.slinky" %%% "async-stream-emitter" % "3.0-dt-20200205Z-e00bcb",
  "org.scalablytyped.slinky" %%% "consumable-stream" % "1.0-dt-20200205Z-4552ae",
  "org.scalablytyped.slinky" %%% "jsonwebtoken" % "8.3-dt-20200407Z-bf67f0",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "sc-auth" % "5.0-dt-20200407Z-268e84",
  "org.scalablytyped.slinky" %%% "sc-errors" % "1.4-dt-20200205Z-7b140d",
  "org.scalablytyped.slinky" %%% "socketcluster-server" % "15.0-dt-20200214Z-6ba00d",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e",
  "org.scalablytyped.slinky" %%% "stream-demux" % "7.0-dt-20200205Z-010fa8",
  "org.scalablytyped.slinky" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-fb63ff",
  "org.scalablytyped.slinky" %%% "ws" % "7.2-dt-20200413Z-e5ad6b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
