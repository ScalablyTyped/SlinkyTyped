organization := "org.scalablytyped.slinky"
name := "backbone_dot_radio"
version := "0.8-dt-20200515Z-f0d037"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "backbone" % "1.4-dt-20200612Z-18fe9e",
  "org.scalablytyped.slinky" %%% "jquery" % "3.5-dt-20200621Z-0ef923",
  "org.scalablytyped.slinky" %%% "sizzle" % "2.3-dt-20200515Z-3ae803",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "underscore" % "1.10-dt-20200724Z-293e6d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
