organization := "org.scalablytyped.slinky"
name := "broccoli-plugin"
version := "4.0.3-ea1542"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "broccoli-node-api" % "1.7.0-87be2b",
  "org.scalablytyped.slinky" %%% "broccoli-output-wrapper" % "3.2.5-d09621",
  "org.scalablytyped.slinky" %%% "fs-merger" % "3.1.0-3f16f1",
  "org.scalablytyped.slinky" %%% "minimatch" % "3.0-dt-20200515Z-3c948a",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533",
  "org.scalablytyped.slinky" %%% "walk-sync" % "2.2.0-6e4470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
