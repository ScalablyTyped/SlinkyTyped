organization := "org.scalablytyped.slinky"
name := "apollo-cache-control"
version := "0.8.10-af6b3d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "apollo-engine-reporting-protobuf" % "0.4.4-85454d",
  "org.scalablytyped.slinky" %%% "apollo-server-caching" % "0.5.1-7d290c",
  "org.scalablytyped.slinky" %%% "apollo-server-env" % "2.4.3-27d21d",
  "org.scalablytyped.slinky" %%% "apollo-server-types" % "0.2.10-923fdb",
  "org.scalablytyped.slinky" %%% "apollo__protobufjs" % "1.0.3-3a3788",
  "org.scalablytyped.slinky" %%% "graphql" % "14.5.8-ffbf48",
  "org.scalablytyped.slinky" %%% "graphql-extensions" % "0.10.9-7d49f7",
  "org.scalablytyped.slinky" %%% "long" % "4.0.0-dt-20190322Z-386ebc",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        