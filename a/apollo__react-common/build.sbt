organization := "org.scalablytyped.slinky"
name := "apollo__react-common"
version := "3.1.3-90550d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "apollo-cache" % "1.3.2-f068e5",
  "org.scalablytyped.slinky" %%% "apollo-client" % "2.6.4-1c0f8f",
  "org.scalablytyped.slinky" %%% "apollo-link" % "1.2.13-c0afa5",
  "org.scalablytyped.slinky" %%% "apollo-utilities" % "1.3.2-cadd9c",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-34c756",
  "org.scalablytyped.slinky" %%% "graphql" % "14.5.8-a854ac",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-243f84",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20191126Z-6c3558",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821",
  "org.scalablytyped.slinky" %%% "zen-observable" % "0.8-dt-20180618Z-5c20b5",
  "org.scalablytyped.slinky" %%% "zen-observable-ts" % "0.8.20-9b9238")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        