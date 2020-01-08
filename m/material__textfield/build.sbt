organization := "org.scalablytyped.slinky"
name := "material__textfield"
version := "0.35-dt-20191126Z-5ab54e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "material__base" % "0.35-dt-20191126Z-acdc3a",
  "org.scalablytyped.slinky" %%% "material__floating-label" % "0.35-dt-20191126Z-f15096",
  "org.scalablytyped.slinky" %%% "material__line-ripple" % "0.35-dt-20191126Z-f58877",
  "org.scalablytyped.slinky" %%% "material__notched-outline" % "0.35-dt-20191126Z-6079b8",
  "org.scalablytyped.slinky" %%% "material__ripple" % "0.35-dt-20191126Z-873c94",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        