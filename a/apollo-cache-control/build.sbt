organization := "org.scalablytyped.slinky"
name := "apollo-cache-control"
version := "0.9.0-c8b41e"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "apollo-engine-reporting-protobuf" % "0.4.4-eaf7d8",
  "org.scalablytyped.slinky" %%% "apollo-server-caching" % "0.5.1-55a6c4",
  "org.scalablytyped.slinky" %%% "apollo-server-env" % "2.4.3-d10ad3",
  "org.scalablytyped.slinky" %%% "apollo-server-types" % "0.3.0-000103",
  "org.scalablytyped.slinky" %%% "apollo__protobufjs" % "1.0.3-618529",
  "org.scalablytyped.slinky" %%% "graphql" % "14.6.0-5be153",
  "org.scalablytyped.slinky" %%% "graphql-extensions" % "0.11.0-7c8205",
  "org.scalablytyped.slinky" %%% "long" % "4.0.0-dt-20200226Z-da0575",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
