organization := "org.scalablytyped.slinky"
name := "apollo-cache-control"
version := "0.11.1-b2c0dd"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "apollo-engine-reporting-protobuf" % "0.5.2-fa4a23",
  "org.scalablytyped.slinky" %%% "apollo-server-caching" % "0.5.2-c55dfb",
  "org.scalablytyped.slinky" %%% "apollo-server-env" % "2.4.5-fe3e08",
  "org.scalablytyped.slinky" %%% "apollo-server-plugin-base" % "0.9.1-2f70e0",
  "org.scalablytyped.slinky" %%% "apollo-server-types" % "0.5.1-729b7a",
  "org.scalablytyped.slinky" %%% "apollo__protobufjs" % "1.0.4-931db8",
  "org.scalablytyped.slinky" %%% "graphql" % "15.3.0-079e56",
  "org.scalablytyped.slinky" %%% "long" % "4.0.0-dt-20200515Z-197361",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-df8c17",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
