organization := "org.scalablytyped.slinky"
name := "markdown-it-anchor"
version := "4.0-dt-20181102Z-e15a2f"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "linkify-it" % "2.1.0-dt-20200225Z-41e43c",
  "org.scalablytyped.slinky" %%% "markdown-it" % "v10.0.0-dt-20200426Z-1ef834",
  "org.scalablytyped.slinky" %%% "mdurl" % "1.0-dt-20181017Z-a1a195",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
