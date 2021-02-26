organization := "org.scalablytyped.slinky"
name := "detect-it"
version := "2.1-dt-20200515Z-7cc65e"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "detect-hover" % "1.0-dt-20200515Z-5ca397",
  "org.scalablytyped.slinky" %%% "detect-passive-events" % "1.0-dt-20200515Z-cc6ff1",
  "org.scalablytyped.slinky" %%% "detect-pointer" % "1.0-dt-20200515Z-6e0abb",
  "org.scalablytyped.slinky" %%% "detect-touch-events" % "1.0-dt-20200515Z-78d3ac")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
