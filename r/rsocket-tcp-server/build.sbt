organization := "org.scalablytyped.slinky"
name := "rsocket-tcp-server"
version := "0.0-dt-20200515Z-43ab89"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "rsocket-core" % "0.0-dt-20200218Z-a5f448",
  "org.scalablytyped.slinky" %%% "rsocket-flowable" % "0.0-dt-20200515Z-05840b",
  "org.scalablytyped.slinky" %%% "rsocket-types" % "0.0-dt-20200515Z-09dd48",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
