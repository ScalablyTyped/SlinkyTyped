organization := "org.scalablytyped.slinky"
name := "express-pino-logger"
version := "4.0-dt-20191003Z-e6b593"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "pino" % "6.0-dt-20200413Z-865cd3",
  "org.scalablytyped.slinky" %%% "pino-http" % "5.0-dt-20200423Z-adef53",
  "org.scalablytyped.slinky" %%% "pino-std-serializers" % "2.4-dt-20200426Z-b772cb",
  "org.scalablytyped.slinky" %%% "sonic-boom" % "0.7-dt-20190819Z-920ee2",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
