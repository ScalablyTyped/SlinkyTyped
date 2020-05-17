organization := "org.scalablytyped.slinky"
name := "ember-testing-helpers"
version := "0.0-unknown-dt-20200328Z-d86b2f"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "jquery" % "3.3-dt-20200427Z-6ecf75",
  "org.scalablytyped.slinky" %%% "rsvp" % "4.0-dt-20200225Z-9a27ef",
  "org.scalablytyped.slinky" %%% "sizzle" % "2.3-dt-20181006Z-61c165",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
