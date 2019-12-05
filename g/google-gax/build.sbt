organization := "org.scalablytyped.slinky"
name := "google-gax"
version := "1.7.5-44d2fc"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "gaxios" % "2.0.1-51a84d",
  "org.scalablytyped.slinky" %%% "google-auth-library" % "5.3.0-87b112",
  "org.scalablytyped.slinky" %%% "grpc__grpc-js" % "0.6.9-fa71de",
  "org.scalablytyped.slinky" %%% "grpc__proto-loader" % "0.5.3-dad77c",
  "org.scalablytyped.slinky" %%% "gtoken" % "4.1.0-db5a10",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "protobufjs" % "6.8.8-8aff0a",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        