organization := "org.scalablytyped.slinky"
name := "babelify"
version := "v7.3.0-dt-20190322Z-2e1739"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "babel-core" % "6.25-dt-20190212Z-d0a90c",
  "org.scalablytyped.slinky" %%% "babel-generator" % "6.25-dt-20190212Z-c7b1e2",
  "org.scalablytyped.slinky" %%% "babel-template" % "6.25-dt-20190212Z-e7b009",
  "org.scalablytyped.slinky" %%% "babel-traverse" % "6.25-dt-20190212Z-bd55a1",
  "org.scalablytyped.slinky" %%% "babel-types" % "7.0-dt-20190424Z-4c84f3",
  "org.scalablytyped.slinky" %%% "babylon" % "6.16-dt-20190212Z-359dd7",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        