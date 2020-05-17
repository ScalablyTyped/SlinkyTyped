organization := "org.scalablytyped.slinky"
name := "alex"
version := "8.1-dt-20200218Z-b130e1"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "unist" % "2.0-dt-20190213Z-5073d5",
  "org.scalablytyped.slinky" %%% "vfile" % "4.0.3-fa9acb",
  "org.scalablytyped.slinky" %%% "vfile-message" % "2.0.3-8a8d97")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
