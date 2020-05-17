organization := "org.scalablytyped.slinky"
name := "rx-node"
version := "0.0-unknown-dt-20200227Z-407f07"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "rx-core" % "4.0-dt-20200225Z-5c3f0e",
  "org.scalablytyped.slinky" %%% "rx-lite" % "4.0-dt-20200225Z-fcc49b",
  "org.scalablytyped.slinky" %%% "rx-lite-aggregates" % "4.0-dt-20200225Z-57033c",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
