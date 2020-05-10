organization := "org.scalablytyped.slinky"
name := "sc-broker-cluster"
version := "9.0-dt-20200205Z-daed9a"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "async" % "3.2-dt-20200427Z-cd91e9",
  "org.scalablytyped.slinky" %%% "async-iterable-stream" % "3.0-dt-20200205Z-e5f300",
  "org.scalablytyped.slinky" %%% "consumable-stream" % "1.0-dt-20200205Z-4552ae",
  "org.scalablytyped.slinky" %%% "expirymanager" % "0.9-dt-20181130Z-4ef3a9",
  "org.scalablytyped.slinky" %%% "fleximap" % "0.9-dt-20181205Z-7058f8",
  "org.scalablytyped.slinky" %%% "ncom" % "1.0-dt-20200205Z-73f5db",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "sc-broker" % "8.0-dt-20200205Z-c56123",
  "org.scalablytyped.slinky" %%% "sc-channel" % "2.0-dt-20200205Z-1c069a",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e",
  "org.scalablytyped.slinky" %%% "stream-demux" % "7.0-dt-20200205Z-010fa8",
  "org.scalablytyped.slinky" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-fb63ff")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
