organization := "org.scalablytyped.slinky"
name := "broccoli-plugin"
version := "3.1.0-0df227"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "broccoli-node-api" % "1.7.0-893c18",
  "org.scalablytyped.slinky" %%% "broccoli-output-wrapper" % "2.0.0-717aef",
  "org.scalablytyped.slinky" %%% "fs-merger" % "3.0.2-ad149d",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "walk-sync" % "0.3.4-e7c886")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
