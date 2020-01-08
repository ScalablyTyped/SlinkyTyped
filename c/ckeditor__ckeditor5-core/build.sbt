organization := "org.scalablytyped.slinky"
name := "ckeditor__ckeditor5-core"
version := "11.0-dt-20190228Z-a09188"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "ckeditor__ckeditor5-engine" % "11.0-dt-20190228Z-f65c8c",
  "org.scalablytyped.slinky" %%% "ckeditor__ckeditor5-utils" % "10.2-dt-20190228Z-a86ee4",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        