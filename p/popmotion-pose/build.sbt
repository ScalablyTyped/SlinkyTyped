organization := "org.scalablytyped.slinky"
name := "popmotion-pose"
version := "3.4.11-6b88f5"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "popmotion__easing" % "1.0.2-adcbfc",
  "org.scalablytyped.slinky" %%% "pose-core" % "2.1.1-5e578b",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "style-value-types" % "3.1.9-5a2fba",
  "org.scalablytyped.slinky" %%% "stylefire" % "7.0.3-b80a9b",
  "org.scalablytyped.slinky" %%% "ts-essentials" % "2.0.12-ab5040")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
