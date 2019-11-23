organization := "org.scalablytyped.slinky"
name := "express"
version := "4.17-dt-20191101Z-7db31d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.17-dt-20190819Z-300643",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20190322Z-b29b80",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20191115Z-481388",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20190205Z-ebf5f4",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191123Z-8ab09a",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-96a12c",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20190819Z-b9ffb8",
  "org.scalablytyped.slinky" %%% "std" % "3.7-317bd7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        