organization := "org.scalablytyped.slinky"
name := "nats-hemera"
version := "7.0.2-865b4a"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "pino" % "6.0-dt-20200515Z-ad1868",
  "org.scalablytyped.slinky" %%% "pino-std-serializers" % "2.4-dt-20200515Z-3e855a",
  "org.scalablytyped.slinky" %%% "sonic-boom" % "0.7-dt-20190819Z-d1fdd4",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
