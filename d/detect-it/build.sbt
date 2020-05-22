organization := "org.scalablytyped.slinky"
name := "detect-it"
version := "2.1-dt-20200515Z-588c42"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "detect-hover" % "1.0-dt-20200515Z-2dd3a2",
  "org.scalablytyped.slinky" %%% "detect-passive-events" % "1.0-dt-20200515Z-9d083b",
  "org.scalablytyped.slinky" %%% "detect-pointer" % "1.0-dt-20200515Z-6710ae",
  "org.scalablytyped.slinky" %%% "detect-touch-events" % "1.0-dt-20200515Z-48a411")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
