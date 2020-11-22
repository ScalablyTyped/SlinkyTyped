organization := "org.scalablytyped.slinky"
name := "ethersproject__wallet"
version := "5.0.8-4e6dd6"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "ethersproject__abstract-provider" % "5.0.6-5ddcd4",
  "org.scalablytyped.slinky" %%% "ethersproject__abstract-signer" % "5.0.8-0fb076",
  "org.scalablytyped.slinky" %%% "ethersproject__bignumber" % "5.0.9-af9eb4",
  "org.scalablytyped.slinky" %%% "ethersproject__bytes" % "5.0.6-9b31f4",
  "org.scalablytyped.slinky" %%% "ethersproject__hdnode" % "5.0.6-f6ecbf",
  "org.scalablytyped.slinky" %%% "ethersproject__json-wallets" % "5.0.8-c53bbf",
  "org.scalablytyped.slinky" %%% "ethersproject__logger" % "5.0.7-1844ee",
  "org.scalablytyped.slinky" %%% "ethersproject__networks" % "5.0.5-8721e2",
  "org.scalablytyped.slinky" %%% "ethersproject__properties" % "5.0.5-710d78",
  "org.scalablytyped.slinky" %%% "ethersproject__signing-key" % "5.0.6-f0c87a",
  "org.scalablytyped.slinky" %%% "ethersproject__transactions" % "5.0.7-d9aa14",
  "org.scalablytyped.slinky" %%% "ethersproject__web" % "5.0.10-8595a0",
  "org.scalablytyped.slinky" %%% "ethersproject__wordlists" % "5.0.6-866cee",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
