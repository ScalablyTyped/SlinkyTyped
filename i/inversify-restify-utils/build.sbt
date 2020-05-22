organization := "org.scalablytyped.slinky"
name := "inversify-restify-utils"
version := "3.4.0-3f888d"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "bunyan" % "1.8-dt-20200515Z-40746d",
  "org.scalablytyped.slinky" %%% "formidable" % "1.0.16-dt-20200515Z-e49fa7",
  "org.scalablytyped.slinky" %%% "inversify" % "5.0.1-3c5668",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "restify" % "8.4-dt-20200515Z-fc17ba",
  "org.scalablytyped.slinky" %%% "spdy" % "3.4-dt-20200227Z-57d634",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
