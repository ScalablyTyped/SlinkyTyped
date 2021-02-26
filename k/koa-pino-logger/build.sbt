organization := "org.scalablytyped.slinky"
name := "koa-pino-logger"
version := "3.0-dt-20201015Z-732f0f"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "pino" % "6.3-dt-20201119Z-2dc530",
  "org.scalablytyped.slinky" %%% "pino-http" % "5.0-dt-20200826Z-e02c6b",
  "org.scalablytyped.slinky" %%% "pino-std-serializers" % "2.4-dt-20200515Z-6d97ed",
  "org.scalablytyped.slinky" %%% "sonic-boom" % "0.7-dt-20190819Z-da5dc0",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
