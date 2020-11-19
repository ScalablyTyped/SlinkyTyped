organization := "org.scalablytyped.slinky"
name := "googleapis"
version := "39.2.0-febed5"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "gaxios" % "3.1.0-e0ec23",
  "org.scalablytyped.slinky" %%% "google-auth-library" % "6.0.6-cfd9c5",
  "org.scalablytyped.slinky" %%% "googleapis-common" % "0.7.2-b822af",
  "org.scalablytyped.slinky" %%% "gtoken" % "5.0.3-c7419f",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
