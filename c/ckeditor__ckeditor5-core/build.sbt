organization := "org.scalablytyped.slinky"
name := "ckeditor__ckeditor5-core"
version := "11.0-dt-20200225Z-befd6a"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "ckeditor__ckeditor5-engine" % "11.0-dt-20200225Z-07c3af",
  "org.scalablytyped.slinky" %%% "ckeditor__ckeditor5-utils" % "10.2-dt-20200225Z-acc72c",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
