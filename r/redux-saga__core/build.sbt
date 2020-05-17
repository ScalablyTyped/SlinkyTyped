organization := "org.scalablytyped.slinky"
name := "redux-saga__core"
version := "1.1.3-69fc73"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "redux" % "4.0.5-d1b67b",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "typescript-compare" % "0.0.2-df8140",
  "org.scalablytyped.slinky" %%% "typescript-logic" % "0.0.0-7c521b",
  "org.scalablytyped.slinky" %%% "typescript-tuple" % "2.2.1-ccc858")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
