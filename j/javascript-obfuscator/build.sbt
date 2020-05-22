organization := "org.scalablytyped.slinky"
name := "javascript-obfuscator"
version := "0.18.8-9eefb5"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "chance" % "1.1-dt-20200515Z-be5adb",
  "org.scalablytyped.slinky" %%% "estraverse" % "0.0-unknown-dt-20200515Z-aed0b0",
  "org.scalablytyped.slinky" %%% "estree" % "0.0-unknown-dt-20200515Z-8cb760",
  "org.scalablytyped.slinky" %%% "inversify" % "5.0.1-3c5668",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
