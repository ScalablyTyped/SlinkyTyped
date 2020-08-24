organization := "org.scalablytyped.slinky"
name := "broccoli-plugin"
version := "4.0.3-11456c"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "broccoli-node-api" % "1.7.0-3acb1b",
  "org.scalablytyped.slinky" %%% "broccoli-output-wrapper" % "3.2.3-5b5d5c",
  "org.scalablytyped.slinky" %%% "fs-merger" % "3.1.0-0cb5c0",
  "org.scalablytyped.slinky" %%% "minimatch" % "3.0-dt-20200515Z-f9bd51",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-df8c17",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8",
  "org.scalablytyped.slinky" %%% "walk-sync" % "2.2.0-4e2742")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
