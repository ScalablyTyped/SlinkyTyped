organization := "org.scalablytyped.slinky"
name := "samchon-framework"
version := "2.1.4-69e3c2"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "ecol" % "1.1.1-150685",
  "org.scalablytyped.slinky" %%% "samchon" % "2.1.4-dca6f0",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "sxml" % "1.0.4-4dd2db",
  "org.scalablytyped.slinky" %%% "tstl" % "2.4.11-8c5837",
  "org.scalablytyped.slinky" %%% "url-variables" % "1.0.3-ddc2d2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
