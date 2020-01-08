organization := "org.scalablytyped.slinky"
name := "backbone_dot_marionette"
version := "3.3-dt-20190927Z-3ce4db"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "backbone" % "1.4-dt-20190619Z-04fb07",
  "org.scalablytyped.slinky" %%% "backbone_dot_radio" % "0.8-dt-20190619Z-23411a",
  "org.scalablytyped.slinky" %%% "jquery" % "3.3-dt-20191126Z-c6d356",
  "org.scalablytyped.slinky" %%% "sizzle" % "2.3-dt-20181006Z-dd2029",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43",
  "org.scalablytyped.slinky" %%% "underscore" % "1.9-dt-20191118Z-8df05b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        