organization := "org.scalablytyped.slinky"
name := "react-intl-redux"
version := "v0.1.0-dt-20191111Z-22ba6f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-34c756",
  "org.scalablytyped.slinky" %%% "formatjs__intl-listformat" % "1.2.7-165175",
  "org.scalablytyped.slinky" %%% "formatjs__intl-relativetimeformat" % "4.4.6-6cb173",
  "org.scalablytyped.slinky" %%% "formatjs__intl-unified-numberformat" % "2.1.7-8c9891",
  "org.scalablytyped.slinky" %%% "formatjs__intl-utils" % "1.4.4-104733",
  "org.scalablytyped.slinky" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-549e65",
  "org.scalablytyped.slinky" %%% "intl-messageformat" % "7.6.1-08d787",
  "org.scalablytyped.slinky" %%% "intl-messageformat-parser" % "3.3.1-56de4b",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-243f84",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20191126Z-6c3558",
  "org.scalablytyped.slinky" %%% "react-intl" % "3.7.0-c42a66",
  "org.scalablytyped.slinky" %%% "react-redux" % "7.1-dt-20191018Z-589dde",
  "org.scalablytyped.slinky" %%% "redux" % "4.0.4-1fd55d",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        