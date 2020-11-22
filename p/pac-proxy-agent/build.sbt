organization := "org.scalablytyped.slinky"
name := "pac-proxy-agent"
version := "4.1.0-913521"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "agent-base" % "6.0.2-03373c",
  "org.scalablytyped.slinky" %%% "degenerator" % "2.2.0-486bde",
  "org.scalablytyped.slinky" %%% "http-proxy-agent" % "4.0.1-aedf98",
  "org.scalablytyped.slinky" %%% "https-proxy-agent" % "5.0.0-f2425c",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "pac-resolver" % "4.1.0-1a05de",
  "org.scalablytyped.slinky" %%% "socks-proxy-agent" % "5.0.0-2a41b7",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
