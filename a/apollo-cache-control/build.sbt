organization := "org.scalablytyped.slinky"
name := "apollo-cache-control"
version := "0.11.1-d1519c"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "apollo-engine-reporting-protobuf" % "0.5.2-17c4fc",
  "org.scalablytyped.slinky" %%% "apollo-server-caching" % "0.5.2-ce138d",
  "org.scalablytyped.slinky" %%% "apollo-server-env" % "2.4.5-ecb1c0",
  "org.scalablytyped.slinky" %%% "apollo-server-plugin-base" % "0.9.1-08857b",
  "org.scalablytyped.slinky" %%% "apollo-server-types" % "0.5.1-195ffb",
  "org.scalablytyped.slinky" %%% "apollo__protobufjs" % "1.0.4-9de077",
  "org.scalablytyped.slinky" %%% "graphql" % "15.3.0-09ebdf",
  "org.scalablytyped.slinky" %%% "long" % "4.0.0-dt-20200515Z-e923b0",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
