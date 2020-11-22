organization := "org.scalablytyped.slinky"
name := "ipfs-core"
version := "0.2.1-640277"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "bignumber_dot_js" % "9.0.1-ebae07",
  "org.scalablytyped.slinky" %%% "bl" % "v2.1.0-dt-20200923Z-579bc1",
  "org.scalablytyped.slinky" %%% "buffer" % "6.0.2-a51c4b",
  "org.scalablytyped.slinky" %%% "cids" % "1.0.2-aa73f4",
  "org.scalablytyped.slinky" %%% "debug" % "4.1-dt-20200226Z-794065",
  "org.scalablytyped.slinky" %%% "it-pb-rpc" % "0.1.9-7fefe4",
  "org.scalablytyped.slinky" %%% "it-pushable" % "1.4.0-4840b5",
  "org.scalablytyped.slinky" %%% "libp2p-crypto" % "0.18.0-0c2cf9",
  "org.scalablytyped.slinky" %%% "libp2p-gossipsub" % "0.6.6-86823d",
  "org.scalablytyped.slinky" %%% "libp2p-interfaces" % "0.7.2-48a95f",
  "org.scalablytyped.slinky" %%% "libp2p-noise" % "2.0.1-358738",
  "org.scalablytyped.slinky" %%% "multiaddr" % "8.1.1-e6cb5e",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "peer-id" % "0.14.2-ef7603",
  "org.scalablytyped.slinky" %%% "protobufjs" % "6.10.2-d4cf69",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
