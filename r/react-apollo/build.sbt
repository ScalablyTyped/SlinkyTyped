organization := "org.scalablytyped.slinky"
name := "react-apollo"
version := "3.1.5-f90cac"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "apollo-cache" % "1.3.5-3fe549",
  "org.scalablytyped.slinky" %%% "apollo-client" % "2.6.10-c8eb18",
  "org.scalablytyped.slinky" %%% "apollo-link" % "1.2.13-f31c99",
  "org.scalablytyped.slinky" %%% "apollo-utilities" % "1.3.2-d92861",
  "org.scalablytyped.slinky" %%% "apollo__react-common" % "3.1.4-808b62",
  "org.scalablytyped.slinky" %%% "apollo__react-components" % "3.1.5-b4fffe",
  "org.scalablytyped.slinky" %%% "apollo__react-hoc" % "3.1.5-f5ce09",
  "org.scalablytyped.slinky" %%% "apollo__react-hooks" % "3.1.5-797616",
  "org.scalablytyped.slinky" %%% "apollo__react-ssr" % "3.1.5-a1bc5a",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-6e65be",
  "org.scalablytyped.slinky" %%% "graphql" % "14.6.0-19956e",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ecc9ab",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200515Z-b103c7",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0",
  "org.scalablytyped.slinky" %%% "zen-observable" % "0.8-dt-20200515Z-6cb70a",
  "org.scalablytyped.slinky" %%% "zen-observable-ts" % "0.8.20-ba96e6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
