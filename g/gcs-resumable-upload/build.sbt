organization := "org.scalablytyped.slinky"
name := "gcs-resumable-upload"
version := "3.1.1-70f972"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "configstore" % "4.0-dt-20200515Z-85079d",
  "org.scalablytyped.slinky" %%% "duplexify" % "3.6-dt-20200515Z-d9aeba",
  "org.scalablytyped.slinky" %%% "gaxios" % "4.0.1-40a6c2",
  "org.scalablytyped.slinky" %%% "google-auth-library" % "6.1.3-2c8806",
  "org.scalablytyped.slinky" %%% "gtoken" % "5.1.0-a68c7c",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "pumpify" % "1.4-dt-20181017Z-e122de",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
