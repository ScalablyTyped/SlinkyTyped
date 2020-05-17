organization := "org.scalablytyped.slinky"
name := "firebase__firestore"
version := "1.12.2-7fe537"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "firebase__app-types" % "0.6.0-4b25d1",
  "org.scalablytyped.slinky" %%% "firebase__auth-interop-types" % "0.1.4-b7ab89",
  "org.scalablytyped.slinky" %%% "firebase__component" % "0.1.8-2d69ff",
  "org.scalablytyped.slinky" %%% "firebase__firestore-types" % "1.10.1-507b2b",
  "org.scalablytyped.slinky" %%% "firebase__logger" % "0.2.0-ea8d5a",
  "org.scalablytyped.slinky" %%% "firebase__util" % "0.2.43-be1185",
  "org.scalablytyped.slinky" %%% "grpc" % "1.21.1-5dcbc5",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "protobufjs" % "6.8.9-408d39",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "typescript" % "3.8.3-472acc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
