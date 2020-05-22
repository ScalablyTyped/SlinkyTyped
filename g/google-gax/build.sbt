organization := "org.scalablytyped.slinky"
name := "google-gax"
version := "1.15.3-93ec8a"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "gaxios" % "2.0.1-a9f797",
  "org.scalablytyped.slinky" %%% "google-auth-library" % "5.3.0-181e58",
  "org.scalablytyped.slinky" %%% "grpc__grpc-js" % "1.0.3-be69e0",
  "org.scalablytyped.slinky" %%% "grpc__proto-loader" % "0.5.4-a48dbd",
  "org.scalablytyped.slinky" %%% "gtoken" % "4.1.0-b1b091",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "protobufjs" % "6.9.0-b83d51",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
