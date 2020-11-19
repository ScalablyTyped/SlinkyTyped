organization := "org.scalablytyped.slinky"
name := "nivo__scatterplot"
version := "0.62.0-07a3fa"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "csstype" % "3.0.2-fce754",
  "org.scalablytyped.slinky" %%% "nivo__axes" % "0.62.0-59c082",
  "org.scalablytyped.slinky" %%% "nivo__colors" % "0.62.0-eb08ff",
  "org.scalablytyped.slinky" %%% "nivo__core" % "0.62.0-036f17",
  "org.scalablytyped.slinky" %%% "nivo__legends" % "0.62.0-222557",
  "org.scalablytyped.slinky" %%% "nivo__scales" % "0.62.0-af35f3",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ce652f",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200711Z-6a9854",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
