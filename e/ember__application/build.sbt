organization := "org.scalablytyped.slinky"
name := "ember__application"
version := "3.0-dt-20200328Z-a28468"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "ember__component" % "3.0-dt-20200328Z-aa6e6c",
  "org.scalablytyped.slinky" %%% "ember__controller" % "3.0-dt-20200328Z-abb6fd",
  "org.scalablytyped.slinky" %%% "ember__engine" % "3.0-dt-20200328Z-289f99",
  "org.scalablytyped.slinky" %%% "ember__object" % "3.1-dt-20200426Z-0ea7b9",
  "org.scalablytyped.slinky" %%% "ember__routing" % "3.0-dt-20200225Z-28b7a8",
  "org.scalablytyped.slinky" %%% "jquery" % "3.3-dt-20200427Z-d88135",
  "org.scalablytyped.slinky" %%% "rsvp" % "4.0-dt-20200225Z-f030d7",
  "org.scalablytyped.slinky" %%% "sizzle" % "2.3-dt-20181006Z-1b2bf8",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
