organization := "org.scalablytyped.slinky"
name := "inversify-restify-utils"
version := "3.4.1-62c5f3"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "bunyan" % "1.8-dt-20200515Z-f6bf3b",
  "org.scalablytyped.slinky" %%% "formidable" % "1.0.16-dt-20201002Z-476d8e",
  "org.scalablytyped.slinky" %%% "inversify" % "5.0.1-91ac28",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "restify" % "8.4-dt-20201028Z-6259b0",
  "org.scalablytyped.slinky" %%% "spdy" % "3.4-dt-20200227Z-7086d7",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
