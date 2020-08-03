organization := "org.scalablytyped.slinky"
name := "rc-field-form"
version := "1.8.0-17ff8f"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "3.0.2-b1f63d",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-77dff4",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200711Z-6a2e4b",
  "org.scalablytyped.slinky" %%% "std" % "3.9-25efe0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
