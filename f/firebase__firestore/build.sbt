organization := "org.scalablytyped.slinky"
name := "firebase__firestore"
version := "1.9.1-9d050d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "firebase__app-types" % "0.5.0-b17dbb",
  "org.scalablytyped.slinky" %%% "firebase__auth-interop-types" % "0.1.1-d71cc5",
  "org.scalablytyped.slinky" %%% "firebase__component" % "0.1.1-f087af",
  "org.scalablytyped.slinky" %%% "firebase__firestore-types" % "1.9.0-05b412",
  "org.scalablytyped.slinky" %%% "firebase__util" % "0.2.36-7c6aeb",
  "org.scalablytyped.slinky" %%% "grpc" % "1.21.1-26466f",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "protobufjs" % "6.8.8-78522c",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        