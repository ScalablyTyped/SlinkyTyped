organization := "org.scalablytyped.slinky"
name := "rsocket-websocket-client"
version := "0.0-dt-20200515Z-c3c7e2"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "rsocket-core" % "0.0-dt-20200218Z-4536e0",
  "org.scalablytyped.slinky" %%% "rsocket-flowable" % "0.0-dt-20200515Z-19542e",
  "org.scalablytyped.slinky" %%% "rsocket-types" % "0.0-dt-20200515Z-565b70",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
