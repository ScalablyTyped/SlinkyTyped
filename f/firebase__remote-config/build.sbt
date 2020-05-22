organization := "org.scalablytyped.slinky"
name := "firebase__remote-config"
version := "0.1.20-cf4c8b"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "firebase__app-types" % "0.6.0-d23c04",
  "org.scalablytyped.slinky" %%% "firebase__installations-types" % "0.3.3-64d022",
  "org.scalablytyped.slinky" %%% "firebase__logger" % "0.2.3-3efe92",
  "org.scalablytyped.slinky" %%% "firebase__remote-config-types" % "0.1.8-71b36d",
  "org.scalablytyped.slinky" %%% "firebase__util" % "0.2.46-4579be",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
