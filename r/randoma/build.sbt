organization := "org.scalablytyped.slinky"
name := "randoma"
version := "1.3.0-22e366"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "color" % "3.0-dt-20200225Z-6e6db7",
  "org.scalablytyped.slinky" %%% "color-convert" % "1.9-dt-20191126Z-4e805e",
  "org.scalablytyped.slinky" %%% "color-name" % "1.1-dt-20190212Z-b941fb",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
