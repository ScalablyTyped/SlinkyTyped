organization := "org.scalablytyped.slinky"
name := "firebase__firestore"
version := "1.10.2-d4cccd"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "firebase__app-types" % "0.5.1-c1c107",
  "org.scalablytyped.slinky" %%% "firebase__auth-interop-types" % "0.1.2-df0644",
  "org.scalablytyped.slinky" %%% "firebase__component" % "0.1.5-591edd",
  "org.scalablytyped.slinky" %%% "firebase__firestore-types" % "1.9.1-4cf5b9",
  "org.scalablytyped.slinky" %%% "firebase__util" % "0.2.40-9ff338",
  "org.scalablytyped.slinky" %%% "grpc" % "1.21.1-172b7c",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "protobufjs" % "6.8.8-51b95b",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "typescript" % "3.8.2-65a561")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
