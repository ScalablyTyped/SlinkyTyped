organization := "org.scalablytyped.slinky"
name := "babel-plugin-macros"
version := "2.6-dt-20191016Z-38aade"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "babel__core" % "7.1-dt-20190904Z-4d6c2f",
  "org.scalablytyped.slinky" %%% "babel__generator" % "7.6-dt-20190924Z-b3803a",
  "org.scalablytyped.slinky" %%% "babel__parser" % "7.7.4-fc72f7",
  "org.scalablytyped.slinky" %%% "babel__template" % "7.0-dt-20190213Z-301386",
  "org.scalablytyped.slinky" %%% "babel__traverse" % "7.0-dt-20191119Z-cc2d84",
  "org.scalablytyped.slinky" %%% "babel__types" % "7.7.4-863336",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        