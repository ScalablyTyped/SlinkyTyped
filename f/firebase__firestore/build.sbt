organization := "org.scalablytyped.slinky"
name := "firebase__firestore"
version := "1.12.2-591ee7"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "firebase__app-types" % "0.6.0-1cbce9",
  "org.scalablytyped.slinky" %%% "firebase__auth-interop-types" % "0.1.4-96aa04",
  "org.scalablytyped.slinky" %%% "firebase__component" % "0.1.8-690069",
  "org.scalablytyped.slinky" %%% "firebase__firestore-types" % "1.10.1-89aa95",
  "org.scalablytyped.slinky" %%% "firebase__logger" % "0.2.0-b0379d",
  "org.scalablytyped.slinky" %%% "firebase__util" % "0.2.43-0a4ca2",
  "org.scalablytyped.slinky" %%% "grpc" % "1.21.1-87b304",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "protobufjs" % "6.8.9-803ba6",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e",
  "org.scalablytyped.slinky" %%% "typescript" % "3.8.3-961b8f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
