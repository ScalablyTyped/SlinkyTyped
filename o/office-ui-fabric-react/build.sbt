organization := "org.scalablytyped.slinky"
name := "office-ui-fabric-react"
version := "7.115.1-9ec725"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "cheerio" % "v0.22.0-dt-20200515Z-0d2fd3",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-6e65be",
  "org.scalablytyped.slinky" %%% "enzyme" % "3.10-dt-20200515Z-8604bf",
  "org.scalablytyped.slinky" %%% "fluentui__react-focus" % "7.11.7-97e754",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ecc9ab",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200515Z-b103c7",
  "org.scalablytyped.slinky" %%% "react-dom" % "16.9-dt-20200519Z-bc6686",
  "org.scalablytyped.slinky" %%% "sinon" % "9.0-dt-20200519Z-09125f",
  "org.scalablytyped.slinky" %%% "sinonjs__fake-timers" % "6.0-dt-20200331Z-f928be",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0",
  "org.scalablytyped.slinky" %%% "uifabric__foundation" % "7.7.16-99a8f3",
  "org.scalablytyped.slinky" %%% "uifabric__icons" % "7.3.42-49601c",
  "org.scalablytyped.slinky" %%% "uifabric__merge-styles" % "7.14.0-061ff8",
  "org.scalablytyped.slinky" %%% "uifabric__styling" % "7.12.9-a4403d",
  "org.scalablytyped.slinky" %%% "uifabric__utilities" % "7.17.3-03ba5d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
