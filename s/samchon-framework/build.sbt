organization := "org.scalablytyped.slinky"
name := "samchon-framework"
version := "2.1.4-08b10b"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "ecol" % "1.1.1-ab6e88",
  "org.scalablytyped.slinky" %%% "samchon" % "2.1.4-3cc986",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533",
  "org.scalablytyped.slinky" %%% "sxml" % "1.0.4-4cbdf4",
  "org.scalablytyped.slinky" %%% "tstl" % "2.4.12-581692",
  "org.scalablytyped.slinky" %%% "url-variables" % "1.0.3-ba8b76")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
