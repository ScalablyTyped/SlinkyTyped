organization := "org.scalablytyped.slinky"
name := "ckeditor__ckeditor5-core"
version := "11.0-dt-20200225Z-f1ecb1"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "ckeditor__ckeditor5-engine" % "11.0-dt-20200225Z-92aad3",
  "org.scalablytyped.slinky" %%% "ckeditor__ckeditor5-utils" % "10.2-dt-20200225Z-91f102",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
