organization := "org.scalablytyped.slinky"
name := "rsocket-websocket-server"
version := "0.0-dt-20200327Z-92adf4"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "rsocket-core" % "0.0-dt-20200218Z-f90dc0",
  "org.scalablytyped.slinky" %%% "rsocket-flowable" % "0.0-dt-20200404Z-caf79e",
  "org.scalablytyped.slinky" %%% "rsocket-types" % "0.0-dt-20200225Z-033dc3",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "ws" % "7.2-dt-20200413Z-ae451a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
