organization := "org.scalablytyped.slinky"
name := "material__form-field"
version := "0.35-dt-20191126Z-9a198a"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "material__base" % "0.35-dt-20191126Z-599278",
  "org.scalablytyped.slinky" %%% "material__ripple" % "0.35-dt-20191126Z-dca2fe",
  "org.scalablytyped.slinky" %%% "material__selection-control" % "0.35-dt-20190213Z-f9bc7a",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
