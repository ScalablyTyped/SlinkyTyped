organization := "org.scalablytyped.slinky"
name := "express"
version := "4.17-dt-20191101Z-51baa9"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.17-dt-20190819Z-98f061",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20190322Z-34602c",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.16-dt-20191101Z-595890",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20190205Z-943153",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191108Z-ac59bd",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-4d91b5",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20190819Z-3f6e89",
  "org.scalablytyped.slinky" %%% "std" % "3.7-5d968d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        