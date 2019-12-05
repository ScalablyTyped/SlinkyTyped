organization := "org.scalablytyped.slinky"
name := "firebase__firestore"
version := "1.8.0-665d71"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "firebase__app-types" % "0.4.7-fa5f63",
  "org.scalablytyped.slinky" %%% "firebase__firestore-types" % "1.8.0-a5ae32",
  "org.scalablytyped.slinky" %%% "firebase__util" % "0.2.33-595e5d",
  "org.scalablytyped.slinky" %%% "grpc" % "1.21.1-83d816",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "protobufjs" % "6.8.8-8aff0a",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        