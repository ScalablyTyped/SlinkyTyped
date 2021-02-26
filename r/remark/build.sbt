organization := "org.scalablytyped.slinky"
name := "remark"
version := "13.0.0-e7f074"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "mdast" % "3.0-dt-20190907Z-23ff63",
  "org.scalablytyped.slinky" %%% "mdast-util-from-markdown" % "0.8.1-9ea37a",
  "org.scalablytyped.slinky" %%% "micromark" % "2.10.1-2f294c",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "remark-parse" % "9.0.0-46eb65",
  "org.scalablytyped.slinky" %%% "remark-stringify" % "8.1.1-939a21",
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
