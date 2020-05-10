organization := "org.scalablytyped.slinky"
name := "cpy"
version := "7.3.0-975271"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "braces" % "3.0-dt-20190422Z-beae0f",
  "org.scalablytyped.slinky" %%% "fast-glob" % "2.2.7-e3c1ce",
  "org.scalablytyped.slinky" %%% "glob" % "7.1-dt-20200226Z-4b5c9a",
  "org.scalablytyped.slinky" %%% "globby" % "10.0.2-8ce345",
  "org.scalablytyped.slinky" %%% "micromatch" % "4.0-dt-20200226Z-8f5ffe",
  "org.scalablytyped.slinky" %%% "minimatch" % "3.0-dt-20200226Z-98e362",
  "org.scalablytyped.slinky" %%% "mrmlnc__readdir-enhanced" % "2.2.1-458279",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
