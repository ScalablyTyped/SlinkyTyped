organization := "org.scalablytyped.slinky"
name := "libp2p-noise"
version := "2.0.1-e0d227"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "bl" % "v2.1.0-dt-20200923Z-3a4056",
  "org.scalablytyped.slinky" %%% "buffer" % "6.0.3-4b0ab7",
  "org.scalablytyped.slinky" %%% "cids" % "1.0.2-bb51ee",
  "org.scalablytyped.slinky" %%% "it-pb-rpc" % "0.1.9-c7bd4c",
  "org.scalablytyped.slinky" %%% "libp2p-crypto" % "0.18.0-dc6a53",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "peer-id" % "0.14.2-f693d2",
  "org.scalablytyped.slinky" %%% "protobufjs" % "6.10.2-96263b",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
