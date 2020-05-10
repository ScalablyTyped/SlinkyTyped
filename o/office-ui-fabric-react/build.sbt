organization := "org.scalablytyped.slinky"
name := "office-ui-fabric-react"
version := "7.105.2-38606b"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "cheerio" % "v0.22.0-dt-20200423Z-05069e",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-fa3762",
  "org.scalablytyped.slinky" %%% "enzyme" % "3.10-dt-20200225Z-648278",
  "org.scalablytyped.slinky" %%% "fluentui__react-focus" % "7.1.9-9bbb91",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-24495c",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200409Z-47fb9f",
  "org.scalablytyped.slinky" %%% "react-dom" % "16.9-dt-20200331Z-3fda3c",
  "org.scalablytyped.slinky" %%% "sinon" % "9.0-dt-20200331Z-5008a2",
  "org.scalablytyped.slinky" %%% "sinonjs__fake-timers" % "6.0-dt-20200331Z-d6428d",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e",
  "org.scalablytyped.slinky" %%% "uifabric__foundation" % "7.5.22-c22387",
  "org.scalablytyped.slinky" %%% "uifabric__icons" % "7.3.21-e103ca",
  "org.scalablytyped.slinky" %%% "uifabric__merge-styles" % "7.8.9-76d0a8",
  "org.scalablytyped.slinky" %%% "uifabric__styling" % "7.10.22-0250c9",
  "org.scalablytyped.slinky" %%% "uifabric__utilities" % "7.15.2-9fc7e7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
