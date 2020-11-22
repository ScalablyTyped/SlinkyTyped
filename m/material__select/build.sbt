organization := "org.scalablytyped.slinky"
name := "material__select"
version := "8.0.0-f4cac1"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "material__base" % "8.0.0-6c4191",
  "org.scalablytyped.slinky" %%% "material__floating-label" % "8.0.0-fab707",
  "org.scalablytyped.slinky" %%% "material__line-ripple" % "8.0.0-c6a073",
  "org.scalablytyped.slinky" %%% "material__list" % "8.0.0-404077",
  "org.scalablytyped.slinky" %%% "material__menu" % "8.0.0-65a278",
  "org.scalablytyped.slinky" %%% "material__menu-surface" % "8.0.0-2fbaae",
  "org.scalablytyped.slinky" %%% "material__notched-outline" % "8.0.0-30d25b",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
