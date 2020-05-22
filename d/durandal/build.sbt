organization := "org.scalablytyped.slinky"
name := "durandal"
version := "2.1.0-dt-20200515Z-0f6300"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "jquery" % "3.3-dt-20200515Z-fefef8",
  "org.scalablytyped.slinky" %%% "knockout" % "v3.4.0-dt-20200515Z-91fbb9",
  "org.scalablytyped.slinky" %%% "sizzle" % "2.3-dt-20200515Z-0b0d10",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
