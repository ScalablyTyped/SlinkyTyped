organization := "org.scalablytyped.slinky"
name := "ethereumjs-vm"
version := "4.2.0-202bd3"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "bn_dot_js" % "4.11-dt-20200515Z-e7a7b6",
  "org.scalablytyped.slinky" %%% "ethereumjs-account" % "3.0.0-2a28c3",
  "org.scalablytyped.slinky" %%% "ethereumjs-blockchain" % "4.0.4-8caccd",
  "org.scalablytyped.slinky" %%% "ethereumjs-common" % "1.5.2-eab20b",
  "org.scalablytyped.slinky" %%% "ethereumjs-tx" % "2.1.2-2eb3fc",
  "org.scalablytyped.slinky" %%% "ethereumjs-util" % "7.0.7-f95189",
  "org.scalablytyped.slinky" %%% "lru-cache" % "5.1-dt-20200515Z-285a69",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "rlp" % "2.2.6-eb027b",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
