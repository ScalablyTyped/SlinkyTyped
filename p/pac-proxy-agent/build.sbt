organization := "org.scalablytyped.slinky"
name := "pac-proxy-agent"
version := "4.1.0-5c6be1"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "agent-base" % "6.0.2-036bb1",
  "org.scalablytyped.slinky" %%% "degenerator" % "2.2.0-8eee9b",
  "org.scalablytyped.slinky" %%% "http-proxy-agent" % "4.0.1-f02adb",
  "org.scalablytyped.slinky" %%% "https-proxy-agent" % "5.0.0-87bb76",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "pac-resolver" % "4.1.0-633db4",
  "org.scalablytyped.slinky" %%% "socks-proxy-agent" % "5.0.0-049266",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
