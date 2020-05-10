organization := "org.scalablytyped.slinky"
name := "react-intl-redux"
version := "v0.1.0-dt-20200225Z-353dcd"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-fa3762",
  "org.scalablytyped.slinky" %%% "formatjs__intl-listformat" % "1.4.2-c81bbd",
  "org.scalablytyped.slinky" %%% "formatjs__intl-relativetimeformat" % "4.5.10-2de699",
  "org.scalablytyped.slinky" %%% "formatjs__intl-unified-numberformat" % "3.2.0-4b27d1",
  "org.scalablytyped.slinky" %%% "formatjs__intl-utils" % "2.2.0-322133",
  "org.scalablytyped.slinky" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-1f7b35",
  "org.scalablytyped.slinky" %%% "intl-messageformat" % "7.8.4-4c87ee",
  "org.scalablytyped.slinky" %%% "intl-messageformat-parser" % "3.6.4-e50b49",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-24495c",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200409Z-47fb9f",
  "org.scalablytyped.slinky" %%% "react-intl" % "3.12.1-949f6b",
  "org.scalablytyped.slinky" %%% "react-redux" % "7.1-dt-20200225Z-37e450",
  "org.scalablytyped.slinky" %%% "redux" % "4.0.5-e999f1",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
