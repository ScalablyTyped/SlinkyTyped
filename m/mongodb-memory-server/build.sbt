organization := "org.scalablytyped.slinky"
name := "mongodb-memory-server"
version := "6.0.1-9db46a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "bson" % "4.0-dt-20191119Z-0185dd",
  "org.scalablytyped.slinky" %%% "getos" % "3.0-dt-20180214Z-a639e1",
  "org.scalablytyped.slinky" %%% "https-proxy-agent" % "2.2.2-5f2ce6",
  "org.scalablytyped.slinky" %%% "mongodb" % "3.3-dt-20191118Z-976a48",
  "org.scalablytyped.slinky" %%% "mongodb-memory-server-core" % "6.0.1-febf4d",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        