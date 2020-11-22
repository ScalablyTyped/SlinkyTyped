organization := "org.scalablytyped.slinky"
name := "ethereumjs-blockchain"
version := "4.0.4-945fc8"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "bn_dot_js" % "4.11-dt-20200515Z-81625d",
  "org.scalablytyped.slinky" %%% "ethereumjs-common" % "1.5.2-9cabe0",
  "org.scalablytyped.slinky" %%% "ethereumjs-util" % "7.0.7-bff060",
  "org.scalablytyped.slinky" %%% "lru-cache" % "5.1-dt-20200515Z-24a0ae",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "rlp" % "2.2.6-f986ea",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
