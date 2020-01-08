organization := "org.scalablytyped.slinky"
name := "nats-hemera"
version := "7.0.2-e8733a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "pino" % "5.15-dt-20191223Z-c20857",
  "org.scalablytyped.slinky" %%% "pino-std-serializers" % "2.4-dt-20190701Z-27d069",
  "org.scalablytyped.slinky" %%% "sonic-boom" % "0.7-dt-20190819Z-d8b15e",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        