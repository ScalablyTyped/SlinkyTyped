organization := "org.scalablytyped.slinky"
name := "firebase__installations"
version := "0.3.6-9aa394"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "firebase__app-types" % "0.4.7-fa5f63",
  "org.scalablytyped.slinky" %%% "firebase__installations-types" % "0.2.2-35d213",
  "org.scalablytyped.slinky" %%% "firebase__util" % "0.2.33-595e5d",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        