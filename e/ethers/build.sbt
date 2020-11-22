organization := "org.scalablytyped.slinky"
name := "ethers"
version := "5.0.21-edd84c"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "ethersproject__abi" % "5.0.0-beta.153-d89ebb",
  "org.scalablytyped.slinky" %%% "ethersproject__abstract-provider" % "5.0.6-5ddcd4",
  "org.scalablytyped.slinky" %%% "ethersproject__abstract-signer" % "5.0.8-0fb076",
  "org.scalablytyped.slinky" %%% "ethersproject__address" % "5.0.6-c17c31",
  "org.scalablytyped.slinky" %%% "ethersproject__basex" % "5.0.5-ebcdb9",
  "org.scalablytyped.slinky" %%% "ethersproject__bignumber" % "5.0.9-af9eb4",
  "org.scalablytyped.slinky" %%% "ethersproject__bytes" % "5.0.6-9b31f4",
  "org.scalablytyped.slinky" %%% "ethersproject__contracts" % "5.0.7-31cb5e",
  "org.scalablytyped.slinky" %%% "ethersproject__hash" % "5.0.7-4b78d8",
  "org.scalablytyped.slinky" %%% "ethersproject__hdnode" % "5.0.6-f6ecbf",
  "org.scalablytyped.slinky" %%% "ethersproject__json-wallets" % "5.0.8-c53bbf",
  "org.scalablytyped.slinky" %%% "ethersproject__logger" % "5.0.7-1844ee",
  "org.scalablytyped.slinky" %%% "ethersproject__networks" % "5.0.5-8721e2",
  "org.scalablytyped.slinky" %%% "ethersproject__properties" % "5.0.5-710d78",
  "org.scalablytyped.slinky" %%% "ethersproject__providers" % "5.0.15-ffb5ce",
  "org.scalablytyped.slinky" %%% "ethersproject__sha2" % "5.0.5-e50652",
  "org.scalablytyped.slinky" %%% "ethersproject__signing-key" % "5.0.6-f0c87a",
  "org.scalablytyped.slinky" %%% "ethersproject__strings" % "5.0.6-5317a7",
  "org.scalablytyped.slinky" %%% "ethersproject__transactions" % "5.0.7-d9aa14",
  "org.scalablytyped.slinky" %%% "ethersproject__wallet" % "5.0.8-4e6dd6",
  "org.scalablytyped.slinky" %%% "ethersproject__web" % "5.0.10-8595a0",
  "org.scalablytyped.slinky" %%% "ethersproject__wordlists" % "5.0.6-866cee",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533",
  "org.scalablytyped.slinky" %%% "ws" % "7.4-dt-20201109Z-eeb31e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
