organization := "org.scalablytyped.slinky"
name := "apollo-upload-client"
version := "8.1-dt-20190827Z-e75c22"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "apollo-link" % "1.2.13-c98446",
  "org.scalablytyped.slinky" %%% "apollo-link-http-common" % "0.2.15-3624b1",
  "org.scalablytyped.slinky" %%% "extract-files" % "3.1-dt-20180516Z-7360e5",
  "org.scalablytyped.slinky" %%% "graphql" % "14.5.8-ffbf48",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43",
  "org.scalablytyped.slinky" %%% "ts-invariant" % "0.4.4-066ba3",
  "org.scalablytyped.slinky" %%% "zen-observable-ts" % "0.8.20-28d607")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        