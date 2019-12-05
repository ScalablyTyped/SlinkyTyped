organization := "org.scalablytyped.slinky"
name := "babelify"
version := "v7.3.0-dt-20190322Z-77c022"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "babel-core" % "6.25-dt-20190212Z-3e8afd",
  "org.scalablytyped.slinky" %%% "babel-generator" % "6.25-dt-20190212Z-9cb43b",
  "org.scalablytyped.slinky" %%% "babel-template" % "6.25-dt-20190212Z-b7dafb",
  "org.scalablytyped.slinky" %%% "babel-traverse" % "6.25-dt-20190212Z-fd49a8",
  "org.scalablytyped.slinky" %%% "babel-types" % "7.0-dt-20190424Z-00a294",
  "org.scalablytyped.slinky" %%% "babylon" % "6.16-dt-20190212Z-22f83e",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        