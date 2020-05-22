organization := "org.scalablytyped.slinky"
name := "rx-dom"
version := "7.0-dt-20200515Z-a07044"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "rx-core" % "4.0-dt-20200515Z-453ef5",
  "org.scalablytyped.slinky" %%% "rx-core-binding" % "4.0-dt-20200515Z-6bb5ea",
  "org.scalablytyped.slinky" %%% "rx-lite" % "4.0-dt-20200515Z-b16bac",
  "org.scalablytyped.slinky" %%% "rx-lite-aggregates" % "4.0-dt-20200515Z-04aebb",
  "org.scalablytyped.slinky" %%% "rx-lite-async" % "4.0-dt-20200515Z-9195ab",
  "org.scalablytyped.slinky" %%% "rx-lite-backpressure" % "4.0-dt-20200515Z-96eced",
  "org.scalablytyped.slinky" %%% "rx-lite-joinpatterns" % "4.0-dt-20200515Z-6f4ed3",
  "org.scalablytyped.slinky" %%% "rx-lite-testing" % "4.0-dt-20200515Z-e9e77e",
  "org.scalablytyped.slinky" %%% "rx-lite-virtualtime" % "4.0-dt-20200515Z-5332f9",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
