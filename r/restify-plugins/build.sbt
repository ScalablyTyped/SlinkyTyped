organization := "org.scalablytyped.slinky"
name := "restify-plugins"
version := "1.5-dt-20200515Z-8be759"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "bunyan" % "1.8-dt-20200515Z-8d44c2",
  "org.scalablytyped.slinky" %%% "formidable" % "1.0.16-dt-20200522Z-31765b",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "restify" % "8.4-dt-20200515Z-875bc2",
  "org.scalablytyped.slinky" %%% "spdy" % "3.4-dt-20200227Z-90826f",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
