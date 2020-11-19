organization := "org.scalablytyped.slinky"
name := "jasmine-jquery"
version := "1.5.8-dt-20200515Z-af794f"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "jasmine" % "3.5-dt-20200622Z-f3595b",
  "org.scalablytyped.slinky" %%% "jquery" % "3.5-dt-20200621Z-0ef923",
  "org.scalablytyped.slinky" %%% "sizzle" % "2.3-dt-20200515Z-3ae803",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
