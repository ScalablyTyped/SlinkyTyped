organization := "org.scalablytyped.slinky"
name := "rx-lite-testing"
version := "4.0-dt-20200515Z-99500d"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "rx-core" % "4.0-dt-20200515Z-fa00c8",
  "org.scalablytyped.slinky" %%% "rx-lite" % "4.0-dt-20200515Z-41b981",
  "org.scalablytyped.slinky" %%% "rx-lite-virtualtime" % "4.0-dt-20200515Z-0e6061",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
