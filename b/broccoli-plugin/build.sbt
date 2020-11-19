organization := "org.scalablytyped.slinky"
name := "broccoli-plugin"
version := "4.0.3-e2fbd3"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "broccoli-node-api" % "1.7.0-1b157c",
  "org.scalablytyped.slinky" %%% "broccoli-output-wrapper" % "3.2.3-cc11cd",
  "org.scalablytyped.slinky" %%% "fs-merger" % "3.1.0-01d58e",
  "org.scalablytyped.slinky" %%% "minimatch" % "3.0-dt-20200515Z-5c4d1c",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "walk-sync" % "2.2.0-aeb3db")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
