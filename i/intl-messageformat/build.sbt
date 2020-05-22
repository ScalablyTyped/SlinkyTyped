organization := "org.scalablytyped.slinky"
name := "intl-messageformat"
version := "7.8.4-c27260"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "formatjs__intl-unified-numberformat" % "3.2.0-5636fa",
  "org.scalablytyped.slinky" %%% "formatjs__intl-utils" % "2.2.0-5544c0",
  "org.scalablytyped.slinky" %%% "intl-messageformat-parser" % "3.6.4-f3133c",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
