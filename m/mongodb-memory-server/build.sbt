organization := "org.scalablytyped.slinky"
name := "mongodb-memory-server"
version := "6.9.2-2fe26c"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "agent-base" % "6.0.2-03373c",
  "org.scalablytyped.slinky" %%% "https-proxy-agent" % "5.0.0-f2425c",
  "org.scalablytyped.slinky" %%% "mongodb-memory-server-core" % "6.9.2-d4a1fa",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533",
  "org.scalablytyped.slinky" %%% "tmp" % "0.2-dt-20200501Z-a844ae")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
