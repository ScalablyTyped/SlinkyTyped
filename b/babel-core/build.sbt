organization := "org.scalablytyped.slinky"
name := "babel-core"
version := "6.25-dt-20200226Z-3bed32"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "babel-generator" % "6.25-dt-20200226Z-39a72a",
  "org.scalablytyped.slinky" %%% "babel-template" % "6.25-dt-20200226Z-513363",
  "org.scalablytyped.slinky" %%% "babel-traverse" % "6.25-dt-20190212Z-0a7cc0",
  "org.scalablytyped.slinky" %%% "babel-types" % "7.0-dt-20190424Z-21d6e2",
  "org.scalablytyped.slinky" %%% "babylon" % "6.16-dt-20200226Z-0a39b5",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
