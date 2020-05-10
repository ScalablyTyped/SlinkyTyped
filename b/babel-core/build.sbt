organization := "org.scalablytyped.slinky"
name := "babel-core"
version := "6.25-dt-20200226Z-cf25dc"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "babel-generator" % "6.25-dt-20200226Z-249aea",
  "org.scalablytyped.slinky" %%% "babel-template" % "6.25-dt-20200226Z-f68ec3",
  "org.scalablytyped.slinky" %%% "babel-traverse" % "6.25-dt-20190212Z-df14fa",
  "org.scalablytyped.slinky" %%% "babel-types" % "7.0-dt-20190424Z-d7f84f",
  "org.scalablytyped.slinky" %%% "babylon" % "6.16-dt-20200226Z-1aee04",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
