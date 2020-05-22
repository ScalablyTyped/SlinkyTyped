organization := "org.scalablytyped.slinky"
name := "react-intl"
version := "3.12.1-5e9a08"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-6e65be",
  "org.scalablytyped.slinky" %%% "formatjs__intl-listformat" % "1.4.2-4e5076",
  "org.scalablytyped.slinky" %%% "formatjs__intl-relativetimeformat" % "4.5.10-4a5cca",
  "org.scalablytyped.slinky" %%% "formatjs__intl-unified-numberformat" % "3.2.0-5636fa",
  "org.scalablytyped.slinky" %%% "formatjs__intl-utils" % "2.2.0-5544c0",
  "org.scalablytyped.slinky" %%% "intl-messageformat" % "7.8.4-c27260",
  "org.scalablytyped.slinky" %%% "intl-messageformat-parser" % "3.6.4-f3133c",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ecc9ab",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200515Z-b103c7",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
