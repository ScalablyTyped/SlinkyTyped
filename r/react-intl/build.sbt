organization := "org.scalablytyped.slinky"
name := "react-intl"
version := "3.12.1-091981"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-e9335f",
  "org.scalablytyped.slinky" %%% "formatjs__intl-listformat" % "1.4.2-8677f1",
  "org.scalablytyped.slinky" %%% "formatjs__intl-relativetimeformat" % "4.5.10-f3b883",
  "org.scalablytyped.slinky" %%% "formatjs__intl-unified-numberformat" % "3.2.0-2a0489",
  "org.scalablytyped.slinky" %%% "formatjs__intl-utils" % "2.2.0-ff350e",
  "org.scalablytyped.slinky" %%% "intl-messageformat" % "7.8.4-169c43",
  "org.scalablytyped.slinky" %%% "intl-messageformat-parser" % "3.6.4-844b2d",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-7e1d98",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200409Z-36b705",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
