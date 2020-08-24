organization := "org.scalablytyped.slinky"
name := "fhir-kit-client"
version := "1.1-dt-20200515Z-fd4b26"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "caseless" % "0.12-dt-20200515Z-ea521b",
  "org.scalablytyped.slinky" %%% "fhir" % "0.0-unknown-dt-20200515Z-8dcf38",
  "org.scalablytyped.slinky" %%% "form-data" % "3.0.0-cbc882",
  "org.scalablytyped.slinky" %%% "json-patch" % "0.0-unknown-dt-20200515Z-5d84de",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-df8c17",
  "org.scalablytyped.slinky" %%% "request" % "2.48-dt-20200515Z-25c97e",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8",
  "org.scalablytyped.slinky" %%% "tough-cookie" % "4.0-dt-20200515Z-0b128d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
