organization := "org.scalablytyped.slinky"
name := "ember-test-helpers"
version := "1.0-dt-20191003Z-a1ba15"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "ember" % "3.1-dt-20191015Z-96a88e",
  "org.scalablytyped.slinky" %%% "ember__application" % "3.0-dt-20191126Z-d87f56",
  "org.scalablytyped.slinky" %%% "ember__array" % "3.0-dt-20191126Z-e1ff0e",
  "org.scalablytyped.slinky" %%% "ember__component" % "3.0-dt-20191126Z-7761a9",
  "org.scalablytyped.slinky" %%% "ember__controller" % "3.0-dt-20190503Z-be594a",
  "org.scalablytyped.slinky" %%% "ember__debug" % "3.0-dt-20191126Z-595246",
  "org.scalablytyped.slinky" %%% "ember__engine" % "3.0-dt-20191126Z-31df1b",
  "org.scalablytyped.slinky" %%% "ember__error" % "3.0-dt-20190213Z-e3da55",
  "org.scalablytyped.slinky" %%% "ember__object" % "3.1-dt-20191126Z-95ffcb",
  "org.scalablytyped.slinky" %%% "ember__polyfills" % "3.0-dt-20191126Z-143bc1",
  "org.scalablytyped.slinky" %%% "ember__routing" % "3.0-dt-20191126Z-15bd06",
  "org.scalablytyped.slinky" %%% "ember__runloop" % "3.0-dt-20191126Z-85ee3d",
  "org.scalablytyped.slinky" %%% "ember__service" % "3.0-dt-20190503Z-e83254",
  "org.scalablytyped.slinky" %%% "ember__template" % "3.0-dt-20191126Z-7c089c",
  "org.scalablytyped.slinky" %%% "ember__test" % "3.0-dt-20191126Z-033581",
  "org.scalablytyped.slinky" %%% "ember__utils" % "3.0-dt-20191126Z-aad686",
  "org.scalablytyped.slinky" %%% "jquery" % "3.3-dt-20191126Z-ae0751",
  "org.scalablytyped.slinky" %%% "rsvp" % "4.0-dt-20190717Z-4a377a",
  "org.scalablytyped.slinky" %%% "sizzle" % "2.3-dt-20181006Z-c4cdb0",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        