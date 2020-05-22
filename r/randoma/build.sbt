organization := "org.scalablytyped.slinky"
name := "randoma"
version := "1.3.0-462ee0"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "color" % "3.0-dt-20200515Z-d15d89",
  "org.scalablytyped.slinky" %%% "color-convert" % "1.9-dt-20200515Z-1894c1",
  "org.scalablytyped.slinky" %%% "color-name" % "1.1-dt-20200515Z-581139",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
