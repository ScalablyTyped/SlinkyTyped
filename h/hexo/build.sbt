organization := "org.scalablytyped.slinky"
name := "hexo"
version := "3.8-dt-20200225Z-83e68f"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "bunyan" % "1.8-dt-20200226Z-fbce10",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200226Z-196a23",
  "org.scalablytyped.slinky" %%% "hexo-util" % "0.6-dt-20190808Z-1cee8a",
  "org.scalablytyped.slinky" %%% "minimist" % "1.2.0-dt-20200225Z-349e1a",
  "org.scalablytyped.slinky" %%% "moment" % "2.24.0-25e9d0",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e",
  "org.scalablytyped.slinky" %%% "underscore" % "1.9-dt-20200225Z-3cf1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
