organization := "org.scalablytyped.slinky"
name := "ember-data__serializer"
version := "3.15-dt-20200225Z-7b84cd"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "ember" % "3.1-dt-20200225Z-8e8da9",
  "org.scalablytyped.slinky" %%% "ember-data" % "3.1-dt-20200227Z-77c1fe",
  "org.scalablytyped.slinky" %%% "ember__application" % "3.0-dt-20200106Z-b19039",
  "org.scalablytyped.slinky" %%% "ember__array" % "3.0-dt-20191126Z-fed9cf",
  "org.scalablytyped.slinky" %%% "ember__component" % "3.0-dt-20191126Z-b50024",
  "org.scalablytyped.slinky" %%% "ember__controller" % "3.0-dt-20190503Z-dc9cdb",
  "org.scalablytyped.slinky" %%% "ember__debug" % "3.0-dt-20191126Z-5087d1",
  "org.scalablytyped.slinky" %%% "ember__engine" % "3.0-dt-20191126Z-1b4e5e",
  "org.scalablytyped.slinky" %%% "ember__error" % "3.0-dt-20190213Z-f7f340",
  "org.scalablytyped.slinky" %%% "ember__object" % "3.1-dt-20200225Z-5c3027",
  "org.scalablytyped.slinky" %%% "ember__polyfills" % "3.0-dt-20191126Z-abe19f",
  "org.scalablytyped.slinky" %%% "ember__routing" % "3.0-dt-20200225Z-2afbb5",
  "org.scalablytyped.slinky" %%% "ember__runloop" % "3.0-dt-20191126Z-2aac0c",
  "org.scalablytyped.slinky" %%% "ember__service" % "3.0-dt-20190503Z-e63270",
  "org.scalablytyped.slinky" %%% "ember__template" % "3.0-dt-20191126Z-dd895b",
  "org.scalablytyped.slinky" %%% "ember__test" % "3.0-dt-20191126Z-2890b4",
  "org.scalablytyped.slinky" %%% "ember__utils" % "3.0-dt-20200225Z-4d2ee2",
  "org.scalablytyped.slinky" %%% "jquery" % "3.3-dt-20200225Z-c4678b",
  "org.scalablytyped.slinky" %%% "rsvp" % "4.0-dt-20200225Z-b4c03f",
  "org.scalablytyped.slinky" %%% "sizzle" % "2.3-dt-20181006Z-615858",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
