organization := "org.scalablytyped.slinky"
name := "fast-glob"
version := "2.2.7-1c0a13"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "braces" % "3.0-dt-20190422Z-a9ce38",
  "org.scalablytyped.slinky" %%% "micromatch" % "4.0-dt-20200226Z-cd7169",
  "org.scalablytyped.slinky" %%% "mrmlnc__readdir-enhanced" % "2.2.1-fade7f",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
