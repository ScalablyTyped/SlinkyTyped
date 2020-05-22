organization := "org.scalablytyped.slinky"
name := "expect"
version := "24.9.0-04092d"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "chalk" % "2.4.2-3af11d",
  "org.scalablytyped.slinky" %%% "istanbul-lib-coverage" % "2.0-dt-20200515Z-86c123",
  "org.scalablytyped.slinky" %%% "jest-diff" % "24.9.0-073715",
  "org.scalablytyped.slinky" %%% "jest-matcher-utils" % "25.5.0-44b904",
  "org.scalablytyped.slinky" %%% "jest__types" % "24.9.0-311fa2",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
