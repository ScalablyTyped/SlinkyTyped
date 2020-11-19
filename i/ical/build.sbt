organization := "org.scalablytyped.slinky"
name := "ical"
version := "0.6-dt-20191105Z-9a05ee"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "caseless" % "0.12-dt-20200515Z-da01e2",
  "org.scalablytyped.slinky" %%% "form-data" % "3.0.0-5f101b",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "request" % "2.48-dt-20200515Z-cd564b",
  "org.scalablytyped.slinky" %%% "rrule" % "2.6.4-b7c624",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "tough-cookie" % "4.0-dt-20200515Z-03bfc7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
