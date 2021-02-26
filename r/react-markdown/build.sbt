organization := "org.scalablytyped.slinky"
name := "react-markdown"
version := "5.0.3-3397f4"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.14-58bcb0",
  "org.scalablytyped.slinky" %%% "mdast" % "3.0-dt-20190907Z-23ff63",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-931d77",
  "org.scalablytyped.slinky" %%% "react" % "17.0-dt-20201121Z-9cde70",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "unified" % "8.4.2-6e0397",
  "org.scalablytyped.slinky" %%% "unist" % "2.0-dt-20190213Z-b876dc",
  "org.scalablytyped.slinky" %%% "vfile" % "4.2.0-6cc700",
  "org.scalablytyped.slinky" %%% "vfile-message" % "2.0.4-9e071c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
