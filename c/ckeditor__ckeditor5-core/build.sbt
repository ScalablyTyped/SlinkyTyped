organization := "org.scalablytyped.slinky"
name := "ckeditor__ckeditor5-core"
version := "11.0-dt-20201003Z-875c94"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "ckeditor__ckeditor5-engine" % "11.0-dt-20200515Z-14f6ea",
  "org.scalablytyped.slinky" %%% "ckeditor__ckeditor5-utils" % "10.2-dt-20201003Z-088bc7",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
