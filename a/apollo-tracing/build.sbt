organization := "org.scalablytyped.slinky"
name := "apollo-tracing"
version := "0.8.11-d1715d"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "apollo-engine-reporting-protobuf" % "0.4.4-29c49b",
  "org.scalablytyped.slinky" %%% "apollo-server-caching" % "0.5.1-f13506",
  "org.scalablytyped.slinky" %%% "apollo-server-env" % "2.4.3-d1315a",
  "org.scalablytyped.slinky" %%% "apollo-server-types" % "0.2.10-728ee4",
  "org.scalablytyped.slinky" %%% "apollo__protobufjs" % "1.0.3-ac7503",
  "org.scalablytyped.slinky" %%% "graphql" % "14.6.0-1eff51",
  "org.scalablytyped.slinky" %%% "graphql-extensions" % "0.10.10-324c04",
  "org.scalablytyped.slinky" %%% "long" % "4.0.0-dt-20200226Z-1ae2d8",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
