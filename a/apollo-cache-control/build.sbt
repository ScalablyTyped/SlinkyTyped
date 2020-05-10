organization := "org.scalablytyped.slinky"
name := "apollo-cache-control"
version := "0.9.0-b2354d"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "apollo-engine-reporting-protobuf" % "0.4.4-661895",
  "org.scalablytyped.slinky" %%% "apollo-server-caching" % "0.5.1-fa0659",
  "org.scalablytyped.slinky" %%% "apollo-server-env" % "2.4.3-9d01fe",
  "org.scalablytyped.slinky" %%% "apollo-server-types" % "0.3.0-f43d45",
  "org.scalablytyped.slinky" %%% "apollo__protobufjs" % "1.0.3-8f256b",
  "org.scalablytyped.slinky" %%% "graphql" % "14.6.0-444891",
  "org.scalablytyped.slinky" %%% "graphql-extensions" % "0.11.0-d39515",
  "org.scalablytyped.slinky" %%% "long" % "4.0.0-dt-20200226Z-e43b6f",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
