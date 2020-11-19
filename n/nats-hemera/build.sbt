organization := "org.scalablytyped.slinky"
name := "nats-hemera"
version := "7.0.2-002d9b"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "pino" % "6.3-dt-20200613Z-ad0de4",
  "org.scalablytyped.slinky" %%% "pino-std-serializers" % "2.4-dt-20200515Z-be4dd3",
  "org.scalablytyped.slinky" %%% "sonic-boom" % "0.7-dt-20190819Z-62ea2f",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
