organization := "org.scalablytyped.slinky"
name := "ember-data"
version := "3.1-dt-20191126Z-9470c6"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "ember" % "3.1-dt-20191015Z-927b73",
  "org.scalablytyped.slinky" %%% "ember__application" % "3.0-dt-20191126Z-1f45c8",
  "org.scalablytyped.slinky" %%% "ember__array" % "3.0-dt-20191126Z-4051a8",
  "org.scalablytyped.slinky" %%% "ember__component" % "3.0-dt-20191126Z-7b1c95",
  "org.scalablytyped.slinky" %%% "ember__controller" % "3.0-dt-20190503Z-03002b",
  "org.scalablytyped.slinky" %%% "ember__debug" % "3.0-dt-20191126Z-293ba0",
  "org.scalablytyped.slinky" %%% "ember__engine" % "3.0-dt-20191126Z-75db6d",
  "org.scalablytyped.slinky" %%% "ember__error" % "3.0-dt-20190213Z-c1dd41",
  "org.scalablytyped.slinky" %%% "ember__object" % "3.1-dt-20191126Z-93c205",
  "org.scalablytyped.slinky" %%% "ember__polyfills" % "3.0-dt-20191126Z-143bc1",
  "org.scalablytyped.slinky" %%% "ember__routing" % "3.0-dt-20191126Z-a7d2d7",
  "org.scalablytyped.slinky" %%% "ember__runloop" % "3.0-dt-20191126Z-e1fcdd",
  "org.scalablytyped.slinky" %%% "ember__service" % "3.0-dt-20190503Z-2571c9",
  "org.scalablytyped.slinky" %%% "ember__template" % "3.0-dt-20191126Z-7c089c",
  "org.scalablytyped.slinky" %%% "ember__test" % "3.0-dt-20191126Z-11807f",
  "org.scalablytyped.slinky" %%% "ember__utils" % "3.0-dt-20191126Z-a7d5f9",
  "org.scalablytyped.slinky" %%% "jquery" % "3.3-dt-20191126Z-c6d356",
  "org.scalablytyped.slinky" %%% "rsvp" % "4.0-dt-20190717Z-0975b6",
  "org.scalablytyped.slinky" %%% "sizzle" % "2.3-dt-20181006Z-dd2029",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        