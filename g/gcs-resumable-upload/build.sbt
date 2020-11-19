organization := "org.scalablytyped.slinky"
name := "gcs-resumable-upload"
version := "3.1.1-122669"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "configstore" % "4.0-dt-20200515Z-85079d",
  "org.scalablytyped.slinky" %%% "duplexify" % "3.6-dt-20200515Z-82831c",
  "org.scalablytyped.slinky" %%% "gaxios" % "3.1.0-e0ec23",
  "org.scalablytyped.slinky" %%% "google-auth-library" % "6.0.6-cfd9c5",
  "org.scalablytyped.slinky" %%% "gtoken" % "5.0.3-c7419f",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "pumpify" % "1.4-dt-20181017Z-26dd06",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
