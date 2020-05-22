organization := "org.scalablytyped.slinky"
name := "gcs-resumable-upload"
version := "2.3.0-0b1944"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "configstore" % "4.0-dt-20200515Z-7a4693",
  "org.scalablytyped.slinky" %%% "duplexify" % "3.6-dt-20200515Z-b9e5c9",
  "org.scalablytyped.slinky" %%% "gaxios" % "2.0.1-a9f797",
  "org.scalablytyped.slinky" %%% "google-auth-library" % "5.3.0-181e58",
  "org.scalablytyped.slinky" %%% "gtoken" % "4.1.0-b1b091",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "pumpify" % "1.4-dt-20181017Z-708394",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
