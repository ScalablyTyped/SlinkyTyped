organization := "org.scalablytyped.slinky"
name := "pollyjs__adapter-fetch"
version := "2.0-dt-20200515Z-7d675f"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "pollyjs__adapter" % "3.0-dt-20200515Z-29d29e",
  "org.scalablytyped.slinky" %%% "pollyjs__core" % "4.0-dt-20200125Z-5d0a79",
  "org.scalablytyped.slinky" %%% "pollyjs__persister" % "2.0-dt-20200515Z-955d4f",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
