organization := "org.scalablytyped.slinky"
name := "formatjs__intl"
version := "1.4.8-f06614"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "formatjs__ecma402-abstract" % "1.5.0-37d0d0",
  "org.scalablytyped.slinky" %%% "formatjs__intl-displaynames" % "4.0.0-b79e09",
  "org.scalablytyped.slinky" %%% "formatjs__intl-listformat" % "5.0.0-d16d60",
  "org.scalablytyped.slinky" %%% "formatjs__intl-relativetimeformat" % "8.0.0-f35897",
  "org.scalablytyped.slinky" %%% "intl-messageformat" % "9.3.19-90c618",
  "org.scalablytyped.slinky" %%% "intl-messageformat-parser" % "6.0.17-e5eeea",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
