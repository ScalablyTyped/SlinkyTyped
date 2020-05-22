organization := "org.scalablytyped.slinky"
name := "samchon-framework"
version := "2.1.4-1d6afd"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "ecol" % "1.1.0-ea301b",
  "org.scalablytyped.slinky" %%% "samchon" % "2.1.4-e53ad8",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0",
  "org.scalablytyped.slinky" %%% "sxml" % "1.0.3-32cdcf",
  "org.scalablytyped.slinky" %%% "tstl" % "2.4.6-ef7e7f",
  "org.scalablytyped.slinky" %%% "url-variables" % "1.0.2-5f798f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
