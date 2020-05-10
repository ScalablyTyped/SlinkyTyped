organization := "org.scalablytyped.slinky"
name := "material__radio"
version := "0.35-dt-20191126Z-c7b108"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "material__base" % "0.35-dt-20191126Z-f8744b",
  "org.scalablytyped.slinky" %%% "material__ripple" % "0.35-dt-20191126Z-097dde",
  "org.scalablytyped.slinky" %%% "material__selection-control" % "0.35-dt-20190213Z-9020bd",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
