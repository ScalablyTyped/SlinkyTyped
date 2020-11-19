organization := "org.scalablytyped.slinky"
name := "bunyan-winston-adapter"
version := "0.2-dt-20200515Z-0ac5f2"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "bunyan" % "1.8-dt-20200515Z-8d44c2",
  "org.scalablytyped.slinky" %%% "logform" % "2.2.0-10d3c0",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "winston" % "3.3.3-44f40b",
  "org.scalablytyped.slinky" %%% "winston-transport" % "4.4.0-fe7aad")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
