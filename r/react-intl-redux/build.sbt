organization := "org.scalablytyped.slinky"
name := "react-intl-redux"
version := "v0.1.0-dt-20200515Z-793767"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.14-23cf0c",
  "org.scalablytyped.slinky" %%% "formatjs__ecma402-abstract" % "1.5.0-37d0d0",
  "org.scalablytyped.slinky" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-750dce",
  "org.scalablytyped.slinky" %%% "intl-messageformat" % "9.3.19-90c618",
  "org.scalablytyped.slinky" %%% "intl-messageformat-parser" % "6.0.17-e5eeea",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ed7fbd",
  "org.scalablytyped.slinky" %%% "react" % "17.0-dt-20201121Z-8f0b52",
  "org.scalablytyped.slinky" %%% "react-intl" % "5.10.4-7f8844",
  "org.scalablytyped.slinky" %%% "react-redux" % "7.1-dt-20201103Z-6ff589",
  "org.scalablytyped.slinky" %%% "redux" % "4.0.5-f9ab72",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
