organization := "org.scalablytyped.slinky"
name := "gcs-resumable-upload"
version := "3.1.1-d12096"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "configstore" % "4.0-dt-20200515Z-193388",
  "org.scalablytyped.slinky" %%% "duplexify" % "3.6-dt-20200515Z-347430",
  "org.scalablytyped.slinky" %%% "gaxios" % "3.1.0-f847ca",
  "org.scalablytyped.slinky" %%% "google-auth-library" % "6.0.6-7542cb",
  "org.scalablytyped.slinky" %%% "gtoken" % "5.0.3-606945",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-df8c17",
  "org.scalablytyped.slinky" %%% "pumpify" % "1.4-dt-20181017Z-4b967f",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
