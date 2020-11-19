organization := "org.scalablytyped.slinky"
name := "jest__globals"
version := "26.2.0-ad6de9"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "chalk" % "4.1.0-a6735e",
  "org.scalablytyped.slinky" %%% "expect" % "26.2.0-599c4f",
  "org.scalablytyped.slinky" %%% "istanbul-lib-coverage" % "2.0-dt-20200609Z-5d64c8",
  "org.scalablytyped.slinky" %%% "jest-diff" % "26.2.0-1f0582",
  "org.scalablytyped.slinky" %%% "jest-matcher-utils" % "26.2.0-eb62cb",
  "org.scalablytyped.slinky" %%% "jest-mock" % "24.9.0-ca12fd",
  "org.scalablytyped.slinky" %%% "jest__environment" % "26.2.0-ae3bd5",
  "org.scalablytyped.slinky" %%% "jest__types" % "24.9.0-9ce9dc",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
