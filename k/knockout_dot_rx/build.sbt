organization := "org.scalablytyped.slinky"
name := "knockout_dot_rx"
version := "1.0-dt-20200515Z-d72f11"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "knockout" % "v3.4.0-dt-20200515Z-91fbb9",
  "org.scalablytyped.slinky" %%% "rx-core" % "4.0-dt-20200515Z-453ef5",
  "org.scalablytyped.slinky" %%% "rx-core-binding" % "4.0-dt-20200515Z-6bb5ea",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
