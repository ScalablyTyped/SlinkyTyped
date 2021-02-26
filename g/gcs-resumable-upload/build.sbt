organization := "org.scalablytyped.slinky"
name := "gcs-resumable-upload"
version := "3.1.1-acbe77"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "configstore" % "4.0-dt-20200515Z-17c8ea",
  "org.scalablytyped.slinky" %%% "duplexify" % "3.6-dt-20200515Z-c390ab",
  "org.scalablytyped.slinky" %%% "gaxios" % "4.0.1-b7ad40",
  "org.scalablytyped.slinky" %%% "google-auth-library" % "6.1.3-d0c57d",
  "org.scalablytyped.slinky" %%% "gtoken" % "5.1.0-039104",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "pumpify" % "1.4-dt-20181017Z-77312e",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
