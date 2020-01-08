organization := "org.scalablytyped.slinky"
name := "babel__standalone"
version := "7.1-dt-20191216Z-4bf897"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "babel__core" % "7.1-dt-20190904Z-b0235c",
  "org.scalablytyped.slinky" %%% "babel__generator" % "7.6-dt-20191210Z-60aabb",
  "org.scalablytyped.slinky" %%% "babel__parser" % "7.7.7-3fb863",
  "org.scalablytyped.slinky" %%% "babel__template" % "7.0-dt-20190213Z-fca9b0",
  "org.scalablytyped.slinky" %%% "babel__traverse" % "7.0-dt-20191119Z-8fcad7",
  "org.scalablytyped.slinky" %%% "babel__types" % "7.7.4-ec56ec",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        