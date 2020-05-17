organization := "org.scalablytyped.slinky"
name := "restify-plugins"
version := "1.5-dt-20181015Z-336fad"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "bunyan" % "1.8-dt-20200226Z-1deb17",
  "org.scalablytyped.slinky" %%% "formidable" % "1.0.16-dt-20200225Z-c07e28",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "restify" % "8.4-dt-20200225Z-5f2f33",
  "org.scalablytyped.slinky" %%% "spdy" % "3.4-dt-20200227Z-6486db",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
