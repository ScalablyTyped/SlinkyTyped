organization := "org.scalablytyped.slinky"
name := "express-pino-logger"
version := "4.0-dt-20191003Z-056b3d"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "pino" % "6.0-dt-20200413Z-99dc8a",
  "org.scalablytyped.slinky" %%% "pino-http" % "5.0-dt-20200423Z-1a2ac6",
  "org.scalablytyped.slinky" %%% "pino-std-serializers" % "2.4-dt-20200426Z-6cc201",
  "org.scalablytyped.slinky" %%% "sonic-boom" % "0.7-dt-20190819Z-6b9f44",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
