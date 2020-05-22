organization := "org.scalablytyped.slinky"
name := "hexo"
version := "3.8-dt-20200515Z-7f0e27"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "bunyan" % "1.8-dt-20200515Z-40746d",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200515Z-49be3e",
  "org.scalablytyped.slinky" %%% "hexo-util" % "0.6-dt-20190808Z-253cb6",
  "org.scalablytyped.slinky" %%% "minimist" % "1.2.0-dt-20200515Z-5c8090",
  "org.scalablytyped.slinky" %%% "moment" % "2.26.0-72acea",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0",
  "org.scalablytyped.slinky" %%% "underscore" % "1.10-dt-20200515Z-109466")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
