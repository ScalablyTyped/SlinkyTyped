organization := "org.scalablytyped.slinky"
name := "fluentui__react-focus"
version := "7.1.9-44b5b1"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "cheerio" % "v0.22.0-dt-20200423Z-6f7e44",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-e9335f",
  "org.scalablytyped.slinky" %%% "enzyme" % "3.10-dt-20200225Z-7af027",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-7e1d98",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200409Z-36b705",
  "org.scalablytyped.slinky" %%% "sinon" % "9.0-dt-20200331Z-65602a",
  "org.scalablytyped.slinky" %%% "sinonjs__fake-timers" % "6.0-dt-20200331Z-790a7d",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "uifabric__merge-styles" % "7.8.9-66de20",
  "org.scalablytyped.slinky" %%% "uifabric__utilities" % "7.15.2-50848c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
