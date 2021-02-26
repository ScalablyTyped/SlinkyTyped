organization := "org.scalablytyped.slinky"
name := "libp2p-gossipsub"
version := "0.6.6-6a7c72"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "cids" % "1.0.2-bb51ee",
  "org.scalablytyped.slinky" %%% "debug" % "4.1-dt-20200226Z-1fc0b4",
  "org.scalablytyped.slinky" %%% "it-pushable" % "1.4.0-20dce6",
  "org.scalablytyped.slinky" %%% "libp2p-crypto" % "0.18.0-dc6a53",
  "org.scalablytyped.slinky" %%% "libp2p-interfaces" % "0.7.2-09b5e8",
  "org.scalablytyped.slinky" %%% "multiaddr" % "8.1.1-23fce8",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "peer-id" % "0.14.2-f693d2",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
