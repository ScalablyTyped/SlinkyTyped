organization := "org.scalablytyped.slinky"
name := "ethersproject__abi"
version := "5.0.0-beta.153-dab04d"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "ethersproject__bignumber" % "5.0.0-beta.139-547bbd",
  "org.scalablytyped.slinky" %%% "ethersproject__bytes" % "5.0.0-beta.138-665e8c",
  "org.scalablytyped.slinky" %%% "ethersproject__properties" % "5.0.0-beta.141-af9203",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
