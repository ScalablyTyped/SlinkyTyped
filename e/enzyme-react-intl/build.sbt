organization := "org.scalablytyped.slinky"
name := "enzyme-react-intl"
version := "2.0-dt-20201116Z-f3b204"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "cheerio" % "v0.22.0-dt-20201002Z-37cf48",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.14-58bcb0",
  "org.scalablytyped.slinky" %%% "enzyme" % "3.10-dt-20201028Z-b23993",
  "org.scalablytyped.slinky" %%% "formatjs__ecma402-abstract" % "1.5.0-3dc81c",
  "org.scalablytyped.slinky" %%% "formatjs__intl" % "1.4.8-ee4875",
  "org.scalablytyped.slinky" %%% "formatjs__intl-displaynames" % "4.0.0-e6e295",
  "org.scalablytyped.slinky" %%% "formatjs__intl-listformat" % "5.0.0-50b1ad",
  "org.scalablytyped.slinky" %%% "formatjs__intl-relativetimeformat" % "8.0.0-ac6332",
  "org.scalablytyped.slinky" %%% "intl-messageformat" % "9.3.19-bdc8a0",
  "org.scalablytyped.slinky" %%% "intl-messageformat-parser" % "6.0.17-c167fc",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-931d77",
  "org.scalablytyped.slinky" %%% "react" % "17.0-dt-20201121Z-9cde70",
  "org.scalablytyped.slinky" %%% "react-intl" % "5.10.4-8e58b2",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
