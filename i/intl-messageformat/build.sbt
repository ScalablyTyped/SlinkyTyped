organization := "org.scalablytyped.slinky"
name := "intl-messageformat"
version := "9.2.0-33a69d"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "formatjs__intl-numberformat" % "5.3.3-7f864d",
  "org.scalablytyped.slinky" %%% "formatjs__intl-utils" % "3.8.2-4ab4ad",
  "org.scalablytyped.slinky" %%% "intl-messageformat-parser" % "5.3.7-4a4f28",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
