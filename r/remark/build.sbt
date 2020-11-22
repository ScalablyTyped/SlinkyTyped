organization := "org.scalablytyped.slinky"
name := "remark"
version := "13.0.0-2458b9"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "mdast" % "3.0-dt-20190907Z-a45fc3",
  "org.scalablytyped.slinky" %%% "mdast-util-from-markdown" % "0.8.1-289820",
  "org.scalablytyped.slinky" %%% "micromark" % "2.10.1-5d07ab",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "remark-parse" % "9.0.0-467934",
  "org.scalablytyped.slinky" %%% "remark-stringify" % "8.1.1-e7892a",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533",
  "org.scalablytyped.slinky" %%% "unified" % "8.4.2-80da83",
  "org.scalablytyped.slinky" %%% "unist" % "2.0-dt-20190213Z-bfeec5",
  "org.scalablytyped.slinky" %%% "vfile" % "4.2.0-75c973",
  "org.scalablytyped.slinky" %%% "vfile-message" % "2.0.4-c4af87")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
