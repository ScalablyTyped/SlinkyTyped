organization := "org.scalablytyped.slinky"
name := "intl-messageformat"
version := "7.8.4-4ff682"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "formatjs__intl-unified-numberformat" % "3.2.0-627699",
  "org.scalablytyped.slinky" %%% "formatjs__intl-utils" % "2.2.0-2d1aa1",
  "org.scalablytyped.slinky" %%% "intl-messageformat-parser" % "3.6.4-3da102",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
