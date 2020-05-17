organization := "org.scalablytyped.slinky"
name := "react-apollo"
version := "3.1.3-a3858b"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "apollo-cache" % "1.3.4-a8ecee",
  "org.scalablytyped.slinky" %%% "apollo-client" % "2.6.8-1d0599",
  "org.scalablytyped.slinky" %%% "apollo-link" % "1.2.13-b167c5",
  "org.scalablytyped.slinky" %%% "apollo-utilities" % "1.3.2-4cb436",
  "org.scalablytyped.slinky" %%% "apollo__react-common" % "3.1.3-3a0c3a",
  "org.scalablytyped.slinky" %%% "apollo__react-components" % "3.1.3-bf090d",
  "org.scalablytyped.slinky" %%% "apollo__react-hoc" % "3.1.3-33c573",
  "org.scalablytyped.slinky" %%% "apollo__react-hooks" % "3.1.3-f25687",
  "org.scalablytyped.slinky" %%% "apollo__react-ssr" % "3.1.3-51e545",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-e9335f",
  "org.scalablytyped.slinky" %%% "graphql" % "14.6.0-5be153",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-7e1d98",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200409Z-36b705",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "zen-observable" % "0.8-dt-20200225Z-502850",
  "org.scalablytyped.slinky" %%% "zen-observable-ts" % "0.8.20-4f9a1b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
