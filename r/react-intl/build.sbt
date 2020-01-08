organization := "org.scalablytyped.slinky"
name := "react-intl"
version := "3.9.3-6b5530"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-f22bc8",
  "org.scalablytyped.slinky" %%% "formatjs__intl-listformat" % "1.3.1-e0d317",
  "org.scalablytyped.slinky" %%% "formatjs__intl-relativetimeformat" % "4.5.1-272419",
  "org.scalablytyped.slinky" %%% "formatjs__intl-unified-numberformat" % "3.0.1-dae8b0",
  "org.scalablytyped.slinky" %%% "formatjs__intl-utils" % "2.0.1-479d87",
  "org.scalablytyped.slinky" %%% "intl-messageformat" % "7.7.5-af9b01",
  "org.scalablytyped.slinky" %%% "intl-messageformat-parser" % "3.5.3-f859f3",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-1d231d",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20191220Z-f02704",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        