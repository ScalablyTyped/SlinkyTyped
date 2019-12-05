organization := "org.scalablytyped.slinky"
name := "apollo-server-plugin-base"
version := "0.6.8-d63451"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "apollo-engine-reporting-protobuf" % "0.4.4-f4cfc5",
  "org.scalablytyped.slinky" %%% "apollo-server-caching" % "0.5.0-e46db5",
  "org.scalablytyped.slinky" %%% "apollo-server-env" % "2.4.3-c26879",
  "org.scalablytyped.slinky" %%% "apollo-server-types" % "0.2.8-46fa41",
  "org.scalablytyped.slinky" %%% "apollo__protobufjs" % "1.0.3-9b8b84",
  "org.scalablytyped.slinky" %%% "graphql" % "14.5.8-a854ac",
  "org.scalablytyped.slinky" %%% "long" % "4.0.0-dt-20190322Z-ac0727",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        