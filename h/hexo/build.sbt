organization := "org.scalablytyped.slinky"
name := "hexo"
version := "3.8-dt-20200225Z-600ae7"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "bunyan" % "1.8-dt-20200226Z-1deb17",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200226Z-fe7436",
  "org.scalablytyped.slinky" %%% "hexo-util" % "0.6-dt-20190808Z-942e09",
  "org.scalablytyped.slinky" %%% "minimist" % "1.2.0-dt-20200225Z-e0ee53",
  "org.scalablytyped.slinky" %%% "moment" % "2.24.0-e19481",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "underscore" % "1.9-dt-20200225Z-0dfaca")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
