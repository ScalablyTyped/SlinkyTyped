organization := "org.scalablytyped.slinky"
name := "ember__routing"
version := "3.0-dt-20191126Z-a7d2d7"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "ember__component" % "3.0-dt-20191126Z-7b1c95",
  "org.scalablytyped.slinky" %%% "ember__controller" % "3.0-dt-20190503Z-03002b",
  "org.scalablytyped.slinky" %%% "ember__object" % "3.1-dt-20191126Z-93c205",
  "org.scalablytyped.slinky" %%% "jquery" % "3.3-dt-20191126Z-c6d356",
  "org.scalablytyped.slinky" %%% "rsvp" % "4.0-dt-20190717Z-0975b6",
  "org.scalablytyped.slinky" %%% "sizzle" % "2.3-dt-20181006Z-dd2029",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        