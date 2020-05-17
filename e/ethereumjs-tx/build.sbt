organization := "org.scalablytyped.slinky"
name := "ethereumjs-tx"
version := "2.1.2-f49120"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "bn_dot_js" % "4.11-dt-20200225Z-21348b",
  "org.scalablytyped.slinky" %%% "ethereumjs-common" % "1.3.2-995623",
  "org.scalablytyped.slinky" %%% "ethereumjs-util" % "6.2.0-e30e15",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "rlp" % "2.2.3-ff51b9",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
