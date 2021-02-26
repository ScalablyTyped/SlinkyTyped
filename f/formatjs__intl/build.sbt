organization := "org.scalablytyped.slinky"
name := "formatjs__intl"
version := "1.4.8-ee4875"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "formatjs__ecma402-abstract" % "1.5.0-3dc81c",
  "org.scalablytyped.slinky" %%% "formatjs__intl-displaynames" % "4.0.0-e6e295",
  "org.scalablytyped.slinky" %%% "formatjs__intl-listformat" % "5.0.0-50b1ad",
  "org.scalablytyped.slinky" %%% "formatjs__intl-relativetimeformat" % "8.0.0-ac6332",
  "org.scalablytyped.slinky" %%% "intl-messageformat" % "9.3.19-bdc8a0",
  "org.scalablytyped.slinky" %%% "intl-messageformat-parser" % "6.0.17-c167fc",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
