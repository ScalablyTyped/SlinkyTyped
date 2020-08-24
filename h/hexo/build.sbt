organization := "org.scalablytyped.slinky"
name := "hexo"
version := "3.8-dt-20200515Z-357c10"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "bunyan" % "1.8-dt-20200515Z-f14ab9",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200515Z-46705a",
  "org.scalablytyped.slinky" %%% "hexo-util" % "0.6-dt-20190808Z-7966bf",
  "org.scalablytyped.slinky" %%% "minimist" % "1.2.0-dt-20200515Z-1d3bc6",
  "org.scalablytyped.slinky" %%% "moment" % "2.27.0-2827ec",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-df8c17",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8",
  "org.scalablytyped.slinky" %%% "underscore" % "1.10-dt-20200724Z-55e235")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
