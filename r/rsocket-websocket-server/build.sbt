organization := "org.scalablytyped.slinky"
name := "rsocket-websocket-server"
version := "0.0-dt-20200515Z-7ae04f"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-df8c17",
  "org.scalablytyped.slinky" %%% "rsocket-core" % "0.0-dt-20200218Z-7603e9",
  "org.scalablytyped.slinky" %%% "rsocket-flowable" % "0.0-dt-20200515Z-1b1daf",
  "org.scalablytyped.slinky" %%% "rsocket-types" % "0.0-dt-20200515Z-a00685",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8",
  "org.scalablytyped.slinky" %%% "ws" % "7.2-dt-20200629Z-0c6bfe")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
