organization := "org.scalablytyped.slinky"
name := "ckeditor__ckeditor5-core"
version := "11.0-dt-20200515Z-23ed27"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "ckeditor__ckeditor5-engine" % "11.0-dt-20200515Z-6041fa",
  "org.scalablytyped.slinky" %%% "ckeditor__ckeditor5-utils" % "10.2-dt-20200515Z-33e023",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
