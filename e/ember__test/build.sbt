organization := "org.scalablytyped.slinky"
name := "ember__test"
version := "3.16-dt-20201028Z-4ced84"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "ember__application" % "3.16-dt-20201028Z-7722b6",
  "org.scalablytyped.slinky" %%% "ember__component" % "3.16-dt-20201103Z-338477",
  "org.scalablytyped.slinky" %%% "ember__controller" % "3.16-dt-20201118Z-529bd1",
  "org.scalablytyped.slinky" %%% "ember__engine" % "3.16-dt-20201028Z-21ce40",
  "org.scalablytyped.slinky" %%% "ember__object" % "3.12-dt-20201028Z-3524c0",
  "org.scalablytyped.slinky" %%% "ember__routing" % "3.16-dt-20201106Z-9f719c",
  "org.scalablytyped.slinky" %%% "ember__service" % "3.16-dt-20201028Z-d4d707",
  "org.scalablytyped.slinky" %%% "jquery" % "3.5-dt-20201028Z-7b4ce2",
  "org.scalablytyped.slinky" %%% "rsvp" % "4.0-dt-20201028Z-f308b4",
  "org.scalablytyped.slinky" %%% "sizzle" % "2.3-dt-20201002Z-da3788",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
