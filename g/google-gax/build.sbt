organization := "org.scalablytyped.slinky"
name := "google-gax"
version := "1.15.1-cc552f"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "gaxios" % "2.0.1-326730",
  "org.scalablytyped.slinky" %%% "google-auth-library" % "5.3.0-f53a74",
  "org.scalablytyped.slinky" %%% "grpc__grpc-js" % "0.6.18-a36456",
  "org.scalablytyped.slinky" %%% "grpc__proto-loader" % "0.5.3-83f879",
  "org.scalablytyped.slinky" %%% "gtoken" % "4.1.0-a23a03",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "protobufjs" % "6.8.9-408d39",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
