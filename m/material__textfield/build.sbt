organization := "org.scalablytyped.slinky"
name := "material__textfield"
version := "0.35-dt-20191126Z-54d9f1"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "material__base" % "0.35-dt-20191126Z-599278",
  "org.scalablytyped.slinky" %%% "material__floating-label" % "0.35-dt-20191126Z-dc6e0f",
  "org.scalablytyped.slinky" %%% "material__line-ripple" % "0.35-dt-20191126Z-5bf5a5",
  "org.scalablytyped.slinky" %%% "material__notched-outline" % "0.35-dt-20191126Z-2ead42",
  "org.scalablytyped.slinky" %%% "material__ripple" % "0.35-dt-20191126Z-dca2fe",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
