organization := "org.scalablytyped.slinky"
name := "material__tab-bar"
version := "8.0.0-b95188"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "material__base" % "8.0.0-6c4191",
  "org.scalablytyped.slinky" %%% "material__ripple" % "8.0.0-8be78a",
  "org.scalablytyped.slinky" %%% "material__tab" % "8.0.0-0a14b1",
  "org.scalablytyped.slinky" %%% "material__tab-indicator" % "8.0.0-96ad0b",
  "org.scalablytyped.slinky" %%% "material__tab-scroller" % "8.0.0-65d842",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
