organization := "org.scalablytyped.slinky"
name := "hexo"
version := "3.8-dt-20201002Z-88f3e7"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "bunyan" % "1.8-dt-20200515Z-f6bf3b",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20201002Z-671a3f",
  "org.scalablytyped.slinky" %%% "hexo-util" % "0.6-dt-20190808Z-7a511e",
  "org.scalablytyped.slinky" %%% "minimist" % "1.2-dt-20201106Z-16747d",
  "org.scalablytyped.slinky" %%% "moment" % "2.29.1-f4e266",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "underscore" % "1.10-dt-20201002Z-b5036b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
