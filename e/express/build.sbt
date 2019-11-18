organization := "org.scalablytyped.slinky"
name := "express"
version := "4.17-dt-20191101Z-4321d3"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.17-dt-20190819Z-0bf678",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20190322Z-6d07e4",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.16-dt-20191101Z-ce749e",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20190205Z-9ab92b",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191108Z-eb88fe",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-9a28a0",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20190819Z-5e1fac",
  "org.scalablytyped.slinky" %%% "std" % "3.7-41c436")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        