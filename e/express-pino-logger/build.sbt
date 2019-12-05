organization := "org.scalablytyped.slinky"
name := "express-pino-logger"
version := "4.0-dt-20191003Z-8d207b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "pino" % "5.8-dt-20191028Z-24ae14",
  "org.scalablytyped.slinky" %%% "pino-http" % "4.3-dt-20191003Z-02daea",
  "org.scalablytyped.slinky" %%% "pino-std-serializers" % "2.4-dt-20190701Z-cd9672",
  "org.scalablytyped.slinky" %%% "sonic-boom" % "0.7-dt-20190819Z-d51ce5",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        