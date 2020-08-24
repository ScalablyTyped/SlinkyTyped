organization := "org.scalablytyped.slinky"
name := "google-cloud__storage"
version := "5.1.2-a0bac3"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "gaxios" % "3.1.0-f847ca",
  "org.scalablytyped.slinky" %%% "google-auth-library" % "6.0.6-7542cb",
  "org.scalablytyped.slinky" %%% "google-cloud__common" % "3.3.2-9b87a9",
  "org.scalablytyped.slinky" %%% "gtoken" % "5.0.3-606945",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-df8c17",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8",
  "org.scalablytyped.slinky" %%% "teeny-request" % "7.0.0-606655")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
