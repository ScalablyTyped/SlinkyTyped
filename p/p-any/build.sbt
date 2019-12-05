organization := "org.scalablytyped.slinky"
name := "p-any"
version := "2.1.0-01566f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "aggregate-error" % "3.0.1-f01691",
  "org.scalablytyped.slinky" %%% "p-cancelable" % "2.0.0-2e9e4f",
  "org.scalablytyped.slinky" %%% "p-some" % "4.1.0-5865b6",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821",
  "org.scalablytyped.slinky" %%% "type-fest" % "0.3.1-757396")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        