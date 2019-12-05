organization := "org.scalablytyped.slinky"
name := "apollo-upload-client"
version := "8.1-dt-20190827Z-dcef9b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "apollo-link" % "1.2.13-c0afa5",
  "org.scalablytyped.slinky" %%% "apollo-link-http-common" % "0.2.15-c9493c",
  "org.scalablytyped.slinky" %%% "extract-files" % "3.1-dt-20180516Z-080677",
  "org.scalablytyped.slinky" %%% "graphql" % "14.5.8-a854ac",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821",
  "org.scalablytyped.slinky" %%% "ts-invariant" % "0.4.4-2b2257",
  "org.scalablytyped.slinky" %%% "zen-observable-ts" % "0.8.20-9b9238")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        