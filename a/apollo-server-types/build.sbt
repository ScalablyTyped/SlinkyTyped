organization := "org.scalablytyped.slinky"
name := "apollo-server-types"
version := "0.4.1-alpha.0-d79ed0"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "apollo-engine-reporting-protobuf" % "0.5.1-alpha.1-0f9eef",
  "org.scalablytyped.slinky" %%% "apollo-server-caching" % "0.5.1-95fbe2",
  "org.scalablytyped.slinky" %%% "apollo-server-env" % "2.4.4-alpha.0-39c1fb",
  "org.scalablytyped.slinky" %%% "apollo__protobufjs" % "1.0.3-d4c0fa",
  "org.scalablytyped.slinky" %%% "graphql" % "14.6.0-19956e",
  "org.scalablytyped.slinky" %%% "long" % "4.0.0-dt-20200515Z-ced51c",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
