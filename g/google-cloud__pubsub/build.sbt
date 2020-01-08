organization := "org.scalablytyped.slinky"
name := "google-cloud__pubsub"
version := "1.2.0-67f22a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "gaxios" % "2.0.1-dec8a8",
  "org.scalablytyped.slinky" %%% "google-auth-library" % "5.3.0-aa1477",
  "org.scalablytyped.slinky" %%% "google-cloud__precise-date" % "1.0.3-322d66",
  "org.scalablytyped.slinky" %%% "google-gax" % "1.12.0-bf40f7",
  "org.scalablytyped.slinky" %%% "grpc__grpc-js" % "0.6.15-19a9ed",
  "org.scalablytyped.slinky" %%% "grpc__proto-loader" % "0.5.3-a6bc03",
  "org.scalablytyped.slinky" %%% "gtoken" % "4.1.0-9b1d69",
  "org.scalablytyped.slinky" %%% "long" % "4.0.0-dt-20190322Z-386ebc",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "p-defer" % "3.0.0-df7854",
  "org.scalablytyped.slinky" %%% "protobufjs" % "6.8.8-78522c",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        