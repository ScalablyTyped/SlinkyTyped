organization := "org.scalablytyped.slinky"
name := "material__textfield"
version := "0.35-dt-20200515Z-096ad2"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "material__base" % "0.35-dt-20200515Z-d9eeaf",
  "org.scalablytyped.slinky" %%% "material__floating-label" % "0.35-dt-20200515Z-c75c5c",
  "org.scalablytyped.slinky" %%% "material__line-ripple" % "0.35-dt-20200515Z-b549f5",
  "org.scalablytyped.slinky" %%% "material__notched-outline" % "0.35-dt-20200515Z-d87863",
  "org.scalablytyped.slinky" %%% "material__ripple" % "0.35-dt-20200515Z-1ed588",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
