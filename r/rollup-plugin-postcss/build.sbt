organization := "org.scalablytyped.slinky"
name := "rollup-plugin-postcss"
version := "2.0-dt-20200515Z-26ee4e"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "cssnano" % "4.0-dt-20180802Z-3dff74",
  "org.scalablytyped.slinky" %%% "postcss" % "7.0.32-0263b3",
  "org.scalablytyped.slinky" %%% "rollup" % "2.23.0-51155b",
  "org.scalablytyped.slinky" %%% "source-map" % "0.7.3-fe56c3",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
