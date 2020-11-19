organization := "org.scalablytyped.slinky"
name := "dc"
version := "0.0-unknown-dt-20200515Z-97055b"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "d3-color" % "1.2-dt-20200515Z-3e2313",
  "org.scalablytyped.slinky" %%% "d3-selection" % "1.4-dt-20200707Z-e0c377",
  "org.scalablytyped.slinky" %%% "d3-transition" % "1.1-dt-20200515Z-8183b5",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
