organization := "org.scalablytyped.slinky"
name := "datastore-level"
version := "0.14-dt-20200515Z-0bff6a"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "abstract-leveldown" % "5.0-dt-20180913Z-5ec9f7",
  "org.scalablytyped.slinky" %%% "interface-datastore" % "0.8-dt-20191210Z-dd8f09",
  "org.scalablytyped.slinky" %%% "levelup" % "4.3-dt-20200515Z-f257e3",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
